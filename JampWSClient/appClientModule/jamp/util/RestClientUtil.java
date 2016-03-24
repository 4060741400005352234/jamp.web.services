package jamp.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jamp.service.PassangerInfo;
import jamp.service.ReserveRequest;
import jamp.service.TicketInfo;

public final class RestClientUtil {

	public static <T> T mapToObject(Class<T> objectClass, String jsonString) {
		T result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(jsonString, objectClass);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String mapObjectToJSON(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String reqStr = null;
		try {
			reqStr = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return reqStr;
	}

	public static ReserveRequest getTestReserveRequest() {
		ReserveRequest req = new ReserveRequest();
		TicketInfo ticketInfo = new TicketInfo();
		PassangerInfo passangerInfo = new PassangerInfo();
		req.setPassangerInfo(passangerInfo);
		req.setTicketInfo(ticketInfo);
		ticketInfo.setArrivalCity("MAGADAN");
		ticketInfo.setDepartureCity("SOCHI");
		ticketInfo.setCost(0);
		passangerInfo.setName("Palych");
		return req;
	}
}
