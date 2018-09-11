package quest3;

/**
 * Class main to test the Search about the products quality of the company 
 * Geralimentos Cia Ltda.
 *
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 21.10.2017
 */
public class Main {
	public static void main (String[] args) {
		Search search = new Search("input.txt", "report.txt");
		search.setUp();
	}
}