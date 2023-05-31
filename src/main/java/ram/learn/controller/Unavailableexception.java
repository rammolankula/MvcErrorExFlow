package ram.learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code =HttpStatus.NOT_FOUND)
public class Unavailableexception extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Unavailableexception() {
		super();
	}
	public Unavailableexception(String message) {
		super(message);
	}
}
