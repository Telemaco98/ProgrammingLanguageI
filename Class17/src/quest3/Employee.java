package quest3;

/**
 * Class that represents an Employee. The fields of an employee are: name,
 * birth date, cpf and salary.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public abstract class Employee {
	private String name;
	private String birthDate;
	private String cpf;
	private float salary;
	
	/**
	 * Build an object Employee 
	 * 
	 * @param name 		String - The name of the employee 
	 * @param birthDate String - The birth date of the employee
	 * @param cpf		String - The cpf of the employee
	 * @param salary 	float  - The salary of the salary
	 */
	public Employee (String name, String birthDate, String cpf, float salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.cpf = cpf;
		this.salary = salary;
	}
	
	/**
	 * Return the name of the Employee
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the birth date of the Employee 
	 * @return birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}
	
	/**
	 * Return the cpf of the Employee
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Return the salary of the Employee 
	 * @return salary
	 */
	public float getSalary() {
		return salary;
	}
	
	/**
	 * Change the value of the field salary
	 * @param salary
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	/**
	 * Show the value fields of the Employee
	 */
	public void print () {
		System.out.println(" Name: " + name);
		System.out.println(" Birth Date: " + birthDate);
		System.out.println(" CPF: " + cpf);
		System.out.println(" Salary:" + salary);
	}
	
	/**
	 * 
	 * Abstract method to be implements for the children and It calculate the bonus
	 * of the employee
	 *
	 * @return a double
	 */
	public abstract double getBonus();
}