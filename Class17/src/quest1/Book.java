package quest1;

import java.util.Date;
import java.util.Scanner;

/**
 * Class that represents a book. The class fields are
 * author, title, year and publisher.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Book extends DurableProduct {
	private String author;		/** < Author of the book */
	private String title;		/** < Title of the book */
	private int year;			/** < Year of the book */
	private String publisher;	/** < Publisher of the book */

	/**
	 * Method that crate an object to representes a book without parameters
	 */
	public Book () {
		super();
		author = "";
		title = "";
		year = 0;
		publisher = "";
	}

	/**
	 * Method that crate an object to represents a book
	 *
	 * @param id 			  int 	  - Parameter that represents the product id
	 * @param name            String  - Parameter that represents the product name
     * @param price           double  - Parameter that represents the product price
     * @param trademark       String  - Parameter that represents the product trademark
     * @param description     String  - Parameter that represents the product description
     * @param manufactureDate Date    - Parameter that represents the manufacture date of the product
	 * @param predomMaterial  String  - Parameter that represents the predominant material of the product
	 * @param durability 	  double  - Parameter that represents the durability of the product
	 * @param isDamage 		  boolean - Parameter that represents is the product is damage
     * @param author		  String  - Parameter that represents the book author
     * @param title 		  String  - Parameter that represents the book title
     * @param year 			  int 	  - Parameter that represents the book year
     * @param publisher 	  String  - Parameter that represents the book publisher
	 */
	public Book (int id, String name, double price, String trademark, String description, Date manufactureDate, String predomMaterial, double durability, boolean isDamage, String author, String title, int year, String publisher) {
		super(id, name, price, trademark, description, manufactureDate, predomMaterial, durability, isDamage);
		this.author = author;
		this.title = title;
		this.year = year;
		this.publisher = publisher;
	}

	/**
	 * Method to return the author of the book
	 * @return author
	 */
	public String getAuthor () {
		return author;
	}

	/**
	 * Method to return the title of the book
	 * @return title
	 */
	public String getTitle () {
		return title;
	}

	/**
	 * Method to return the year of the book
	 * @return year
	 */
	public int getYear () {
		return year;
	}

	/**
	 * Method to return the publisher of the book
	 * @return publisher
	 */
	public String getPublisher () {
		return publisher;
	}

	/**
	 * Method that returns the author field value of the book.
	 * @param author String - value to change the author field value
	 */
	public void setAuthor (String author) {
		this.author = author;
	}

	/**
	 * Method that returns the title field value of the book.
	 * @param title String - value to change the title field value
	 */
	public void setTitle (String title) {
		this.title = title;
	}

	/**
	 * Method that returns the year year value of the book.
	 * @param year int - value to change the year field value
	 */
	public void setYear (int year) {
		this.year = year;
	}

	/**
	 * Method that returns the publisher field value of the book.
	 * @param publisher String - value to change the publisher field value
	 */
	public void setPublisher (String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Method to print a book object
	 */
	public void print () {
		super.print();
		System.out.println(" Author: " + author);
		System.out.println(" Title: " + title);
		System.out.println(" Year: " + year);
		System.out.println(" Publisher: " + publisher);
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		super.read();
		Scanner s = new Scanner(System.in);

		System.out.println(" - Enter the author - " );
		author = s.nextLine();

		System.out.println(" - Enter the title - " );
		title = s.nextLine();

		System.out.println(" - Enter the year - " );
		String aux = s.nextLine();
		year = Integer.parseInt(aux);

		System.out.println(" - Enter the publisher - " );
		publisher = s.nextLine();
		s.close();
	}

	/**
	 * Verify if the product is electronic
	 * @return true/false
	 */
	public boolean isElectronic() {
		return false;
	}
}