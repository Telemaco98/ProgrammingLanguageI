package quest2;

/**
 * Class that represents a shape.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public abstract class Form {
	
	/**
	 * Abstract method to be implements for the children and It calculate the
	 * area of a Shape. 
	 */
	public abstract float calculateArea ();
	
	/**
	 * Abstract method to be implements for the children and It calculate the
	 * area of a Shape. 
	 */
	public abstract float calculatePerimeter ();
	
	/**
	 * Abstract method to be implements for the children and It show the fields 
	 * value of the forms
	 */
	public abstract void print();
}