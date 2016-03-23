package jamp.request;

import model.dto.PassangerInfo;
import model.dto.TicketInfo;

public class ReserveRequest {
	
	private TicketInfo ticketInfo;
	private PassangerInfo passangerInfo;
	
	public ReserveRequest() {}

	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public PassangerInfo getPassangerInfo() {
		return passangerInfo;
	}

	public void setPassangerInfo(PassangerInfo passangerInfo) {
		this.passangerInfo = passangerInfo;
	}	
}
