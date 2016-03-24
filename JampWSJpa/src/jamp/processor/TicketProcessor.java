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

	public TicketProcessor() {
		emf = JPAUtil.getEntityManagerFactory();
	}

	public long reservTicket(Ticket ticket, Passanger passanger) {
		EntityManager em = emf.createEntityManager();
		try {
			ticket.setState(TicketState.RESERVED);
			ticket.setPassanger(passanger);
			passanger.setTicket(ticket);
			new PassangerDao(em).save(passanger);
		} finally {
			em.close();
		}
		return ticket.getId();
	}

	public Ticket getTicket(long id) {
		EntityManager em = emf.createEntityManager();
		try {
			return new TicketDao(em).get(id);
		} finally {
			em.close();
		}
	}

	public void payForTicket(long id) throws TicketStateException, NonExistentTicketException {
		EntityManager em = emf.createEntityManager();
		try {
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
		} finally {
			em.close();
		}
	}

	public void returnTicket(long id) throws NonExistentTicketException {
		EntityManager em = emf.createEntityManager();
		try {
			Ticket ticket = new TicketDao(em).get(id);
			if (ticket == null) {
				throw new NonExistentTicketException("Ticket with id " + id + " is not exist.");
			}
			Passanger passenger = ticket.getPassanger();
			new PassangerDao(em).remove(passenger);
		} finally {
			em.close();
		}
	}

}
