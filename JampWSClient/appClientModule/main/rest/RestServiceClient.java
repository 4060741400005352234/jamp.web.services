package main.rest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.representation.Form;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import jamp.service.PassangerInfo;
import jamp.service.ReserveRequest;
import jamp.service.ReserveResponse;
import jamp.service.TicketInfo;
import jamp.service.TicketinfoResponse;
import jamp.util.RestClientUtil;

public class RestServiceClient {

	private static final String baseUrl = "http://localhost:8080/JampWSWeb/ticketRestService";

	public static void main(String[] args) {
		new RestServiceClient().demo();
	}

	private void demo() {
		Client client = Client.create();
		client.setFollowRedirects(true);

		postDemo(client);
		getTicketInfoXML(client);
		getTicketInfoJSON(client);
		getTicketInfoPlain(client);
	}

	private void getTicketInfoXML(Client client) {
		WebResource resource = client.resource(baseUrl + "/xml/get?id=275");
		String response = resource.accept(MediaType.APPLICATION_XML_TYPE).get(String.class);
		report("GET one in XML:\n", response);
	}

	private void getTicketInfoJSON(Client client) {
		WebResource resource = client.resource(baseUrl + "/json/get?id=379");
		String response = resource.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);

		TicketinfoResponse obj = RestClientUtil.mapToObject(TicketinfoResponse.class, response);

		report("GET one in XML:\n", response);
		System.out.println("RESPONSE DATA: " + obj.getTicketInfo().getArrivalCity());
	}

	private void getTicketInfoPlain(Client client) {
		WebResource resource = client.resource(baseUrl + "/plain/get?id=275");
		String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).get(String.class);
		report("GET one in XML:\n", response);
	}

	private void postDemo(Client client) {
		WebResource resource = client.resource(baseUrl + "/json/postTicket");
		ReserveRequest req = RestClientUtil.getTestReserveRequest();
		String jsonRequest = RestClientUtil.mapObjectToJSON(req);

		String jsonResponse = resource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
				.post(String.class, jsonRequest);

		ReserveResponse obj = RestClientUtil.mapToObject(ReserveResponse.class, jsonResponse);
		report("GET one in XML:\n", jsonResponse);
		System.out.println("RESPONSE DATA: " + obj.getTicketId());
	}

	private void report(String msg, String response) {
		System.out.println("\n" + msg + response);
	}
}
