package quest1;

import java.lang.Exception;

/**
 * Exception for signaling parametro errors.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 18.07.2017
 */
public class ParametroException extends Exception {
	private String message;

	/**
	 * Constructs the Parametro Exeception object
	 * @param mensage  The mensage
	 */
	public ParametroException (String message) {
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