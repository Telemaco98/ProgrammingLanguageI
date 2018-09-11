package quest1;

/**
 * Enum that lists the types of products.
 * 
 * @author  Shirley Ohara Telêmaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.08.2017
 */
public enum Type {
	book(1), car(2), cellphone(3), chocolate(4), pizza(5), soda(6);

	public int valueType;
	
    Type(int value) {
        valueType = value;
    }

    public int getValueType () {
    	return valueType;
    }
}