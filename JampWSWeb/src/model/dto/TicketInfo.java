package model.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import jamp.model.TicketState;

@XmlRootElement(name = "ticketInfo")
public class TicketInfo {
	
	private String departureCity;
	private String arrivalCity;
	private Date departureDate;
	private Date arrivaldate;
	private Integer cost;
	private TicketState state;	
	
	public TicketInfo() {
	}

	@XmlElement
	public String getDepartureCity() {
		return departureCity;
	}
	
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	
	@XmlElement
	public String getArrivalCity() {
		return arrivalCity;
	}
	
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	@XmlElement
	public Date getDepartureDate() {
		return departureDate;
	}
	
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	
	@XmlElement
	public Date getArrivaldate() {
		return arrivaldate;
	}
	
	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	
	@XmlElement
	public Integer getCost() {
		return cost;
	}
	
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	@XmlElement
	public TicketState getState() {
		return state;
	}
	
	public void setState(TicketState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TicketInfo [departureCity=" + departureCity + ", arrivalCity=" + arrivalCity + ", departureDate="
				+ departureDate + ", arrivaldate=" + arrivaldate + ", cost=" + cost + ", state=" + state + "]";
	}	
	
}
