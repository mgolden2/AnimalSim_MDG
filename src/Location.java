/**
 * This class encapsulates a point on a simulation map.
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 3 - AnimalSim_MDG
 * Spring/2020
 */
public class Location {
	
	private int xCoord; //The x coordinate
	private int yCoord; // The y coordinate
	
	/**
	 * Empty-argument constructor sets coordinates to zero 
	 */
	public Location() {
		
		xCoord = 0;
		yCoord = 0;
		
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor sets coordinates equal to the passed in values. Passed in values can NOT be less than 0
	 * @param x
	 * @param y
	 * @throws InvalidCoordinateException
	 */
	public Location(int x, int y) throws InvalidCoordinateException {
		
		if (x < 0 || y < 0) {
			
			if (x < 0 && y < 0) {
				throw new InvalidCoordinateException("Invalid Coordinates. Coordinates cannot be negative.");
			}
			else if (x < 0) {
				throw new InvalidCoordinateException("Invalid X Coordinate. Coordinates cannot be negative.");
			}
			else if (y < 0) {
				throw new InvalidCoordinateException("Invalid Y Coordinate. Coordinates cannot be negative.");
			}
			
		}
		else
			xCoord = x;
			yCoord = y;
		
	}//end preferred constructor
	
	/**
	 * Updates the coordinates with the passed in values
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		
		if (x < 0 || y < 0) {
			
			if (x < 0 && y < 0) {
				throw new InvalidCoordinateException("Invalid Coordinates. Coordinates cannot be negative.");
			}
			else if (x < 0) {
				throw new InvalidCoordinateException("Invalid X Coordinate. Coordinates cannot be negative.");
			}
			else if (y < 0) {
				throw new InvalidCoordinateException("Invalid Y Coordinate. Coordinates cannot be negative.");
			}
			
		}
		else
			xCoord = x;
			yCoord = y;
			
	}//end update
	
	/**
	 * Returns an array with the first index as the x coordinate and the second index as the y coordinate
	 * @return
	 */
	public int[] getCoordinates() {
	
		int[] coordinates = new int[] {getxCoord(), getyCoord()};
		return coordinates;
		
	}//end getCoordinates

	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		
		return xCoord;
		
	}//end getxCoord

	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int x) {
		
			if (x < 0)
				throw new InvalidCoordinateException("Invalid X Coordinate. Coordinates cannot be negative.");
			else
				xCoord = x;
			
	}//end setxCoord

	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
	
		return yCoord;
	
	}//end getyCoord

	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int y) {
		
			if (y < 0)
				throw new InvalidCoordinateException("Invalid Y Coordinate. Coordinates cannot be negative.");
			else
				yCoord = y;
			
	}//end setyCoord
	
	/**
	 * Returns the instance fields of Location Object
	 */
	@Override
	public String toString() {
		
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	
	}//end toString

}//end class
