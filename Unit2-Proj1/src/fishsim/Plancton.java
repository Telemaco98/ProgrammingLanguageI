package fishsim;
import java.awt.Color;

/**
 * This archive implements the plancton class.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 16.10.2017
 */
public class Plancton {
	private Color color;
	
	/**
	 * Constructs the object.
	 */
	public Plancton () {
		color = new Color (40, 70, 40);
	}

	/**
	 * Gets the color.
	 * @return color The color.
	 */
	public Color getColor () {
		return color;
	}
}