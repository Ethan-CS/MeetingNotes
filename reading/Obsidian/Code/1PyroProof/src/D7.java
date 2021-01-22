/**
 * A class for coordinates in D7 (coordinates that are of distance 7 away from the origin). More information is
 * stored for these coordinates as they are the vertices which are protected in my proof's strategy for 
 * containing the fire.
 * 
 * @author Corinne Madsen
 * @date 5/21/15
 *
 */
import java.util.ArrayList;


public class D7 extends Vertex{
	private int maxAffected; //number of vertices in n5 (D5 vertices that are two steps away from this vertex) that have the current maximum threat value
	private int allAffected; //the total number of D5 vertices in n5
	private int recentAffected; //number of D5 vertices in n5 whose threat values have increased in the last time step
	public ArrayList<Coordinate> n5 = new ArrayList<Coordinate>(); //an Arraylist of vertices in D5 (distance 5 from the origin) that are two steps away from this vertex
	
	/**
	 * Constructor for a D7 vertex
	 * @param x - the x value of the coordinate
	 * @param y - the y value of the coordinate
	 */
	D7(int x, int y){
		super(x,y);
		maxAffected=0;
		recentAffected=0;
		for(int dy=2; dy>=-2; dy--){
			int dx=Math.abs(2-dy); 
			while(dx>=-Math.abs(2-dy)){
				if(Math.abs(dx)+Math.abs(dy)==2 && Math.abs(x+dx)+Math.abs(y+dy)==5){
					n5.add(new Coordinate(x+dx, y+dy));
				}
				dx--;
			}
		}
		allAffected=n5.size();
	}
	
	/**
	 * An accessor for maxAffected
	 * @return the total number of D5 vertices 2 steps away that have the current max threat value
	 */
	public int getMaxAffected(){
		return maxAffected;
	}
	
	/**
	 * A mutator for maxAffected
	 * 
	 */
	public void setMaxAffected(int maxAffected){
		this.maxAffected=maxAffected;
	}
	
	/**
	 * An accessor for allAffected
	 * @return the total number of D5 vertices 2 steps away
	 */
	public int getAllAffected(){
		return allAffected;
	}
	
	/**
	 * An accessor for recentAffected
	 * @return the total number of D5 vertices 2 steps away whose threat values increased in the last time step
	 */
	public int getRecentAffected(){
		return recentAffected;
	}
	
	/**
	 * A mutator for recentAffected
	 * 
	 */
	public void setRecentAffected(int recentAffected){
		this.recentAffected= recentAffected;
	}
	
	
}
