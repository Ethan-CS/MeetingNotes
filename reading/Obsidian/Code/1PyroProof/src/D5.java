/**
 * A class for coordinates in D5 (coordinates that are of distance 5 away from the origin). More information is
 * stored for these coordinates as they are used to compute threat values that are used to decide which D7 vertices
 * to protect.
 * 
 * @author Corinne Madsen
 * @date 5/21/15
 *
 */
import java.util.ArrayList;

public class D5 extends Vertex{

	private int thtValue; //the computed threat value based on the algorithm from my research
	private int n7; //the number of vertices in N2(Vertex) on D7 with N2(Vertex) being all vertices 2 steps away
	private int protN7; //the number of vertices in N2(Vertex) on D7 protected by the end of time t-1
	public ArrayList<Coordinate> n7UnprotVertices = new ArrayList<Coordinate>(); //an Arraylist of all vertices in n7 that are unprotected
	private int fireDist; //the distance from the fire to this vertex (can be negative if the fire passes this vertex towards D7)
	private int timeChanged; //the last time at which the thtValue of this vertex was increased


	/**
	 * Constructor for a D5 coordinate
	 * @param x - the x value of the coordinate
	 * @param y - the y value of the coordinate
	 */
	D5(int x, int y){
		super(x,y);
		n7=0;
		protN7=0;
		fireDist=5; //since the fire starts at the origin, its distance is automatically 5 away at first
		timeChanged=0;
		//counting and recording all unprotected n7 vertices
		for(int dy=2; dy>=-2; dy--){
			int dx=Math.abs(2-dy); 
			while(dx>=-Math.abs(2-dy)){
				if(Math.abs(dx)+Math.abs(dy)==2 && Math.abs(x+dx)+Math.abs(y+dy)==7){
					n7UnprotVertices.add(new Coordinate(x+dx, y+dy));
					n7++;
				}
				dx--;
			}
		}
	}

	/**
	 * A method to update the threat value of a D5 vertex.
	 */
	public void updateThtValue(){
		if(n7UnprotVertices.size()>0){
			for(int i =n7UnprotVertices.size()-1; i>=0; i--){
				Coordinate c = n7UnprotVertices.get(i);
				D7 vert=(D7) FirefighterModel.getGrid()[c.getX()+9][c.getY()+9];
				if(vert.isProtected()){
					n7UnprotVertices.remove(c);
				}
			}
		}
		protN7=n7-n7UnprotVertices.size();
		thtValue=(n7-protN7)-fireDist-1;
	}
	
	/**
	 * An accessor for fireDist
	 * @return - the distance from this vertex to the fire
	 */
	public int getFireDistance(){
		return fireDist;
	}
	
	/**
	 * A mutator for fireDist
	 */
	public void setFireDistance(int dist){
		fireDist=dist;
	}

	/**
	 * An accessor for timeChanged
	 * @return - the last time at which this vertex's threat value was increased
	 */
	public int getTimeChanged(){
		return timeChanged;
	}
	
	/**
	 * A mutator for timeChanged
	 */
	public void setTimeChanged(int time){
		timeChanged=time;
	}
	
	/**
	 * An accessor for thtValue
	 * @return - the threat value of the vertex
	 */
	public int getThreatValue(){
		return thtValue;
	}
}