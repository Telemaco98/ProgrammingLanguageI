package quest2;

/**
 * Class that represents a Rectangle. The fields of a circle are: side 
 * and height.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Rectangle extends Form{
	private float side; 	/** < The side size of the rectangle */ 
	private float height;	/** < The height size of the rectangle */

	/**
	 * Build an object Rectangle
	 */
	public Rectangle () {
		side = 0;
		height = 0;
	}
	
	/**
	 * Build an object Rectangle
	 * 
	 * @param side float 	- The side of the rectangle
	 * @param height float 	- The height of the rectangle
	 */
	public Rectangle (float side, float height) {
		if(side >= 0) this.side = side;
		else this.side = 0;
		
		if(height >= 0) this.height = height;
		else this.height = 0;
	}	
	
	/**
	 * Return the side size of the rectangle
	 * @return side
	 */
	public float getSide () {
		return side;
	}
	
	/**
	 * Return the height size of the rectangle
	 * @return height
	 */
	public float getHeight () {
		return height;
	}
	
	/**
	 * Change the value of the side field of the rectangle
	 * @param side
	 */
	public void setSide (float side) {
		if(side >= 0) this.side = side;
	}
	
	/**
	 * Change the value of the height field of the rectangle
	 * @param height
	 */
	public void setHeight (float height) {
		if(height >= 0) this.height = height;
	}
	
	/**
	 * Calculate the area of the Rectangle
	 * @return side*height - The area 
	 */
	public float calculateArea() {
		return side*height;
	}
	
	/**
	 * Calculate the perimeter of the rectangle
	 * @return (2*side + 2*height) - The perimeter
	 */
	public float calculatePerimeter() {
		return (2*side + 2*height);
	}
	
	/**
	 * Show the value fields of the Rectangle
	 */
	public void print() {
		System.out.println(" Side: " + side);
		System.out.println(" Height: " + height);
	}
}
