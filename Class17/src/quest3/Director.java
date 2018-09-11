package quest3;

/**
 * Class that represents a Director
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Director extends Employee {
	private static final float bonus = (float) 0.2;
	
	/**
	 * Build an object Director 
	 * 
	 * @param name 		String - The name of the employee 
	 * @param birthDate String - The birth date of the employee
	 * @param cpf		String - The cpf of the employee
	 * @param salary 	float  - The salary of the salary
	 */
	public Director (String name, String birthDate, String cpf, float salary) {
		super (name, birthDate, cpf, salary);
	}

	public double getBonus() {
		return bonus;
	}
}
