package jamp.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jamp.model.Ticket;
import jamp.processor.TicketProcessor;
import jamp.response.TicketinfoResponse;
import model.mapping.TicketInfoMapper;

@Path("/")
public class TicketRestService {

	private TicketProcessor processor = new TicketProcessor();

	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/plain/{id: \\d+}")
	public TicketinfoResponse getTicketInfo(@PathParam("id") long ticketid) {
		TicketinfoResponse response = new TicketinfoResponse();

		Ticket ticket = processor.getTicket(ticketid);
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));

		return response;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/json/{id: \\d+}")
	public TicketinfoResponse getTicketInfoJSON(@PathParam("id") long ticketid) {
		TicketinfoResponse response = new TicketinfoResponse();

		Ticket ticket = processor.getTicket(ticketid);
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));

		return response;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/xml/{id: \\d+}")
	public TicketinfoResponse getTicketInfoXML(@PathParam("id") long ticketid) {
		TicketinfoResponse response = new TicketinfoResponse();

		Ticket ticket = processor.getTicket(ticketid);
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));

		return response;
	}

}
