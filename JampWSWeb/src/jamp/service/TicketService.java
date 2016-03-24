package jamp.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import jamp.request.ReserveRequest;
import jamp.request.TicketInfoRequest;
import jamp.response.ReserveResponse;
import jamp.response.TicketResponse;
import jamp.response.TicketinfoResponse;

@WebService
public class TicketService {
	
	private TicketServiceImpl service = new TicketServiceImpl();

	@WebMethod
	public ReserveResponse reserveTicket(ReserveRequest request) {
		return service.reserveTicket(request);
	}
	
	@WebMethod
	public TicketinfoResponse getTicketInfo(TicketInfoRequest request) {		
		return service.getTicketInfo(request);
	}
	
	@WebMethod
	public TicketResponse payForTicket(long ticketId) {
		return service.payForTicket(ticketId);
	}
	
	@WebMethod
	public TicketResponse returnTicket(long ticketId) {
		return service.returnTicket(ticketId);
	}

}
