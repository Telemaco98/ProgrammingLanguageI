package quest3;

import java.util.ArrayList;
import java.util.regex.Matcher;

import java.lang.NumberFormatException;

/**
 * Class for the search of the company Geralimentos Cia Ltda.
 *
 * @author 	Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 21.10.2017
 */
public class Search {
	private ArrayList<Person> intervieweds;
	private Archive input;
	private Archive output;
	private static String way = "../data";

	/**
	 * Constructs the Search object.
	 *
	 * @param      input         The name of the input archive
	 * @param      output        The name of the output archive
	 */
	public Search (String input, String output) {
		this.input = new Archive (way + "/input/quest3/" + input);
		this.output = new Archive (way + "/output/quest3/" + output);
	}

	/**
	 * Method to do the Search, reading date of the archives and writing 
	 * a report about the search of the company
	 */
	public void setUp () {
		// ... Read the input archive
		System.out.println(" Lendo dados do arquivo de entrada...");
		try{
			read();
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
			System.out.println(" Encerrando o programa");
			System.exit(1);
		}

		// ... Writing in the report 
		System.out.println(" Gerando relatório...");
		write();
		System.out.println(" Relatório criado em ./data/output/quest3/report.txt");
	}


	/**
	 * Adds an interviewed.
	 * @param      p     Person/Interviewed
	 */
	public void addInterviewed (Person p) {
		intervieweds.add(p);
	}

	/**
	 * Return the media of the intervieweds ages 
	 * @return     media 	The media
	 */
	public double ageMedias () {
		double media = 0.0;
		for (Person p : intervieweds) {
			media += p.getAge();
		}

		return media/(intervieweds.size());
	}

	/**
	 * Return the people media per marital status
	 * @param      maritalStatus  The marital status
	 * @return     media 	The media
	 */
	public double peoplePercentage (char maritalStatus) {
		double count = 0;
		for (Person p : intervieweds) {
			if((p.getMaritalStatus()) == maritalStatus) {
				count ++;
			}
		}

		return count/intervieweds.size();
	}

	/**
	 * Return the accept degree itervieweds media
	 * @return     media 	The media
	 */
	public double acceptDMedia () {
		double media = 0.0;
		for (Person p : intervieweds) {
			media += p.getAcceptDegree();
		}

		return media/intervieweds.size();
	}

	/**
	 * Write in the report archive
	 */
	private void write () {
		output.clean();
		output.writeEnd("Média de idade: " + ageMedias() + "\n");

		Double solteiros = peoplePercentage('S') * 100;
		output.writeEnd("Percentual de solteiros: " + solteiros + "%\n");

		Double casados = peoplePercentage('C') * 100;
		output.writeEnd("Percentual de casados: " + casados + "%\n");

		Double viuvos = peoplePercentage('V') * 100;
		output.writeEnd("Percentual de viúvos: " + viuvos + "%\n");

		Double divorciados = peoplePercentage('D') * 100;
		output.writeEnd("Percentual de divorciados: " + divorciados + "%\n");

		output.writeEnd("Média do grau de aceitação: " + acceptDMedia() + "\n");
	}

	/**
	 * Read the input archive 
	 * @throws     InvalidInputException  Exception for an invalid data in archive input
	 */
	private void read () throws InvalidInputException {
		ArrayList<String> people = input.read();
		int amountInterv = 0;

		try{
			amountInterv = Integer.parseInt(people.get(0));
			intervieweds = new ArrayList<Person>(amountInterv);
		} catch (NumberFormatException e) {
			System.out.println(" Número com formato errado");
			System.out.println(" Encerrando o programa... ");
			System.exit(1);
		}

		for(int i = 1; i < amountInterv; i++) {
			String person = people.get(i);
			String datasPerson[] = person.split(" - ");
			if(datasPerson.length < 4 || datasPerson.length > 4) {
				throw new InvalidInputException(" Inconsistência nos dados de entrada");
			} else {
				String name = datasPerson[0];
				String age = datasPerson[1];
				String maritalStatus = datasPerson[2];
				String acceptDegree = datasPerson[3];

				if(name.length() < 5 || name.length() > 50) throw new InvalidInputException("O nome deve conter de 5 a 50 caracteres.");
				if(name.contains("^[0-9]*$")) throw new InvalidInputException("O nome não pode conter números.");
				int ageInt = -1;

				try{
					ageInt = Integer.parseInt(age);
				} catch (NumberFormatException e) {
					System.out.println(" Número com formato errado");
					System.out.println(" Encerrando o programa... ");
					System.exit(1);
				}


				if(ageInt < 0 || ageInt > 127) throw new InvalidInputException("A idade deve ser um inteiro entre 0 e 127.");
				if((maritalStatus.length()) > 1) throw new InvalidInputException("Informe Estado civil com somente um caractere.");
				if(!maritalStatus.equals("S") && !maritalStatus.equals("C") && !maritalStatus.equals("V") && !maritalStatus.equals("D")) {
					throw new InvalidInputException("Opção inválida no Estado Civil.");
				}

				int aDInt = -1;
				try {
					aDInt = Integer.parseInt(acceptDegree);
				} catch (NumberFormatException e) {
					System.out.println(" Número com formato errado");
					System.out.println(" Encerrando o programa... ");
					System.exit(1);
				}

				if(aDInt < 0 || aDInt > 10) throw new InvalidInputException("Opção inválida no Estado Civil.");

				char ms[] = maritalStatus.toCharArray();
				Person p = new Person(name, ageInt, ms[0], aDInt);
				intervieweds.add(p);
			} 
		}
	}
}