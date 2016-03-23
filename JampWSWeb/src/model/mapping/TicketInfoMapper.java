package model.mapping;

import jamp.model.Ticket;
import model.dto.TicketInfo;

public class TicketInfoMapper {
	
	public static Ticket mapTicketInfo(TicketInfo ticketInfo) {
		if (ticketInfo == null) {
			return null;
		}
		Ticket result = new Ticket();
		
		result.setDepartureCity(ticketInfo.getDepartureCity());
		result.setArrivalCity(ticketInfo.getArrivalCity());
		result.setDepartureDate(ticketInfo.getDepartureDate());
		result.setArrivaldate(ticketInfo.getArrivaldate());
		result.setCost(ticketInfo.getCost());
		result.setState(ticketInfo.getState());		
		
		return result;		
	}
	
	public static TicketInfo mapTicket(Ticket ticket) {
		if (ticket == null) {
			return null;
		}
		TicketInfo result = new TicketInfo();
		
		result.setDepartureCity(ticket.getDepartureCity());
		result.setArrivalCity(ticket.getArrivalCity());
		result.setDepartureDate(ticket.getDepartureDate());
		result.setArrivaldate(ticket.getArrivaldate());
		result.setCost(ticket.getCost());
		result.setState(ticket.getState());	
		
		return result;
	}

}
