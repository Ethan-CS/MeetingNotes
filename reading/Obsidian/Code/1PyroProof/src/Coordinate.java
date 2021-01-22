/**
 * A simple coordinate class
 * @author Corinne Madsen
 * @date 5/21/15
 */

public class Coordinate {
	private int x;
	private int y;

	/**
	 * Simple constructor for a coordinate point
	 * @param x - x value
	 * @param y - y value
	 */
	Coordinate(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Accessor for the x-value
	 * @return the x-value of the coordinate
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * Accessor for the y-value
	 * @return the y-value of the coordinate
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * Mutator for the x-value
	 * @param x - the new x-value of the coordinate
	 */
	public void setX(int x){
		this.x=x;
	}
	
	/**
	 * Mutator for the y-value
	 * @param y - the new y-value of the coordinate
	 */
	public void setY(int y){
		this.y=y;
	}

	/**
	 * Method to check if two coordinates are the same (if they have the same x and y values)
	 * @param c2 - the coordinate that is being compared to the current coordinate
	 * @return true if the coordinates have the same two values and false otherwise
	 */
	public boolean equals(Coordinate c2){
		if(c2.getX()==x && c2.getY()==y)
			return true;
		return false;
	}
	
	/**
	 * Method to make this coordinate into a readable String
	 */
	public String toString(){
		return "("+x+", "+y+")";
	}
	
}
