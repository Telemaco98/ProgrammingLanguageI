package quest1;

import java.util.Date;
import java.util.Scanner;

/**
 * Class to represent a chocolate. The class fields of a soda are
 * flavor, amount of sugar and lactose (it checks if there is lactose 
 * in the chocolate).
 *
 * @author Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.08.2017
 */
public class Chocolate extends PerishableProduct {
	private String flavor; 	 /** < Flavor of the chocolate */
	private double sugar;	 /** < Sugar amount in the chocolate */
	private boolean lactose; /** < Check if there is lactose in the chocolate */

	/**
	 * Method that crate an object to represents a book without parameters
	 */
	public Chocolate () {
		super ();
		flavor = "";
		sugar = 0.0;
		lactose = false;
	}

	/**
	 * Method that crate an object to represents a chocolate
	 *
	 * @param id 			  int 	  - Parameter that represents the product id
	 * @param name            String  - Parameter that represents the product name
     * @param price           double  - Parameter that represents the product price
     * @param trademark       String  - Parameter that represents the product trademark
     * @param description     String  - Parameter that represents the product description
     * @param manufactureDate Date    - Parameter that represents the manufacture date of the product
	 * @param validity 	  	  Date    - Parameter that represents the validity date of the perishable product.
	 * @param genre 	  	  String  - Parameter that represents the genre of the perishable product.
	 * @param flavor 		  String  - Parameter that represents the flavor of the chocolate
	 * @param sugar 		  double  - Parameter that represents the sugar amount in the chocolate
	 * @param lactose		  boolean - Parameter that represents if there's lactose in the chocolate.
     */
	public Chocolate (int id, String name, double price, String trademark, String description, Date manufactureDate, Date validity, String genre, String flavor, double sugar, boolean lactose) {
		super (id, name, price, trademark, description, manufactureDate, validity, genre);
		this.flavor = flavor;
		this.sugar = sugar;
		this.lactose = lactose;
	}

	/**
 	 * Method to return the flavor of the chocolate
	 * @return flavor
	 */
	public String getFlavor () {
		return flavor;
	}

	/**
 	 * Method to return the sugar amount of the chocolate
	 * @return sugar
	 */
	public double getSugar () {
		return sugar;
	}

	/**
 	 * Method to return if there is lactose in the chocolate
	 * @return lactose
	 */
	public boolean getLactose () {
		return lactose;
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
	 * Method that changes the value of the field lactose
	 * @param lactose boolean - value to change the field value lactose
	 */
	public void setLactose (boolean lactose) {
		this.lactose = lactose;
	}

	/**
	 * Method to print a chocolate object
	 */
	public void print () {
		super.print();
		System.out.println(" Flavor: " + flavor);
		System.out.println(" Sugar amount: " + sugar);
		if(lactose) System.out.println(" There is lactose");
		else System.out.println("There isn't lactose");
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

		System.out.println(" - There is lactose? (1 - Yes | 0 - No)");
		lactose = s.nextBoolean();
		
		s.close();
	}
}