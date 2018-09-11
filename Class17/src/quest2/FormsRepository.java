package quest2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class that represents a Repository of Forms
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.09.2017
 */
public class FormsRepository {
	private ArrayList<Form> forms;
	private static final float maxSize = 1000;
	
	/**
	 * 
	 */
	public FormsRepository () {
		forms = new ArrayList<Form> ();
	}
	
	/**
	 * Method to create to do random forms 
	 */
	public void add() {
		Random r = new Random();
		int aux = r.nextInt(3);
		
		switch(aux){
			case 0:
				generateSquare();	
			case 1:
				generateCircle();
			case 2:
				generateRectangle();
		}
	}
	
	/**
	 * Method to generate a random square  
	 */
	private void generateSquare () {
		Random r = new Random();
		float side = r.nextFloat() * maxSize;
		Form rect = new Square(side);
		forms.add(rect);
	}
	
	/**
	 * Method to generate a random circle  
	 */
	private void generateCircle () {
		Random r = new Random();
		float radius = r.nextFloat() * maxSize;
		Form c = new Circle(radius);
		forms.add(c);
	}
	
	/**
	 * Method to generate a random rectangle  
	 */
	private void generateRectangle () {
		Random r = new Random();
		float side = r.nextFloat() * maxSize;
		float height = r.nextFloat() * maxSize;
		Form rect = new Rectangle(side, height);
		forms.add(rect);
	}
	
	/**
	 * Method to access the ArrayList 
	 */
	public void access () {
		int i = 1;
		for(Form f : forms) {
			System.out.println(" ( " + i + " )");
			f.print();
			System.out.println(" The form area: " + f.calculateArea());
			i++;
		}
	}
}
