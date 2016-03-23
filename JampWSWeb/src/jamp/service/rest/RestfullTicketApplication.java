package jamp.service.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/ticketRestService")
public class RestfullTicketApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(TicketRestService.class);
		return set;
	}
}
