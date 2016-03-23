package jamp.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PASSANGER")
public class Passanger {
	
	@Id 
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURE_NAME")
	private String sureName;
	
	@Column(name = "PATRONYMIC")
	private String patronymic;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@OneToOne(mappedBy="passanger", cascade=CascadeType.ALL, orphanRemoval=true)
	private Ticket ticket;
	
	public Passanger() {}	
	
	public Passanger(String name, String sureName, String patronymic, Date dateOfBirth) {
		super();
		this.name = name;
		this.sureName = sureName;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
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
	
	public String getSureName() {
		return sureName;
	}
	
	public void setSureName(String sureName) {
		this.sureName = sureName;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}		
}
