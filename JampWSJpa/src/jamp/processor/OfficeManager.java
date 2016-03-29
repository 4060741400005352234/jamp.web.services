package jamp.processor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import jamp.dao.impl.EmployeeDao;
import jamp.dao.impl.ProjectDao;
import jamp.dao.impl.UnitDao;
import jamp.model.Employee;
import jamp.model.Project;
import jamp.model.Unit;
import jamp.util.JPAUtil;

public class OfficeManager {

	private EntityManagerFactory emf;

	public OfficeManager() {
		emf = JPAUtil.getEntityManagerFactory();
	}

	public long hireEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		try {
			return new EmployeeDao(em).save(employee);
		} finally {
			em.close();
		}
	}

	public void deleteEmployee(long employeeId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EmployeeDao employeeDao = new EmployeeDao(em);
		try {
			Employee employee = employeeDao.get(employeeId);
			if (employee != null) {
				employeeDao.remove(employee);
			} else {
				throw new Exception("Employee with ID - " + employeeId + " does not exists.");
			}
		} finally {
			em.close();
		}
	}

	public List<Project> getAllProjects() {
		EntityManager em = emf.createEntityManager();
		try {
			return new ProjectDao(em).getAll();
		} finally {
			em.close();
		}
	}

	public void setUnitForEmployee(long unitId, long employeeId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EmployeeDao employeeDao = new EmployeeDao(em);
		try {
			Unit unit = new UnitDao(em).get(unitId);
			if (unit != null) {
				Employee employee = employeeDao.get(employeeId);
				if (employee != null) {
					employee.setUnit(unit);
					unit.getEployees().add(employee);
					employeeDao.update(employee);
				} else {
					throw new Exception("Employee with ID - " + employeeId + " does not exists.");
				}
			} else {
				throw new Exception("Unit with ID - " + unitId + " does not exists.");
			}
		} finally {
			em.close();
		}
	}

	public void stuffEmployeeToProject(long projectId, long employeeId) throws Exception {
		EntityManager em = emf.createEntityManager();
		EmployeeDao employeeDao = new EmployeeDao(em);
		try {
			Project project = new ProjectDao(em).get(projectId);
			if (project != null) {
				Employee employee = employeeDao.get(employeeId);
				if (employee != null) {
					employee.getProjects().add(project);
					employeeDao.update(employee);
				} else {
					throw new Exception("Employee with ID - " + employeeId + " does not exists.");
				}
			} else {
				throw new Exception("Project with ID - " + projectId + " does not exists.");
			}
		} finally {
			em.close();
		}
	}

	public long createUnit(Unit unit) {
		EntityManager em = emf.createEntityManager();
		try {
			return new UnitDao(em).save(unit);
		} finally {
			em.close();
		}
	}

	public long createProject(Project project) {
		EntityManager em = emf.createEntityManager();
		try {
			return new ProjectDao(em).save(project);
		} finally {
			em.close();
		}
	}
}
