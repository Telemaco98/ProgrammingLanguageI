package quest3;

import java.lang.Exception;

/**
 * Exception for signaling errors in archive input.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 21.07.2017
 */
public class InvalidInputException extends Exception {
	private String message;

	/**
	 * Constructs the Parametro Exeception object
	 * @param mensage  The mensage
	 */
	public InvalidInputException (String message) {
		super(message);
		this.message = message;
	}

	/**
	 * Gets the mensage.
	 * @return mensage - The mensage.
	 */
	public String getMessage() {
		return message;
	}
}