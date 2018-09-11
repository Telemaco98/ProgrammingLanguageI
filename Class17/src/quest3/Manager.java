package quest3;

/**
 * Class that represents a Manager
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class Manager extends Employee{
	private static final float bonus = (float) 0.1;
	
	/**
	 * Build an object Director 
	 * 
	 * @param name 		String - The name of the employee 
	 * @param birthDate String - The birth date of the employee
	 * @param cpf		String - The cpf of the employee
	 * @param salary 	float  - The salary of the salary
	 */
	public Manager (String name, String birthDate, String cpf, float salary) {
		super (name, birthDate, cpf, salary);
	}

	public double getBonus() {
		// TODO Auto-generated method stub
		return bonus;
	}
}
