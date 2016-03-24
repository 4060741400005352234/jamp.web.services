package jamp.service;

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

public class TicketServiceImpl {
	
	private TicketProcessor processor = new TicketProcessor();
	
	public ReserveResponse reserveTicket(ReserveRequest request) {
		long result = processor.reservTicket(TicketInfoMapper.mapTicketInfo(request.getTicketInfo()),
				PassangerInfoMapper.mappassangerInfo(request.getPassangerInfo()));

		ReserveResponse response = new ReserveResponse();
		response.setTicketId(result);

		return response;
	}
	
	public TicketinfoResponse getTicketInfo(TicketInfoRequest request) {
		TicketinfoResponse response = new TicketinfoResponse();
		
		Ticket ticket = processor.getTicket(request.getTicketId());
		response.setTicketInfo(TicketInfoMapper.mapTicket(ticket));		
		
		return response;
	}
	
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
