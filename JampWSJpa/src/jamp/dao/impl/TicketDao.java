package jamp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jamp.dao.AbstractDao;
import jamp.model.Ticket;

public class TicketDao implements AbstractDao<Ticket> {
	
	private EntityManager em;
	
	public TicketDao(EntityManager em) {
		this.em = em;		
	}

	@Override
	public long save(Ticket ticket) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		em.persist(ticket);

		etr.commit();
		return ticket.getId();
	}

	@Override
	public Ticket get(long id) {		
		Ticket ticket = em.find(Ticket.class, id);
		
		return ticket;
	}

	@Override
	public List<Ticket> getAll() {
		List<Ticket> tickets = em.createQuery("From Ticket").getResultList();
		
		return tickets;
	}

	@Override
	public void update(Ticket ticket) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();
		
		em.merge(ticket);
		
		etr.commit();
	}
	
	@Override
	public void remove(Ticket object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();
		
		em.refresh(object);
		em.remove(object);
		
		etr.commit();		
	}
}
