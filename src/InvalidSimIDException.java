/**
 * InvalidSimIDException checks if the SimID of an Animal or its descendant has a proper value 
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 3 - AnimalSim_MDG
 * Spring/2020
 */
public class InvalidSimIDException extends RuntimeException {

	/**
	 * @param msg
	 */
	public InvalidSimIDException(String msg) {
		
		super(msg);
		
	}//end constructor
	
}//end class
