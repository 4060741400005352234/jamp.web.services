package jamp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jamp.dao.AbstractDao;
import jamp.model.Project;
import jamp.model.Ticket;

public class ProjectDao implements AbstractDao<Project>{
	
	private EntityManager em;

	public ProjectDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public long save(Project object) {
		EntityTransaction etr = em.getTransaction();
		etr.begin();

		em.persist(object);

		etr.commit();
		return object.getId();
	}

	@Override
	public Project get(long id) {
		Project project = em.find(Project.class, id);
		return project;
	}

	@Override
	public List<Project> getAll() {
		List<Project> projects = em.createQuery("From Project").getResultList();
		return projects;
	}

	@Override
	public void update(Project object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Project object) {
		// TODO Auto-generated method stub
		
	}

}
