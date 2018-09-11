package quest2;

import java.lang.Exception;

/**
 * Exception for signaling errors in calculus.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 18.07.2017
 */
public class CalculusException extends Exception {
	private String message;

	/**
	 * Constructs the Parametro Exeception object
	 * @param mensage  The mensage
	 */
	public CalculusException (String message) {
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