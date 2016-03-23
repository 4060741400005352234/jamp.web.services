package jamp.processor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import jamp.dao.AbstractDao;
import jamp.dao.impl.PassangerDao;
import jamp.dao.impl.TicketDao;
import jamp.exception.NonExistentTicketException;
import jamp.exception.TicketStateException;
import jamp.model.Passanger;
import jamp.model.Ticket;
import jamp.model.TicketState;
import jamp.util.JPAUtil;

public class TicketProcessor {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public TicketProcessor() {
		emf = JPAUtil.getEntityManagerFactory();
		em = emf.createEntityManager();
	}

	public long reservTicket(Ticket ticket, Passanger passanger) {
		ticket.setState(TicketState.RESERVED);
		ticket.setPassanger(passanger);
		passanger.setTicket(ticket);
		new PassangerDao(em).save(passanger);
		return ticket.getId();
	}

	public Ticket getTicket(long id) {
		return new TicketDao(em).get(id);
	}

	public void payForTicket(long id) throws TicketStateException, NonExistentTicketException {
		AbstractDao<Ticket> ticketDao = new TicketDao(em);
		Ticket ticket = ticketDao.get(id);
		if (ticket == null) {
			throw new NonExistentTicketException("Ticket with id " + id + " is not exist.");
		}
		if (TicketState.RESERVED.equals(ticket.getState())) {
			ticket.setState(TicketState.PAID);
			ticketDao.update(ticket);
		} else {
			throw new TicketStateException("Ticket was not reserved.");
		}		
	}

	public void returnTicket(long id) throws NonExistentTicketException {
		Ticket ticket = new TicketDao(em).get(id);
		if (ticket == null) {
			throw new NonExistentTicketException("Ticket with id " + id + " is not exist.");
		}
		Passanger passenger = ticket.getPassanger();
		new PassangerDao(em).remove(passenger);
	}

}
