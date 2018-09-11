package quest1;

import java.util.Date;
import java.util.Scanner;
/**
 * Class to represent a pizza. The class field of a pizza is flavor.
 *
 * @author Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Pizza extends PerishableProduct {
	private String flavor; /** < Flavor of the pizza */

	/**
	 * Method that crate an object to represents a book without parameters
	 */
	public Pizza () {
		super ();
		flavor = "";
	}

	/**
	 * Method that crate an object to represents a pizza
	 *
	 * @param id 			  int 	 - Parameter that represents the product id
	 * @param name            String - Parameter that represents the product name
     * @param price           double - Parameter that represents the product price
     * @param trademark       String - Parameter that represents the product trademark
     * @param description     String - Parameter that represents the product description
     * @param manufactureDate Date   - Parameter that represents the manufacture date of the product
	 * @param validity 	  	  Date   - Parameter that represents the validity date of the perishable product.
	 * @param genre 	  	  String - Parameter that represents the genre of the perishable product.
	 * @param flavor 		  String - Parameter that represents the flavor of the pizza
     */
	public Pizza (int id, String name, double price, String trademark, String description, Date manufactureDate, Date validity, String genre, String flavor) {
		super (id, name, price, trademark, description, manufactureDate, validity, genre);
		this.flavor = flavor;
	}

	/**
 	 * Method to return the flavor of the pizza
	 * @return flavor
	 */
	public String getFlavor () {
		return flavor;
	}

	/**
	 * Method that changes the value of the field flavor
	 * @param flavor String - value to change the field value flavor
	 */
	public void setFlavor (String flavor) {
		this.flavor = flavor;
	}

	/**
	 * Method to print a pizza object
	 */
	public void print () {
		super.print();
		System.out.println(" Flavor: " + flavor);
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		super.read();
		
		Scanner s = new Scanner(System.in);

		System.out.println(" - Enter the flavor - ");
		flavor = s.nextLine();
		
		s.close();
	}
}