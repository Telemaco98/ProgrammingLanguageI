package quest1; 

import java.util.Date;
import java.util.Scanner;
import java.lang.Exception;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Class to represents a Product. The class fields are: id,
 * name, price, trademark, description and manufacture date.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 19.09.2017
 */
public abstract class Product {
	private int id; 				/** < ID of the prodict **/
	private String name; 			/** < Name of the product */
	private double price;			/** < Price of the product */
	private String trademark; 		/** < Trademark of the product */
	private String description;		/** < Description of the product */
	private Date manufactureDate;	/** < Manufacture Date of the product */

	/**
	 * Method that crate an object to representes a book without parameters
	 */
	public Product () {
		id = 0;
		name = "";
		price = 0.0;
		trademark = "";
		description = "";
		manufactureDate = new Date ();
	}

	/**
 	 * Method to build a object of the class Product. It receives five parameters.
	 *
	 * @param id 			  int 	 - Parameter that represents the product id
	 * @param name 		 	  String - Parameter that represents the product name
	 * @param price 	  	  double - Parameter that represents the product price
	 * @param trademark	 	  String - Parameter that represents the product trademark
	 * @param description	  String - Parameter that represents the product description
	 * @param manufactureDate Date 	 - Parameter that represents the manufacture date of the product
 	 */
	public Product (int id, String name, double price, String trademark, String description, Date manufactureDate) {
		this.name = name;
		this.price = price;
		this.trademark = trademark;
		this.description = description;
		this.manufactureDate = manufactureDate;
	}
	
	/**
	 * Method to return the id of the product
	 * @return id
	 */
	public int getId () {
		return id;
	}

	/**
	 * Method to return the name of the product.
	 * @return name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Method for returns the price of the product.
	 * @return price
	 */
	public double getPrice () {
		return price;
	}

	/**
	 * Method for returns the trademark of the product.
	 * @return trademark
	 **/
	public String getTrademark () {
		return trademark;
	}

	/**
	 * Method for returns the description of the product.
	 * @return description
	 */
	public String getDescription () {
		return description;
	}

	/**
	 * Method that returns the value of manufacture date of the product.
	 * @return manufactureDate
	 */
	public Date getManufactureDate () {
		return manufactureDate;
	}

	/**
	 * Mehtos that change the value of the field id
	 * @param id int - value to change the field value name
	 */
	public void setId (int id) {
		this.id = id;
	}
	
	/**
	 * Method that changes the value of the field name
	 * @param name String - value to change the field value name
	 */
	public void setName (String name) {
		this.name = name;
	}

	/**
	 * Method that changes the value of the field price
	 * @param price double - value to change the field value price
	 */
	public void setPrice (double price) {
		this.price = price;
	}

	/**
	 * Method that changes the value of the field trademark
	 * @param trademark String - value to change the field value trademark
	 */
	public void setTrademark (String trademark) {
		this.trademark = trademark;
	}

	/**
	 * Method that changes the value of the field description
	 * @param description String - value to change the field value description
	 */
	public void setDescription (String description) {
		this.description = description;
	}

	/**
	 * Method that changes the value of the field manufactureDate
	 * @param manufactureDate Date - value to change the field value manufactureDate
	 */
	public void setManufactureDate (Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	/**
	 * Method to print a product
	 */
	public void print () {
		System.out.println(" Name: " + getName());
		System.out.println(" Price: " + getPrice());
		System.out.println(" Trademark: " + getTrademark());
		System.out.println(" Description: " + getDescription());
		System.out.println(" Manufacture date: " + getManufactureDate());
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		Scanner s = new Scanner(System.in);

		System.out.println(" - Enter the id - ");
		id = s.nextInt();
		
		System.out.println(" - Enter the name - " );
		name = s.nextLine();

		System.out.println(" - Enter the price - " );
		String aux = s.nextLine();
		price = Double.parseDouble(aux);

		System.out.println(" - Enter the trademark - " );
		trademark = s.nextLine();

		System.out.println(" - Enter the description - " );
		description = s.nextLine();

		try {
			System.out.println(" - Enter the manufacture date - dd/mm/yyyy" );
			String date = s.nextLine();
        	DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
            manufactureDate = dt.parse(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		s.close();
	}
	
	/**
	 * Method to verify if the product is available to send
	 * @return true/false 
	 */
	public abstract boolean availableToSend ();
}