package quest2;

/**
 * Class that represents a Square. 
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Square extends Rectangle {

	/**
	 * Default Constructor
	 */
	public Square () {
		super();
	}
	
	/**
	 * Build an object Rectangle
	 * 
	 * @param side float 	- The side of the rectangle
	 * @param height float 	- The height of the rectangle
	 */
	public Square (float side) {
		if(side >= 0) {
			super.setSide(side);
			super.setHeight(side);
		} else setSide (side);
	}
	
	/**
	 * Change the value of the side field of the rectangle
	 * @param side
	 */
	public void setSide (float side) {
		if(side >= 0) {
			super.setSide(side);
			super.setHeight(side);
		}
	}
	
	/**
	 * Change the value of the height field of the rectangle
	 * @param height
	 */
	public void setHeight (float height) {
		if(height >= 0) {
			super.setHeight(height);
			super.setSide(height);
		}
	}
	
	/**
	 * Show the value fields of the Square
	 */
	public void print () {
		System.out.println(" Side: " + getSide());
	}
}
