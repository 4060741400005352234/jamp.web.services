package jamp.response;

import javax.xml.bind.annotation.XmlRootElement;

import model.dto.TicketInfo;

@XmlRootElement(name = "ticketinfoResponse")
public class TicketinfoResponse {
	
	private TicketInfo ticketInfo;
	
	public TicketinfoResponse() {}

	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	@Override
	public String toString() {
		return "TicketinfoResponse [ticketInfo=" + ticketInfo + "]";
	}	

}
