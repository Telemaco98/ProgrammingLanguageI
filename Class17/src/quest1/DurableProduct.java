package quest1;

import java.util.Date;
import java.util.Scanner;

/**
 * Class that represents a Durable Product. The class fields are
 * predominant material (predomMaterial), durability and isDamage.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 19.09.2017
 */
public abstract class DurableProduct extends Product {
	private String predomMaterial; 	/** < Predominant Material of the product */
	private double durability; 		/** < Durability of the product */
	private boolean isDamage; 		/** < Verify if the product is damage **/

	/**
	 * Method that crate an object to represents a book without parameters
	 */
	public DurableProduct () {
		super ();
		predomMaterial = "";
		durability = 0.0;
		isDamage = false;
	}

	/**
	 * Method that create an object to represents a Durable Product.
	 *
	 * @param id 			  int 	  - parameter that represents the product id
	 * @param name            String  - Parameter that represents the product name
     * @param price           double  - Parameter that represents the product price
     * @param trademark       String  - Parameter that represents the product trademark
     * @param description     String  - Parameter that represents the product description
     * @param manufactureDate Date    - Parameter that represents the manufacture date of the product
	 * @param predomMaterial  String  - Parameter that represents the predominant material of the product
	 * @param durability 	  double  - Parameter that represents the durability of the product
	 * @param isDamage 		  boolean - Parameter that represents is the product is damage
	 */
	public DurableProduct (int id, String name, double price, String trademark, String description, Date manufactureDate, String predomMaterial, double durability, boolean isDamage) {
		super(id, name, price, trademark, description, manufactureDate);
		this.predomMaterial = predomMaterial;
		this.durability = durability;
		this.isDamage = isDamage;
	}


	/**
	 * Method that returns the predominant material of the durable product
	 * @return predomMaterial
	 */
	public String getPredomMaterial () {
		return predomMaterial;
	}

	/**
	 * Method that returns the durability of the durable product
	 * @return durability
	 */
	public double getDurability () {
		return durability;
	}

	/**
	 * Method that changes the value of predominant mateiral
	 * @param predomMaterial String - value to change the field value predomMaterial
	 */
	public void setPredomMaterial (String predomMaterial) {
		this.predomMaterial = predomMaterial;
	}

	/**
	 * Mehtod that changes the value of the durability
	 * @param durability double - value to change the field value durability
	 */
	public void setDurability (double durability) {
		this.durability = durability;
	}

	/**
	 * Method to print a durable product
	 */
	public void print () {
		super.print();
		System.out.println(" Predominant material: " + getPredomMaterial());
		System.out.println(" Durability: " + getDurability());
	}

	/**
	 * Method to instantiate the fields with values
	 */
	public void read () {
		super.read();
		
		Scanner s = new Scanner(System.in);	
		
        System.out.println("  - Enter the predominant material - " );
		predomMaterial = s.nextLine();

		System.out.println(" - Enter the durability - ");
		String aux = s.nextLine();
		setDurability(Double.parseDouble(aux));
		
		System.out.println(" - The product is damage? (1 - yes| 0 - no) - ");
		int aux1 = s.nextInt();
		if(aux1 == 1) isDamage = true;
		if(aux1 == 0) isDamage = false;
		
		s.close();
    }

	/**
	 * Method to verify if the product is available to send
	 * @return true/false 
	 */
	public boolean availableToSend() {
		if (isDamage) return false;
		else return true;
	}
	
	/**
	 * Verify if the product is electronic
	 * @return true/false
	 */
	public abstract boolean isElectronic ();
}
