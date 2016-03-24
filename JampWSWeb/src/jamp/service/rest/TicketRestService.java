package jamp.service.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jamp.request.ReserveRequest;
import jamp.request.TicketInfoRequest;
import jamp.response.ReserveResponse;
import jamp.response.TicketResponse;
import jamp.response.TicketinfoResponse;
import jamp.service.TicketServiceImpl;

@Path("/")
public class TicketRestService {

	private TicketServiceImpl service = new TicketServiceImpl();
	
	@POST
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/plain/postTicket")
	public ReserveResponse reserveTicket(ReserveRequest request) {
		return service.reserveTicket(request);
	}
	
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/json/postTicket")
	public ReserveResponse reserveTicketJSON(ReserveRequest request) {
		return service.reserveTicket(request);
	}
	
	@PUT
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/plain/payForTicket")
	public TicketResponse payForTicket(long ticketId) {
		return service.payForTicket(ticketId);
	}
	
	@PUT
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/xml/payForTicket")
	public TicketResponse payForTicketXML(long ticketId) {
		return service.payForTicket(ticketId);
	}
	
	@DELETE
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/xml/returnTicket")
	public TicketResponse returnTicket(long ticketId) {
		return service.returnTicket(ticketId);
	}

	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/plain/get")
	public TicketinfoResponse getTicketInfo(@QueryParam("id") long ticketid) {
		TicketInfoRequest request = new TicketInfoRequest();
		request.setTicketId(ticketid);
		return service.getTicketInfo(request);
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/json/get")
	public TicketinfoResponse getTicketInfoJSON(@QueryParam("id") long ticketid) {
		TicketInfoRequest request = new TicketInfoRequest();
		request.setTicketId(ticketid);
		return service.getTicketInfo(request);
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/xml/get")
	public TicketinfoResponse getTicketInfoXML(@QueryParam("id") long ticketid) {
		TicketInfoRequest request = new TicketInfoRequest();
		request.setTicketId(ticketid);
		return service.getTicketInfo(request);
	}

}
