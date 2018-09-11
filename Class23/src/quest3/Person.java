package quest3;

/**
 * Class for representes a person.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 20.10.2017
 */
public class Person {
	private String name;			/** < name of the person **/
	private int age;				/** < age **/
	private char maritalStatus;		/** < marital status **/
	private int acceptDegree; 		/** < acceptance degree **/

	/**
	 * Constructs the object Person.
	 *
	 * @param      name           The name of the person
	 * @param      age            The age of the person
	 * @param      maritalStatus  The marital status
	 * @param      acceptDegree   The accept degree
	 */
	public Person (String name, int age, char maritalStatus, int acceptDegree) {
		this.name = name;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.acceptDegree = acceptDegree;
	}

	/**
	 * Gets the name.
	 * @return     The name.
	 */
	public String getName () {
		return name;
	}

	/**
	 * Gets the age.
	 * @return     The age.
	 */
	public int getAge () {
		return age;
	}

	/**
	 * Gets the marital status.
	 * @return     The marital status.
	 */
	public char getMaritalStatus () {
		return maritalStatus;
	}

	/**
	 * Gets the accept degree.
	 * @return     The accept degree.
	 */
	public int getAcceptDegree () {
		return acceptDegree;
	}

	/**
	 * Sets the accept degree.
	 * @param      acceptDegree  The accept degree
	 */
	public void setAcceptDegree (int acceptDegree) {
		this.acceptDegree = acceptDegree;
	}
}