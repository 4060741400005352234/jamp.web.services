package main.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.representation.Form;

public class RestServiceClient {

	private static final String baseUrl = "http://localhost:8080/JampWSWeb/ticketRestService";

	public static void main(String[] args) {
		new RestServiceClient().demo();
	}

	private void demo() {
		Client client = Client.create();
		client.setFollowRedirects(true);

		postDemo(client);

		//getTicketInfoXML(client);
		//getTicketInfoJSON(client);
		//getTicketInfoPlain(client);
		// deleteDemo(resource); // delete id = 32
	}

	private void getTicketInfoXML(Client client) {
		WebResource resource = client.resource(baseUrl + "/xml/get?id=275");
		String response = resource.accept(MediaType.APPLICATION_XML_TYPE).get(String.class);
		report("GET one in XML:\n", response);
	}

	private void getTicketInfoJSON(Client client) {
		WebResource resource = client.resource(baseUrl + "/json/get?id=275");
		String response = resource.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
		report("GET one in XML:\n", response);
	}

	private void getTicketInfoPlain(Client client) {
		WebResource resource = client.resource(baseUrl + "/plain/get?id=275");
		String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).get(String.class);
		report("GET one in XML:\n", response);
	}

	private void postDemo(Client client) {
		WebResource resource = client.resource(baseUrl + "/plain/postTicket");		
		
		Form form = new Form(); 
		String ticketInfoPart = "{"
				+ "\"departureCity\":\"karaganda\","
				+ "\"arrivalCity\":\"Kuzbas\","
				+ "\"departureDate\":1458638514000,"
				+ "\"arrivaldate\":1458724914000,"
				+ "\"cost\":1500,"
				+ "\"state\":\"RESERVED\"}";
		form.add("ticketInfo", ticketInfoPart);
		String passangerInfoPart = "{"
				+ "\"name\":\"Phill63\","
				+ "\"sureName\":\"Philips\"}";
		form.add("passangerInfo", passangerInfoPart);

		String response = resource.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).accept(MediaType.TEXT_PLAIN_TYPE)
				.post(String.class, form);
		report("POST:\n", response);
	}

	private void deleteDemo(WebResource resource) {
		String response = resource.accept(MediaType.TEXT_PLAIN_TYPE).delete(String.class);
		report("DELETE:\n", response);
	}

	private void report(String msg, String response) {
		System.out.println("\n" + msg + response);
	}
}
