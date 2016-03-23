package model.dto;

import java.util.Date;

import jamp.model.TicketState;

public class TicketInfo {
	
	private String departureCity;
	private String arrivalCity;
	private Date departureDate;
	private Date arrivaldate;
	private Integer cost;
	private TicketState state;	
	
	public TicketInfo() {
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
}
