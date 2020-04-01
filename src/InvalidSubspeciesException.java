/**
 * InvalidSubspeciesException checks for a correct subspecies of Brown bear
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 3 - AnimalSim_MDG
 * Spring/2020
 */
public class InvalidSubspeciesException extends RuntimeException {
	
	/**
	 * @param msg
	 */
	public InvalidSubspeciesException(String msg) {
		
		super(msg);
		
	}//end constructor
	
	/**
	 * This method takes the passed in subSpecies and if it doesn't match with any of the correct subSpecies in the array
	 * then the method returns false
	 * @param msg
	 * @return
	 */
	public boolean checkSubspecies(String msg) {
		
		int c = 0;
		String[] s = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
		for(String i : s) {
			if(msg.equals(i) == false)
				c++;
		}
		if(c == 6)
			 return false;

		else
			 return true;
		
	}//end check
	
}//end class
