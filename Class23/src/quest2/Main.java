package quest2;

/**
 * Class for main. This show the execution of the class Calculus
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 19.08.2017
 */
public class Main {
	public static void main (String[] args) {
		Calculus calculus = new Calculus();
		calculus.setUp("operations.txt");
	}
}