package quest3;

/**
 * Class that represents a President
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class President extends Employee {
	private static final float bonus = (float) 0.3;
	
	/**
	 * Build an object President 
	 * 
	 * @param name 		String - The name of the employee 
	 * @param birthDate String - The birth date of the employee
	 * @param cpf		String - The cpf of the employee
	 * @param salary 	float  - The salary of the salary
	 */
	public President (String name, String birthDate, String cpf, float salary) {
		super (name, birthDate, cpf, salary);
	}
	
	public void print() {
		System.out.println(" Kind: President");
		super.print();
	}

	/**
	 * 
	 */
	public double getBonus() {
		return bonus;
	}
		
	
}