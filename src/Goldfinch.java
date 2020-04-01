/**
 * Goldfinch is a subclass of Animal that implements the Walkable and Flyable interfaces
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 3 - AnimalSim_MDG
 * Spring/2020
 */
public class Goldfinch extends Animal implements Walkable, Flyable {
	
	private double wingSpan; //The wingspan of the Goldfinch
	
	/**
	 * Empty-argument constructor calls the empty-argument Animal constructor,
	 * and sets wingSpan to a base value
	 */
	public Goldfinch() {
		
		super();
		wingSpan = 9.0;
	
	}//end empty-argument constructor
	
	/**
	 * The Preferred constructor calls the preferred constructor of Animal to set SimID and location to
	 * the passed in values. It sets wingSpan to the passed in value (wingSpan has to be between 5 cm and 11 cm)
	 * @param simID
	 * @param l
	 * @param wingSpan
	 */
	public Goldfinch(int simID, Location l, double wingSpan) {
		
		super(simID, l);
		
		if(wingSpan < 5.0 || wingSpan > 11.0)
			throw new InvalidWingspanException("Invalid wing span. Wingspan must be between 5.0 cm and 11.0 cm.");
		else 
			this.wingSpan = wingSpan;
		
	}//end preferred constructor

	/**
	 * Method implemented from Walkable. if the passed in value is negative then the xCoord increases by one,
	 * if the passed value is positive the yCoord increases by one, if the passed value is 0 then the xCoord and yCoord
	 * both increase by one
	 * @param direction
	 */
	public void walk(int direction) {
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		if(direction < 0)
			location.setxCoord(x + 1);
		else if(direction > 0)
			location.setyCoord(y+ 1);
		else
			location.update(x + 1, y + 1);
		
	}//end walk
	
	/**
	 * The Goldfinch moves to the location indicated by the Location object passed into the parameter 
	 * for fly
	 */
	public void fly(Location l) {
		
		location = l;
		
	}//end fly
	
	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		
		return wingSpan;
		
	}//end getWingSpan

	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan) {
		
		if(wingSpan < 5.0 || wingSpan > 11.0)
			throw new InvalidWingspanException("Invalid wing span. Wingspan must be between 5.0 cm and 11.0 cm.");
		else 
			this.wingSpan = wingSpan;
		
	}//end setWingSpan

	/**
	 * Returns the instance fields of Goldfinch
	 */
	@Override
	public String toString() {
		
		return "Goldfinch [wingSpan=" + wingSpan + "]";
		
	}//end toString
	
}//end class

