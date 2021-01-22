/**
 * A class for full Vertices that stores their coordinate and information about them including whether or not
 * they have been burned, protected, and burned from. This class also contains methods allowing vertices to be
 * burned or burned from and to recursively update the distance from the fire.
 * 
 * @author Corinne Madsen
 * @date 5/21/15
 *
 */

public class Vertex {
	private Coordinate c; //the coordinate of this vertex
	private boolean burned =false; //whether or not this vertex has been burned
	private boolean protect=false; //whether or not this vertex has been protected
	private boolean burnedFrom = false; //if this vertex is burned, whether or not it has been burned from
	private int timeBurned = -1; //when this vertex was burned (-1 if it has not yet been burned)
	private Coordinate burnOrigin=null; //if this vertex was burned, where it was burned from (otherwise null)

	/**
	 * A simple constructor for a vertex
	 * @param x
	 * @param y
	 */
	Vertex(int x, int y){
		c=new Coordinate(x,y);
	}

	/**
	 * An accessor for burned
	 * @return - true if this vertex has been burned, false if not
	 */
	public boolean isBurned(){
		return burned;
	}

	/**
	 * An accessor for protected
	 * @return - true if this vertex has been protected, false if not
	 */
	public boolean isProtected(){
		return protect;
	}

	/**
	 * An accessor for c, the Coordinate of the vertex
	 * @return - the Coordinate of this vertex
	 */
	public Coordinate getCoordinate(){
		return c;
	}

	/**
	 * A method that burns from this vertex. It attempts to burn all vertices that are one step away
	 * and then removes this vertex's coordinate from the list of vertices that can be burned.
	 */
	public void burnFrom(){
		burn(up());
		burn(down());
		burn(left());
		burn(right());
		FirefighterModel.getBurnableVertices().remove(c);

	}

	/**
	 * A method to burn a vertex v while burning from this vertex
	 * @param v - the vertex that is being burned from this one
	 * @return - true if the vertex was successfully burned and false if it was already protected or burned
	 */
	public boolean burn(Vertex v){
		if(!v.isProtected() && !v.isBurned()){
			v.burned=true;
			v.timeBurned=FirefighterModel.getTime();
			FirefighterModel.getBurnableVertices().add(v.getCoordinate());
			FirefighterModel.getJustBurned().add(v.getCoordinate());
			v.burnOrigin=c;
			updateFireDistance();
			if(Math.abs(v.c.getX())+Math.abs(v.c.getY())==7){
				FirefighterModel.reachedD7();
				FirefighterModel.getD7Unprotected().remove(v.c);
			}
			return true;
		}
		return false;
	}

	/**
	 * A method to update the distance of the fire from nearby D5 vertices that accounts for whether or not it has
	 * passed D5 to reach D6 or D7 (that then calls updateFireDistance(int) if it has not which updates distances
	 * that don't require negative distances)
	 */
	public void updateFireDistance(){
		if(Math.abs(this.c.getX())+Math.abs(this.c.getY())==6){
			up().updateSingleFireDistance(-1);
			down().updateSingleFireDistance(-1);
			left().updateSingleFireDistance(-1);
			right().updateSingleFireDistance(-1);
		}
		updateFireDistance(0);
	}

	/**
	 * A method used to update the fire's distance from a single coordinate only if it is on D5 
	 * This method is used both for when the fire has passed D5 and needs to update only the distance from D5
	 * coordinates to negative values and in the recursive updateFireDistance(int) method.
	 * @param distance - the distance from the fire
	 */
	public void updateSingleFireDistance(int distance){
		if(this instanceof D5){
			D5 current = (D5) this;
			if(current.getFireDistance()>distance){
				current.setFireDistance(distance);
				current.setTimeChanged(FirefighterModel.getTime());
			}
		}
	}
	
	/**
	 * A method used to recursively update fire distances around a newly burned vertex
	 * @param distance - the recursively increasing distance from the fire
	 */
	public void updateFireDistance(int distance){
		if(distance==5){
			return;
		}
		else{
			updateSingleFireDistance(distance);
			if(up()!=null)
				up().updateFireDistance(distance+1);
			if(down()!=null)
				down().updateFireDistance(distance+1);
			if(left()!=null)
				left().updateFireDistance(distance+1);
			if(right()!=null)
				right().updateFireDistance(distance+1);
		}
	}

	/**
	 * A method to protect a vertex
	 * @return true if the vertex could be protected (which is if it wasn't already protected or burned) and false otherwise
	 */
	public boolean protect(){
		if(!protect && !burned){
			protect=true;
			return true;
		}
		return false;
	}

	/**
	 * A method to test whether or not a vertex can be burned from (so if it is burned, not yet burned from, and
	 * has at least one unburned vertex next to it)
	 * @return - true if this Vertex can be burned from and false otherwise
	 */
	public boolean canBeBurnedFrom(){
		if(protect||burnedFrom||(!burned))
			return false;
		if((up().burned||up().protect)&&(down().burned||down().protect)&&(left().burned||left().protect)&&(right().burned||right().protect))
			return false;
		return true;
	}

	/**
	 * A method to get the Vertex one above this Vertex
	 * @return - the vertex whose y-value is one higher than that of this vertex
	 */
	public Vertex up(){
		if(c.getY()+1<=9)
			return FirefighterModel.getGrid()[9+c.getX()][9+c.getY()+1];
		else
			return null;
	}

	/**
	 * A method to get the Vertex one below this vertex
	 * @return - the vertex whose y-value is one less than that of this vertex
	 */
	public Vertex down(){
		if(c.getY()-1>=-9)
			return FirefighterModel.getGrid()[9+c.getX()][9+c.getY()-1];
		else
			return null;
	}

	/**
	 * A method to get the Vertex one to the left of this vertex
	 * @return - the vertex whose x-value is one less than that of this vertex
	 */
	public Vertex left(){
		if(c.getX()-1>=-9)
			return FirefighterModel.getGrid()[9+c.getX()-1][9+c.getY()];
		else
			return null;
	}

	/**
	 * A method to get the Vertex one to the right of this vertex
	 * @return - the vertex whose x-value is one more than that of this vertex
	 */
	public Vertex right(){
		if(c.getX()+1<=9)
			return FirefighterModel.getGrid()[9+c.getX()+1][9+c.getY()];
		else
			return null;
	}
	
	/**
	 * An accessor for burnOrigin
	 * @return which coordinate this vertex was burned from (which is null if this coordinate is not yet burnt)
	 */
	public Coordinate getBurnOrigin(){
		return burnOrigin;
	}


	/**
	 * A method to get an instance of the Vertex class from a specific coordinate
	 * @param c1 - the coordinate one is trying to get an instance of a vertex from
	 * @return - the Vertex with that coordinate value
	 */
	public static Vertex getVertex(Coordinate c1){
		return FirefighterModel.getGrid()[c1.getX()+9][c1.getY()+9];
	}
	

}
