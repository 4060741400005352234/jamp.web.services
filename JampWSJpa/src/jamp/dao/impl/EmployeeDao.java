package jamp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jamp.dao.AbstractDao;
import jamp.model.Employee;

public class EmployeeDao implements AbstractDao<Employee> {
	
	private EntityManager em;
	
	public EmployeeDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public long save(Employee object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		em.persist(object);

		etr.commit();
		return object.getId();
	}

	@Override
	public Employee get(long id) {
		Employee employee = em.find(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();
		
		em.merge(object);
		
		etr.commit();		
	}

	@Override
	public void remove(Employee object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();
		
		em.refresh(object);
		em.remove(object);
		
		etr.commit();				
	}


}
