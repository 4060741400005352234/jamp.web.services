package jamp.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "SALARY")
	private BigInteger salary;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "STATUS")
	private EmployeeStatus status;

	@Embedded
	private Address address;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "PERSON_INFO_ID")
	private PersonalInfo personalInfo;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "PROJECT_EMPLOYEE", joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
	private List<Project> projects;
	
	@ManyToOne
	@JoinColumn(name = "UNIT_ID")
	private Unit unit;

	public Employee() {
	}

	public Employee(BigInteger salary, EmployeeStatus status) {
		super();
		this.salary = salary;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getSalary() {
		return salary;
	}

	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}

	public EmployeeStatus getStatus() {
		return status;
	}

	public void setStatus(EmployeeStatus status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public List<Project> getProjects() {
		if (projects == null) {
			return new ArrayList<Project>();
		}
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

}
