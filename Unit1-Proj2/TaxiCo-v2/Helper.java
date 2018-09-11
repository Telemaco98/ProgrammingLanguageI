/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  Shirley Ohara Telémaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 29.08.2017
 */
public class Helper 
{
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp()
	{
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
	}

    /**
     * Test whether we can book a taxi.
     */
	public void testBook()
	{
		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived()
	{
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		taxi1.book("HIPER");
		taxi1.arrived();
		if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the vehicle order
	 */
	public void testVehicleOrder () {
		Vehicle v = taxiCo1.vehicleOrder("Carrefour");
		if(v == null) System.out.println ("Vehicle unvailable");
		else System.out.println(v.getStatus());
	}

	public static void main(String[] args) {
		Helper helper = new Helper();
		System.out.println("Primeiro teste");
		helper.testBook();
		
		System.out.println("Segundo teste");
		helper.testArrived();

		System.out.println("Terceiro teste");
		helper.testVehicleOrder();
	}
}