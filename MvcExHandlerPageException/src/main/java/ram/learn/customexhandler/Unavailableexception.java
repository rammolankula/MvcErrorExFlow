package ram.learn.customexhandler;

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
