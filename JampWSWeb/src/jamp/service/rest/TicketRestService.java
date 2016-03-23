package jamp.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jamp.model.Ticket;
import jamp.processor.TicketProcessor;
import jamp.request.ReserveRequest;
import jamp.response.ReserveResponse;
import jamp.response.TicketinfoResponse;
import model.mapping.PassangerInfoMapper;
import model.mapping.TicketInfoMapper;

@Path("/")
public class TicketRestService {

	private TicketProcessor processor = new TicketProcessor();
	
	@POST
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/plain/postTicket")
	public ReserveResponse reserveTicket(ReserveRequest request) {
		long result = processor.reservTicket(TicketInfoMapper.mapTicketInfo(request.getTicketInfo()),
				PassangerInfoMapper.mappassangerInfo(request.getPassangerInfo()));

		ReserveResponse response = new ReserveResponse();
		response.setTicketId(result);

		return response;
	}

	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/plain/get")
	public TicketinfoResponse getTicketInfo(@QueryParam("id") long ticketid) {
		TicketinfoResponse response = new TicketinfoResponse();

		Ticket ticket = processor.getTicket(ticketid);
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));

		return response;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/json/get")
	public TicketinfoResponse getTicketInfoJSON(@QueryParam("id") long ticketid) {
		TicketinfoResponse response = new TicketinfoResponse();

		Ticket ticket = processor.getTicket(ticketid);
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));

		return response;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/xml/get")
	public TicketinfoResponse getTicketInfoXML(@QueryParam("id") long ticketid) {
		TicketinfoResponse response = new TicketinfoResponse();

		Ticket ticket = processor.getTicket(ticketid);
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));

		return response;
	}

}
