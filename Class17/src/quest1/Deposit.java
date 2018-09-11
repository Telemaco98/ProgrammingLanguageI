package quest1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Class that represents a deposit of products. The class field is
 * a product container.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Deposit {
	public HashMap<Type, Product> products; /** < Products of the Deposit */

	/**
	 * Method to build a object of the class Deposit.
	 */
	public Deposit () {
		products = new HashMap<Type, Product>();
	}

	/**
	 * Method to add a product in the deposit
	 * @param product - value to add in the deposit
	 * @return true/false
	 */
	public void addProduct (Type type, Product product) {
		products.put(type, product);
	}

	/**
	 * Method to return the amount of products in the deposit
	 * @return products.size()
	 */
	public int productsAmount () {
		return products.size();
	}

	/**
	 * Method to delete a product in the deposit
	 * @param product - value to delete in the deposit
	 * @return true/false
	 */
	public boolean deleteProduct (Type type, Product product) {
		return products.remove(type, product);
	}

	/**
	 * Method that returns if the deposit is empty
	 * @return true/false
	 */
	public boolean isEmpty () {
		return products.isEmpty();
	}

	/**
	 * Method that informs the product more expensive in the deposit
	 */
	public void moreExpensive () {
		if(!isEmpty()){
			Product p = new Pizza(); // The kind is just to do the comparison between the product prices   
			for (Product c  : products.values()) {
	    		if(c.getPrice() > p.getPrice()){
	    			p = c;
	    		}
			}

			System.out.println(" - The product more expensive -");
			p.print();

		}else{
			System.out.println("The deposit is empty!");
		}
	}

	/**
	 * Method that print the products of the deposit
	 */
	public void print () {
		if(!isEmpty()){
			System.out.println("   ---- Products ----- \n");
			for (Product c  : products.values()) {
	    		c.print();	
	    		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			}
		}else{
			System.out.println("The deposit is empty!");
		}
	}
	
	/**
	 * 
	 * @param type
	 * @param product
	 * @return true/false
	 */
	public boolean buy (Type type, Product product) {
		Iterator<Map.Entry<Type, Product>> it = products.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        Type aux = (Type) pairs.getKey();
	        if(type.equals(aux)) {
	        	Product p =  (Product) pairs.getValue();
	        	
	        	if(p.equals(product)) {
					if(p.availableToSend()) {
						products.remove(p);
						return true;
					}
					else return false;
				}
	        }
	    }
		
		return false;
	}
}