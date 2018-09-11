package quest1;

import java.util.Date;
import java.util.Scanner;

/**
 * Class that represents a cellphone. The class fields are
 * processor, operational system (os), screen size.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Cellphone extends DurableProduct {
	private String processor;  /** < Processor of the cell phone */
	private String os;		   /** < Operational system of the cell phone */
	private double screenSize; /** < Screen size of the cell phone */

	/**
	 * Method that crate an object to represents a book without parameters
	 */
	public Cellphone () {
		super ();
		processor = "";
		os = "";
		screenSize = 0.0;
	}

	/**
	 * Method that crate an object to represents a cell phone
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
     * @param processor 	  String  - Parameter that represents the cell phone processor
     * @param os			  String  - Parameter that represents the cell phone operational system
     * @param screenSize 	  double  - Parameter that represents the cell phone screen size
     */
	public Cellphone (int id, String name, double price, String trademark, String description, Date manufactureDate, String predomMaterial, double durability, boolean isElectronic, String processor, String os, double screenSize) {
		super(id, name, price, trademark, description, manufactureDate, predomMaterial, durability, isElectronic);
		this.processor = processor;
		this.os = os;
		this.screenSize = screenSize;
	}

	/**
	 * Method to return the processor of the cellphone
	 * @return processor
	 */
	public String getProcessor () {
		return processor;
	}

	/**
	 * Method to return the screenSize of the cellphone
	 * @return screenSize
	 */
	public String getOs () {
		return os;
	}

	/**
	 * Method to return the screenSize of the cellphone
	 * @return screenSize
	 */
	public double getScreenSize () {
		return screenSize;
	}

	/**
	 * Method that returns the processor field value of the cell phone.
	 * @param processor String - value to change the processor field value
	 */
	public void setProcessor (String processor) {
		this.processor = processor;
	}

	/**
	 * Method that returns the operational system field value of the cell phone.
	 * @param os String - value to change the os field value
	 */
	public void setOs (String os) {
		this.os = os;
	}

	/**
	 * Method that returns the screenSize field value of the cell phone.
	 * @param screenSize double - value to change the screenSize field value
	 */
	public void setScreenSize (double screenSize) {
		this.screenSize = screenSize;
	}

	/**
	 * Method to print a cell phone object
	 */
	public void print () {
		super.print();
		System.out.println(" Processor: " + processor);
		System.out.println(" Operational System: " + os);
		System.out.println(" Screen size" + screenSize);
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		super.read();
		
		Scanner s = new Scanner(System.in);

		System.out.println(" - Enter the processor - ");
		processor = s.nextLine();

		System.out.println(" - Enter the  operational system - ");
		os = s.nextLine();

		System.out.println(" - Enter the screen size - ");
		String aux = s.nextLine();
		screenSize = Double.parseDouble(aux);
		
		s.close();
	}

	/**
	 * Verify if the product is electronic
	 * @return true/false
	 */
	public boolean isElectronic() {
		return true;
	}
}