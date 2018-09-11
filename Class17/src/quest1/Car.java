package quest1;

import java.util.Date;
import java.util.Scanner;

/**
 * Class that represents a car. The class fields are
 * model, cylinder diameter, color and the gear type.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Car extends DurableProduct {
	private String model; 	  /** < Model of the car */
	private int cylinderDiam; /** < Cylinder diamater of the car */
	private String color; 	  /** < Color of the car */
	private String gear;	  /** < Gear type of the car */

	/**
	 * Method that crate an object to representes a book without parameters
	 */
	public Car () {
		super ();
		model = "";
		cylinderDiam = 0;
		color = "";
		gear = "";
	}

	/**
	 * Method that crate an object to represents a Car
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
	 * @param model 	  	  String  - Parameter that represents the model of the car
	 * @param cylinderDiam	  int 	  - Parameter that represents the cylinder diameter of the car
	 */
	public Car (int id, String name, double price, String trademark, String description, Date manufactureDate, String predomMaterial, double durability, boolean isElectronic, String model, int cylinderDiam, String color, String gear) {
		super(id, name, price, trademark, description, manufactureDate, predomMaterial, durability, isElectronic);
		this.model = model;
		this.cylinderDiam = cylinderDiam;
		this.color = color;
		this.gear = gear;
	}

	/**
	 * Method to return car model
	 * @return model
	 */
	public String getModel () {
		return model;
	}

	/**
	 * Method to return the cylinder diameter of the car
	 * @return cylinderDiam
	 */
	public int getCylinderDiam () {
		return cylinderDiam;
	}

	/**
	 * Method to return the color of the car
	 * @return color
	 */
	public String getColor () {
		return color;
	}

	/**
	 * Method to return the gear type of the car 
	 * @return gear
	 */
	public String getGear () {
		return gear;
	}

	/**
	 * Method that changes the value of the field model
	 * @param model String - value to change the field value model
	 */
	public void setModel (String model) {
		this.model = model;
	}

	/**
	 * Method that changes the value of the field cylinderDiam
	 * @param cylinderDiam int - value to change the field value cylinderDiam
	 */
	public void setCylinderDiam (int cylinderDiam) {
		this.cylinderDiam = cylinderDiam;
	}

	/**
	 * Method that changes the value of the field cylinderDiam
	 * @param cylinderDiam int - value to change the field value cylinderDiam
	 */
	public void setColor (String color) {
		this.color = color;
	}

	/**
	 * Method that changes the value of the field gear
	 * @param gear String - value to change the field value gear
	 */
	public void setGear (String gear) {
		this.gear = gear;
	}

	/**
	 * Method to print a car object
	 */
	public void print () {
		super.print();
		System.out.println(" Model: " + model);
		System.out.println(" Cylinder diameter: " + cylinderDiam);
		System.out.println(" Color: " + color);
		System.out.println(" Gear: " + gear);
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		super.read();

		Scanner s = new Scanner(System.in);

		System.out.println(" - Enter the car model - ");
		model = s.nextLine();

		System.out.println(" - Enter the cylinder diameter - ");
		String aux = s.nextLine();
		cylinderDiam = Integer.parseInt(aux);

		System.out.println(" - Enter the color - ");
		color = s.nextLine();

		System.out.println(" - Enter the gear type - ");
		gear = s.nextLine();
		
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