package jamp.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ticketResponse")
public class TicketResponse {
	
	private int result;
	private String description;
	
	public TicketResponse() {}

	@XmlElement
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TicketResponse [result=" + result + ", description=" + description + "]";
	}	
	
}
