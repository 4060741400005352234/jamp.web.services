package main;

import jamp.service.TicketInfoRequest;
import jamp.service.TicketService;
import jamp.service.TicketServiceService;
import jamp.service.TicketinfoResponse;

public class Main {
	
	public static void main(String[] args) {
		TicketServiceService service = new TicketServiceService();
		TicketService port = service.getTicketServicePort();
		
		TicketInfoRequest reauest = new TicketInfoRequest();
		reauest.setTicketId(275);
		
		TicketinfoResponse response = port.getTicketInfo(reauest);
		
		System.out.println("Response data:");
		System.out.println("Arrival city: " + response.getTicketInfo().getArrivalCity());
		System.out.println("Ticket state: " + response.getTicketInfo().getState());
		
	}

}