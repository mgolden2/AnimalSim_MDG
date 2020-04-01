import java.util.Random;

/**
 * The Animal class encapsulates a generic animal that can be sub-classed by other classes.
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 3 - AnimalSim_MDG
 * Spring/2020
 */
abstract public class Animal {
	
	protected int simID; //Simulation Identification
	protected Location location; //Location Object that gives Animal a location on a simulated map
	protected boolean full; //Indicates if Animal is full
	protected boolean rested; //Indicates if Animal is rested
	
	/**
	 * Empty-argument constructor sets instance fields to a base value
	 */
	public Animal() {
		
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor sets simID to the data passed in (simID has to be greater than 0), sets the location object to the object passed in,
	 * sets full to false and rested to true just like empty-argument constructor 
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l) {
		
		if(simID <= 0)
			throw new InvalidSimIDException("Invalid simID. simID must be greater than zero.");
		else {
			this.simID = simID;
			location = l;
			full = false;
			rested = true;
		}
		
	}//end preferred constructor
	
	/**
	 * Generates a random number to determine whether Animal is full or not
	 */
	public void eat() {
		
		Random randnum = new Random();
		double num = randnum.nextDouble();
		if(num <= .5)
			full = false;
		else
			full = true;
		
	}//end eat
	
	/**
	 * Generates a random number to determine whether Animal is rested or not
	 */
	public void sleep() {
		
		Random randnum = new Random();
		double num = randnum.nextDouble();
		if(num <= .5)
			rested = false;
		else
			rested = true;
		
	}//end sleep

	/**
	 * @return the simID
	 */
	public int getSimID() {
		
		return simID;
		
	}//end getSimID

	/**
	 * @param simID the simID to set
	 */
	public void setSimID(int simID) {
		
		if(simID <= 0)
			throw new InvalidSimIDException("Invalid simID. simID must be greater than zero.");
		else
			this.simID = simID;
		
	}//setSimID

	/**
	 * @return the location
	 */
	public Location getLocation() {
		
		return location;
		
	}//end getLocation

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		
		this.location = location;
		
	}//end setLocation
	

	/**
	 * @return the full
	 */
	public boolean isFull() {
		
		return full;
		
	}//end isFull

	/**
	 * @param full the full to set
	 */
	public void setFull(boolean full) {
		
		this.full = full;
		
	}//end setFull

	/**
	 * @return the rested
	 */
	public boolean isRested() {
		
		return rested;
		
	}//end isRested

	/**
	 * @param rested the rested to set
	 */
	public void setRested(boolean rested) {
		
		this.rested = rested;
		
	}//end setRested

	/**
	 * Returns the instance fields of Animal
	 */
	@Override
	public String toString() {
		
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
		
	}//end toString
	
	
	
}//Animal
