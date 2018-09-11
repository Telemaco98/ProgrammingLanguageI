package quest2;

/**
 * Class that represents a Circle. The fields of a circle are: 
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */

public class Main {
	public static void main (String[] args) {	
		FormsRepository fr = new FormsRepository();
	
		for (int i = 0; i <= 20; i++) {
			fr.add();
		}
		
		fr.access();
	}
}