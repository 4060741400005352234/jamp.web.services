package jamp.exception;

public class TicketStateException extends Exception {
	
	private static final long serialVersionUID = 2004869576278203611L;

	public TicketStateException() {}
	
	public TicketStateException(String message) {
		super(message);
	}
	
	public TicketStateException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
