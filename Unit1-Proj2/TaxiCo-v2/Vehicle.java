/**
 * Class for vehicle. The vehicles fields are: a unique id ( to identifier
 * the vehicle), destination and location.
 * 
 * @author  Shirley Ohara Telémaco de Freitas (shirleyohara@ufrn.edu.br)
 * @version 27.08.2017
 */
public class Vehicle {
    private String id; 			/** < A unique ID for this vehicle.*/
    private String destination; /** < The destination of this vehicle. */
    private String location;	/** < The location of this vehicle. */

    /**
     * Constructs the vehicle object.
     * @param id String - The identifier of vehicle
     */
    public Vehicle (String id) {
    	this.id = id;
    	destination = null;
    	location = null;
    }

    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getId () {
        return id;
    }
    
    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation () {
        return location;
    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination () {
        return destination;
    }

    /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus () {
    	String aux;
    	if (destination == null) aux = ". It's without destination.";
    	else aux = " headed for " + destination;
        return id + " at " + location + aux;
    }

    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination (String destination) {
        this.destination = destination;
    }

    /**
     * Sets the location of the vehicle.
     * @param location String - The location
     */
    public void setLocation (String location) {
    	this.location = location;
    }

}