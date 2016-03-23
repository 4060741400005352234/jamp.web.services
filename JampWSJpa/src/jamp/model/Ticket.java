package jamp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TICKET")
public class Ticket {

	@Id 
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DEPARTURE_CITY")
	private String departureCity;
	
	@Column(name = "ARRIVE_CITY")
	private String arrivalCity;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEPARTURE_DATE")
	private Date departureDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ARRIVE_DATE")
	private Date arrivaldate;
	
	@Column(name = "COST")
	private Integer cost;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "STATE")
	private TicketState state;
	
	@OneToOne
	@JoinColumn(name="PASSANGER_ID") 
	private Passanger passanger;
	
	public Ticket() {}	

	public Ticket(String departureCity, String arrivalCity, Date departureDate, Date arrivaldate, int cost,
			TicketState state) {
		super();
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureDate = departureDate;
		this.arrivaldate = arrivaldate;
		this.cost = cost;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivaldate() {
		return arrivaldate;
	}

	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public TicketState getState() {
		return state;
	}

	public void setState(TicketState state) {
		this.state = state;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}
}
