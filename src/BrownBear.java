/**
 * BrownBear is a subclass of Animal that implements the Walkable and Swimmable interfaces
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 3 - AnimalSim_MDG
 * Spring/2020
 */
public class BrownBear extends Animal implements Walkable, Swimmable {

	private String subSpecies; //The subspecies of the Brownbear
	
	/**
	 * Empty-argument constructor that calls the Animal empty-argument constructor,
	 * and sets subSpecies to Alaskan 
	 */
	public BrownBear() {
		
		super();
		subSpecies = new String("Alaskan");
		
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor that passes in SimID and a location object to the super constructor and sets subSpecies 
	 * to the data passed in
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
	
		super(simID, l);
		InvalidSubspeciesException e = new InvalidSubspeciesException("Invalid Subspecies. Input a correct subspecies of Brown bear.");
		if (e.checkSubspecies(subSpecies) == false)
			throw e;
		else
			this.subSpecies = subSpecies;
		
	}//end preferred constructor
	
	/**
	 * Method implemented from Walkable. if the passed in value is negative then the xCoord increases by three,
	 * if the passed value is positive the yCoord increases by three, if the passed value is 0 then the xCoord and yCoord
	 * both increase by three
	 * @param direction
	 */
	public void walk(int direction) {
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		if(direction < 0)
			location.setxCoord(x + 3);
		else if(direction > 0)
			location.setyCoord(y + 3);
		else
			location.update(x + 3, y + 3);
		
	}//end walk
	
	/**
	 *	Method implemented from Walkable. if the passed in value is negative then the xCoord increases by two,
	 * if the passed value is positive the yCoord increases by two, if the passed value is 0 then the xCoord and yCoord
	 * both increase by two
	 * @param direction
	 */
	public void swim(int direction) {
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		if(direction < 0)
			location.setxCoord(x + 2);
		else if(direction > 0)
			location.setyCoord(y+ 2);
		else
			location.update(x + 2, y + 2);
		
	}//end swim

	/**
	 * @return the subSpecies
	 */
	public String getSubSpecies() {
		
		return subSpecies;
		
	}//end getSubSpecies

	/**
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies) {
		
		InvalidSubspeciesException e = new InvalidSubspeciesException("Invalid Subspecies. Input a correct subspecies of Brown bear.");
		if (e.checkSubspecies(subSpecies) == false)
			throw e;
		else
			this.subSpecies = subSpecies;
	
	}//end setSubSpecies

	/**
	 * Returns instance fields values of BrownBear
	 */
	@Override
	public String toString() {
		
		return "BrownBear [subSpecies=" + subSpecies + "]";
		
	}//end toString
	
	
}//end class
