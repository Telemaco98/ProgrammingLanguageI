package quest2;

/**
 * Class that represents a Circle. The fields of a circle is: radius;
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Circle extends Form{
	private float radius; /** < The circle radius **/
	
	/**
	 * Default Constructor
	 */
	public Circle () {
		radius = 0;
	}
	
	/**
	 * Build an object Circle with the following parameters
	 * @param radius = The radius size of the circle
	 */
	public Circle (float radius) {
		if(radius >= 0) this.radius = radius;
		else radius = 0;
	}
	
	/**
	 * Return the radius size of the rectangle
	 * @return radius
	 */
	public float getRadius () {
		return radius;
	}
	
	/**
	 * Change the value of the field radius
	 * @param radius
	 */
	public void setRadius (float radius) {
		if(radius >= 0) this.radius = radius;
	}

	/**
	 * Calculate the area of the circle
	 * @return area 
	 */
	public float calculateArea() {
		float area = (float) (Math.PI * Math.pow(radius, 2));
		return area;
	}

	/**
	 * Calculate the perimeter of the circle
	 * @return perimeter
	 */
	public float calculatePerimeter() {
		float perimeter = (float) (2 * Math.PI * radius);
		return perimeter;
	}
	
	
	/**
	 * Show the value fields of the Circle
	 */
	public void print() {
		System.out.println(" Radius: " + radius);
	}
	
}
