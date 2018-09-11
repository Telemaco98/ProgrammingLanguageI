package quest1;

import java.util.Date;
import java.util.Scanner;

/**
 * Class to represent a soda. The class fields of a soda are flavor and 
 * amount of sugar.
 *
 * @author Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.08.2017
 */
public class Soda extends PerishableProduct {
	private String flavor; 	/** < Flavor of the soda */
	private double sugar;	/** < Sugar amount of the soda */

	/**
	 * Method that crate an object to represents a book without parameters
	 */
	public Soda () {
		super ();
		flavor = "";
		sugar = 0.0;
	}

	/**
	 * Method that crate an object to represents a soda
	 *
	 * @param id 			  int 	 - Parameter that represents the product id
	 * @param name            String - Parameter that represents the soda name
     * @param price           double - Parameter that represents the soda price
     * @param trademark       String - Parameter that represents the soda trademark
     * @param description     String - Parameter that represents the soda description
     * @param manufactureDate Date   - Parameter that represents the manufacture date of the soda
     * @param validity 	  	  Date   - Parameter that represents the validity date of the soda
	 * @param genre 	  	  String - Parameter that represents the genre of the soda
	 * @param flavor 		  String - Parameter that represents the flavor of the soda
	 * @param sugar 		  double - Parameter that represents the sugar amount in the soda
     */
	public Soda (int id, String name, double price, String trademark, String description, Date manufactureDate, Date validity, String genre, String flavor, double sugar) {
		super (id, name, price, trademark, description, manufactureDate, validity, genre);
		this.flavor = flavor;
		this.sugar = sugar;
	}

	/**
 	 * Method to return the flavor of the soda
	 * @return flavor
	 */
	public String getFlavor () {
		return flavor;
	}

	/**
 	 * Method to return the sugar amount of the soda
	 * @return sugar
	 */
	public double getSugar () {
		return sugar;
	}

	/**
	 * Method that changes the value of the field flavor
	 * @param flavor String - value to change the field value flavor
	 */
	public void setFlavor (String flavor) {
		this.flavor = flavor;
	}

	/**
	 * Method that changes the value of the field sugar
	 * @param sugar double - value to change the field value sugar
	 */
	public void setSugar (double sugar) {
		this.sugar = sugar;
	}

	/**
	 * Method to print a soda object
	 */
	public void print () {
		super.print();
		System.out.println(" Flavor: " + flavor);
		System.out.println(" Sugar amount: " + sugar);
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		super.read();
		
		Scanner s = new Scanner(System.in);

		System.out.println(" - Enter the flavor - ");
		flavor = s.nextLine();

		System.out.println(" - Enter the sugar amount - ");
		String aux = s.nextLine();
		sugar = Double.parseDouble(aux);
		
		s.close();
	}
}