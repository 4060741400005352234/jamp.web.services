package jamp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jamp.dao.AbstractDao;
import jamp.model.Unit;

public class UnitDao implements AbstractDao<Unit> {

	private EntityManager em;

	public UnitDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public long save(Unit object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		em.persist(object);

		etr.commit();
		return object.getId();
	}

	@Override
	public Unit get(long id) {
		Unit unit = em.find(Unit.class, id);
		return unit;
	}

	@Override
	public List<Unit> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Unit object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Unit object) {
		// TODO Auto-generated method stub

	}

}
