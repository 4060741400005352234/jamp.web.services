package jamp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UNIT")
public class Unit {
	
	@Id 
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@OneToMany(mappedBy = "unit")
	private Set<Employee> eployees;
	
	public Unit() {}

	public Unit(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEployees() {
		if (eployees == null) {
			return new HashSet<Employee>();
		}
		return eployees;
	}

	public void setEployees(Set<Employee> eployees) {
		this.eployees = eployees;
	}
}
