package jamp.exception;

public class NonExistentTicketException extends Exception {
	
	private static final long serialVersionUID = -5742022430205203416L;

	public NonExistentTicketException() {}
	
	public NonExistentTicketException(String message) {
		super(message);
	}
	
	public NonExistentTicketException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
