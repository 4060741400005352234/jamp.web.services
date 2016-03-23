package jamp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import jamp.dao.AbstractDao;
import jamp.model.Passanger;
import jamp.util.JPAUtil;

public class PassangerDao implements AbstractDao<Passanger> {
	
	private EntityManager em;
	
	public PassangerDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public long save(Passanger object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		em.persist(object);

		etr.commit();
		return object.getId();
	}

	@Override
	public Passanger get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passanger> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Passanger object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Passanger object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();
		
		em.refresh(object);
		em.remove(object);
		
		etr.commit();			
	}

}
