package quest1; 

import java.util.Scanner;

/**
 * Archive with the principal method to test the class about Products created.
 *
 * @author  Shirley Ohara Telemaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 23.08.2017
 */
public class Main {
	/**
	 * Principal method to do the main
	 */
	public static void main (String[] args) {
		clearScreen();
		System.out.println("");
		System.out.println(" +++ WELCOME TO PRODUCTS DEPOSIT  +++ ");

		Deposit deposit = new Deposit();
		boolean exit = false;

		while(!exit) {
			try {
	    			Thread.sleep(2000); //Sleep two seconds
			} catch(InterruptedException e) {
	 		   // this part is executed when an exception (in this example InterruptedException) occurs
			}

			clearScreen();
			menuChoices();
			Scanner s = new Scanner(System.in);
			System.out.println(" - Choose a number - " );
			int choose = s.nextInt();

	
			switch(choose){
				case 0:
					exit = true;
					break;

				case 1:
					add(deposit);
					break;

				case 2:
					remove(deposit);
					break;

				case 3:
					System.out.println("The products amount in the deposit: " + deposit.productsAmount());
					break;

				case 4:
					if(deposit.isEmpty()) System.out.println("The deposit is empty!");
					else System.out.println("The deposit isn't empty!");
					break;

				case 5: 
					deposit.moreExpensive();
					break;

				case 6:
					deposit.print();
					break;

				case 7:
					buy(deposit);
					
					
				default:
					System.out.println(" Sorry, there isn't this choice");
			}
			s.close();
		}
		
		clearScreen();
		System.out.println(" Bye, Good Lucky! ô/");
		System.exit(0);

	}

	/**
	 * Method to add a product in the deposit
	 *
	 * @param      deposit  The deposit
	 */
	public static void add (Deposit deposit) {
		clearScreen();
		productsMenu();
		Scanner s = new Scanner(System.in);
		System.out.println(" - Choose a number - " );
		int choose = s.nextInt();		

		switch(choose){
			case 1: // Book
				Product book = new Book();
				book.read();
				deposit.addProduct(Type.book, book);
				break;

			case 2: // Car
				Product car = new Car();
				car.read();
				deposit.addProduct(Type.car, car);
				break;

			case 3: // Cell phone
				Product cellphone = new Cellphone();
				cellphone.read();
				deposit.addProduct(Type.cellphone, cellphone);
				break;

			case 4: // Chocolate
				Product chocolate = new Chocolate();
				chocolate.read();
				deposit.addProduct(Type.chocolate, chocolate);
				break;

			case 5: // Pizza
				Product pizza = new Pizza ();
				pizza.read();
				deposit.addProduct(Type.pizza, pizza);
				break;

			case 6: // Soda
				Product soda = new Soda ();
				soda.read();
				deposit.addProduct(Type.soda, soda);
				break;

			default:
				System.out.println(" Going out of this menu....");
		}
		s.close();
	}

	/**
 	 * Method that remove a product in the deposit
	 *
	 * @param  deposit  Deposit - The deposit of the products
	 */
	public static void remove (Deposit deposit) {
		clearScreen();
		productsMenu();
		Scanner s = new Scanner(System.in);
		System.out.println(" - Choose a number - " );
		int choose = s.nextInt();		

		switch(choose){
			case 1: // Book
				Product book = new Book();
				book.read();
				deposit.deleteProduct(Type.book, book);
				break;

			case 2: // Car
				Product car = new Car();
				car.read();
				deposit.deleteProduct(Type.car, car);
				break;

			case 3: // Cell phone
				Product cellphone = new Cellphone();
				cellphone.read();
				deposit.deleteProduct(Type.cellphone, cellphone);
				break;

			case 4: // Chocolate
				Product chocolate = new Chocolate();
				chocolate.read();
				deposit.deleteProduct(Type.chocolate, chocolate);
				break;

			case 5: // Pizza
				Product pizza = new Pizza ();
				pizza.read();
				deposit.deleteProduct(Type.pizza, pizza);
				break;

			case 6: // Soda
				Product soda = new Soda ();
				soda.read();
				deposit.deleteProduct(Type.soda, soda);
				break;

			default:
				System.out.println(" Going out of this menu....");
		}
		
		s.close();
	}
	
	
	/**
 	 * Method that buy a product in the deposit
	 *
	 * @param  deposit  Deposit - The deposit of the products
	 */
	public static void buy (Deposit deposit) {
		clearScreen();
		productsMenu();
		Scanner s = new Scanner(System.in);
		System.out.println(" - Choose a number - " );
		int choose = s.nextInt();		

		switch(choose){
			case 1: // Book
				Product book = new Book();
				book.read();
				if(deposit.buy(Type.book, book)) System.out.println(" Product sent with success");
				else System.out.println(" Product can't be send");
				break;

			case 2: // Car
				Product car = new Car();
				car.read();
				if(deposit.buy(Type.car, car)) System.out.println(" Product sent with success");
				else System.out.println(" Product can't be send");
				break;

			case 3: // Cell phone
				Product cellphone = new Cellphone();
				cellphone.read();
				if(deposit.buy(Type.cellphone, cellphone)) System.out.println(" Product sent with success");
				else System.out.println(" Product can't be send");
				break;

			case 4: // Chocolate
				Product chocolate = new Chocolate();
				chocolate.read();
				if(deposit.buy(Type.chocolate, chocolate)) System.out.println(" Product sent with success");
				else System.out.println(" Product can't be send");
				break;

			case 5: // Pizza
				Product pizza = new Pizza ();
				pizza.read();
				if (deposit.buy(Type.pizza, pizza)) System.out.println(" Product sent with success");
				else System.out.println(" Product can't be send");
				break;

			case 6: // Soda
				Product soda = new Soda ();
				soda.read();
				if (deposit.buy(Type.soda, soda)) System.out.println(" Product sent with success");
				else System.out.println(" Product can't be send");
				break;

			default:
				System.out.println(" Going out of this menu....");
		}
		
		s.close();
		
	}

	/**
 	 * Method to show the menu of choices
	 */
	public static void menuChoices () {
		System.out.println ("+==============================+");
		System.out.println ("|            Choises           |");
		System.out.println ("+==============================+");
		System.out.println ("| ( 0 ) Exit                   |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 1 ) Add a product          |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 2 ) Remove a product       |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 3 ) Products amount        |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 4 ) Check if is empty      |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 5 ) Product more expensive |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 6 ) Show all products      |");
		System.out.println ("|------------------------------|");
		System.out.println ("| ( 7 ) Buy a product          |");
		System.out.println ("+==============================+");
	}

	/**
 	 * Method to show the products menu
	 */
	public static void productsMenu () {
		System.out.println ("+======================+");
		System.out.println ("|       Products       |");
		System.out.println ("+======================+");
		System.out.println ("| ( 1 ) Book           |");
		System.out.println ("|----------------------|");
		System.out.println ("| ( 2 ) Car            |");
		System.out.println ("|----------------------|");
		System.out.println ("| ( 3 ) Cellphone      |");
		System.out.println ("|----------------------|");
		System.out.println ("| ( 4 ) Chocolate      |");
		System.out.println ("|----------------------|");
		System.out.println ("| ( 5 ) Pizza          |");
		System.out.println ("|----------------------|");
		System.out.println ("| ( 6 ) Soda           |");
		System.out.println ("|----------------------|");
		System.out.println ("| ( Other ) Exit       |");
		System.out.println ("+======================+");
	}

	/**
 	 * Method to clean the screen
	 */
	public static void clearScreen() {
    		System.out.println("\033[H\033[2J");
   	}
}