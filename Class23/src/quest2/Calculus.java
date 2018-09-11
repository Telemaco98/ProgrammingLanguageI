package quest2;

import java.util.ArrayList;

/**
 * Class to do the calculus of the archives.
 * 
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 19.10.2017
 */
public class Calculus {
	private Archive output;
	private Archive input;

	/**
	 * Constructs the object to do the Calculus.
	 */
	public Calculus () {
		output = new Archive("../data/output/quest2/results.txt");
	}

	public void setUp (String archiveInput) {
		System.out.println(" Calculando ...");
		System.out.println(" ... Gerando arquivo de saída (./data/output/quest2/results.txt)");

		input = new Archive("../data/input/quest2/" + archiveInput);
		ArrayList<String> lines = input.read();
		decipher(lines);
	}

	/**
	 * Decipher what there are in the archive
	 * @param      lines  The lines
	 */
	private void decipher (ArrayList<String> lines) {
		output.clean();

		for (String line : lines) {
			if (isValid(line)) {

				try {
					String result = calculates(line) + "\n";	
					output.writeEnd(result);
					
				}catch(CalculusException ex) {
					output.writeEnd(ex.getMessage());
				}
			} else {
				output.writeEnd("Não foi possível calcular\n");
			}
		}
	}

	/**
	 * Determines if the operation line of the archive is valid.
	 * @param      line  The line
	 * @return     True if valide, False otherwise.
	 */
	private boolean isValid (String line) {
		char[] arrayChar = line.toCharArray();

	    int charVal = 0;
	    for ( int i = 0; i < line.length(); i++ ) {
	        charVal = arrayChar[i];

	        /** Verify if there are something charactere out of the possibles 
	         *	caracteres according with the ASCII table 
			 *
			 *	All the characteres out of this interval is a invalid charactere 
	         **/
	        if ( (charVal < 42 || charVal > 57) || charVal == 44 || charVal == 46 ) {
	            return false;
	        }
	    }
	    return true;
	}

	/**
	 * Calculates the result of each line of the archive.
	 * @param      line  	The line
	 * @throws 	   Exception for a invalid value or operation 
	 * @return     result	The result of the calculus
	 */
	private String calculates(String line) throws CalculusException {
		char[] arrayChar = line.toCharArray();
		int findSimbols = 0;
		String numA = "", numB = "";
		double result = 0;
		char simbol = '.'; // Just Initializing
		
		for ( int i = 0; i < line.length(); i++ ) {
	        if(arrayChar[i] == '+' || arrayChar[i] == '-' || arrayChar[i] == '*' || arrayChar[i] == '/'){
	        	    numA = line.substring(0, i);
	        	    numB = line.substring(i+1, line.length());
	        	    simbol = arrayChar[i];
	        	    findSimbols ++;
	        }
	    }

	    if(findSimbols != 1) throw new CalculusException("Não foi possível calcular\n");
	    else {
	    	Double num1 = Double.parseDouble(numA);
	    	Double num2 = Double.parseDouble(numB);

	    	switch(simbol){
	    		case '+':
	    			result = num1 + num2;
	    			break;

	    		case '-':
	    			result = num1 - num2;
	    			break;

	    		case '*':
	    			result = num1 * num2;
	    			break;

	    		case '/':
	    			if(num2 == 0) throw new CalculusException("Não foi possível calcular\n");
	    			else result = num1/num2;
	    			break;
	    	}
			return String.valueOf(result);
	    }
	}
}
