/**
 * Class for a taxi.
 * The Taxis are either free or occupied.
 * 
 * @author David J. Barnes 
 * @version 2010.12.03
 *      Change by -
 * @author Shirley Ohara Telémaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 28.08.2017
 */
public class Taxi extends Vehicle {
    private boolean free; /**< Whether it is free or not. */

    /**
     * Constructor for objects of class Taxi.
     * @param base The name of the company's base.
     * @param id This taxi's unique id.
     */
    public Taxi (String base, String id) {
        super (id);
        setLocation(base);
        free = true;
    }
    
    /**
     * Book this taxi to the given destination.
     * The status of the taxi will no longer be free.
     * @param destination The taxi's destination.
     */
    public void book (String destination) {
        setDestination(destination);
        free = false;
    }
    
    /**
     * Indicate that this taxi has arrived at its destination.
     * As a result, it will be free.
     */
    public void arrived () {
        setLocation(getDestination());
        setDestination(null);
        free = true;
    }
}