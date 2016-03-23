package jamp.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import jamp.exception.NonExistentTicketException;
import jamp.exception.TicketStateException;
import jamp.model.Ticket;
import jamp.processor.TicketProcessor;
import jamp.request.ReserveRequest;
import jamp.request.TicketInfoRequest;
import jamp.response.ReserveResponse;
import jamp.response.TicketResponse;
import jamp.response.TicketinfoResponse;
import model.mapping.PassangerInfoMapper;
import model.mapping.TicketInfoMapper;

@WebService
public class TicketService {

	private TicketProcessor processor = new TicketProcessor();

	@WebMethod
	public ReserveResponse reserveTicket(ReserveRequest request) {
		long result = processor.reservTicket(TicketInfoMapper.mapTicketInfo(request.getTicketInfo()),
				PassangerInfoMapper.mappassangerInfo(request.getPassangerInfo()));

		ReserveResponse response = new ReserveResponse();
		response.setTicketId(result);

		return response;
	}
	
	@WebMethod
	public TicketinfoResponse getTicketInfo(TicketInfoRequest request) {
		TicketinfoResponse response = new TicketinfoResponse();
		
		Ticket ticket = processor.getTicket(request.getTicketId());
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));		
		
		return response;
	}
	
	@WebMethod
	public TicketResponse payForTicket(long ticketId) {
		TicketResponse response = new TicketResponse();
		try {
			processor.payForTicket(ticketId);
			response.setResult(0);
			response .setDescription("Ticket succesfully paid.");
		} catch (TicketStateException e) {
			response.setResult(1);
			response .setDescription(e.getMessage());
		} catch (NonExistentTicketException e) {
			response.setResult(1);
			response .setDescription(e.getMessage());
		}
		return response;
	}
	
	@WebMethod
	public TicketResponse returnTicket(long ticketId) {
		TicketResponse response = new TicketResponse();
		try {
			processor.returnTicket(ticketId);
			response.setResult(0);
			response .setDescription("Ticket succesfully returned.");
		} catch (NonExistentTicketException e) {
			response.setResult(1);
			response .setDescription(e.getMessage());
		}		
		return response;
	}

}
