package quest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.lang.Exception;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Class to represent a perishable product. The class fields are
 * validity and genre.
 *
 * @author Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.08.2017
 */
public class PerishableProduct extends Product {
	private Date validity; /** < Validity of the perishable product */
	private String genre;  /** < Genre of the perishable product */

	/**
	 * Method that crate an object to representes a book without parameters
	 */
	public PerishableProduct () {
		super ();
		validity = new Date ();
		genre = "";
	}

	/**
	 * Method to build a object of the class Perishable Product. It receives seven parameters.
	 *
	 * @param id 			  int 	 - Parameter that represents the product id
	 * @param name            String - Parameter that represents the product name
     * @param price           double - Parameter that represents the product price
     * @param trademark       String - Parameter that represents the product trademark
     * @param description     String - Parameter that represents the product description
     * @param manufactureDate Date   - Parameter that represents the manufacture date of the product
	 * @param validity 	  	  Date   - Parameter that represents the validity date of the perishable product.
	 * @param genre 	  	  String - Parameter that represents the genre of the perishable product.
	 */
	public PerishableProduct (int id, String name, double price, String trademark, String description, Date manufactureDate, Date validity, String genre) {
		super (id, name, price, trademark, description, manufactureDate);
		this.validity = validity;
		this.genre = genre;
	}

	/**
	 * Method to return the validity date of the perishable product
	 * @return validity
 	 */
	public Date getValidity () {
		return validity;
	}

	/**
 	 * Method to return the genre of the perishable product
	 * @return genre
	 */
	public String getGenre () {
		return genre;
	}

	/**
	 * Method that changes the value of the field validity
	 * @param validity Date - value to change the field value validity
	 */
	public void setValidity (Date validity) {
		this.validity = validity;
	}

	/**
	 * Method that changes the value of the field genre
	 * @param genre String - value to change the field value genre
	 */
	public void setGenre (String genre) {
		this.genre = genre;
	}

	/**
	 * Method to print a perishable product
	 */
	public void print () {
		super.print();
		System.out.println(" Validity: " + getValidity());
		System.out.println(" Genre: " + getGenre());
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		Scanner s = new Scanner(System.in);

		super.read();

        try {
			System.out.println(" - Enter the validity - dd/mm/yyyy " );
			String date = s.nextLine();
        	DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
            validity = dt.parse(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

		System.out.println(" - Enter the genre - ");
		genre = s.nextLine();
		
		s.close();
	}

	/**
	 * Method to verify if the product is available to send
	 * @return true/false 
	 */
	public boolean availableToSend() {
		Calendar c = Calendar.getInstance();
		
		Date today = c.getTime();
		System.out.println(today);
		
		if(validity.before(today)) return false;
		else return true;
	}
}