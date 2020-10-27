
package ethankelly.graphs.fire;

/*****
 *
 * @author Ethan Kelly
 * e.kelly.1@research.gla.ac.uk
 *
 *****/

//NB THIS CODE IS NOT YET FUNCTIONAL

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GreedyFirefighter extends Graph {

	private static int[] defence;
	private static int[] burning;
	private static int[] burned;


	public GreedyFirefighter(int numVertices) {
		super(numVertices);
	}

// Random vertex selection for outbreak of fire
	public static int outbreak(int numVertices) {
		int start = new Random().nextInt(numVertices);

		System.out.println("Fire starts at: " + start);
		return start;
	}

// Construct the union of two arrays
	public static int[] unionArrays(int[]... arrays) {
        int maxSize = 0;
        int counter = 0;

        for(int[] array : arrays) {
        	maxSize += array.length;
        }
        int[] accumulator = new int[maxSize];

        for(int[] array : arrays)
            for(int i : array)
                if(!isDuplicated(accumulator, counter, i))
                    accumulator[counter++] = i;

        int[] result = new int[counter];
        for(int i = 0; i < counter; i++) {
        	result[i] = accumulator[i];
        }

        return result;
    }

    public static boolean isDuplicated(int[] array, int counter, int value) {
    	boolean duplicate = false;
    	
        for(int i = 0; i < counter; i++) {
        	if(array[i] == value) {
        		duplicate = true;
        	} else {
        		duplicate = false;
        	}
        }
		return duplicate;
    }

// Find the neighbours of a vertex, output as boolean[]
	public static boolean[] getNeighbours(int vertex) {

		boolean[] neighbours = new boolean[numVertices];
		for (int i = 0; i < numVertices; i++) {
			// Return true if i is neighbours with vertex,
			// False if not
			if (getEdge(i, vertex) == true) {
				neighbours[i] = true;
			} else {
				neighbours[i] = false;
			}
		}

		return neighbours;
	}
	
// What has been burned previously?
	public static int[] previouslyBurned(int start, int turnCount) {
			int[] burned = new int[numVertices];
			Arrays.fill(burned, numVertices + 1);
			burned[0] = start;
			
			int counter = 0;
			
			if (turnCount == 0) {
				counter = 1;
			} else if (turnCount > 0) {
				for (int j : unionArrays(currentlyBurning(start, turnCount-1, previouslyBurned(start, turnCount-1), defence), previouslyBurned(start, turnCount-1))) {
					if (j<numVertices) {
					burned[j] = j;
					counter++;

					int[] shorterBurned = Arrays.copyOfRange(burned, 0, counter);
					System.out.println("Burned: " + Arrays.toString(shorterBurned));
					}
				}
			}
			
			return burned;
	}
	
// What is currently burning?
	@SuppressWarnings("unlikely-arg-type")
	public static int[] currentlyBurning(int start, int turnCount, int[] burned, int[] defence) {
		

		int[] onFire = new int[numVertices];
		Arrays.fill(onFire, numVertices+1);
		int counter = 0;
					
		List<int[]> listDefence = Arrays.asList(defence);
		
			// If this is t=0, only vertex on fire is start
			if (turnCount == 0) {
				onFire[0] = start;
				onFire = Arrays.copyOfRange(onFire, 0, turnCount+1);
				counter = 1;
			// t=1 or greater	
			} else if (turnCount>0) {
				for (int i = 0; i < numVertices; i++) {
				// for each i in set of vertices and
				// for each j on fire, are i and j neighbours?
					for (int j : burning) {
						if (j > numVertices) {
							break;
						} else if (getEdge(i, j)==true && listDefence.contains(i) == false && i !=j) {
							onFire[counter] = i;
							counter++;
						}
					}
				}
			}
			
		int[] shortOnFire = Arrays.stream(Arrays.copyOfRange(onFire, 0, counter)).distinct().toArray();
		System.out.println("On fire: " + Arrays.toString(shortOnFire));
		return onFire;
	}
	
// What do we defend?
	public static int[] defenceStrategy(int start, int turnCount, int[] defence, int[] burning, int[] burned, boolean[][] adjMatrix) {
		
		int[] weights = weightsArray(adjMatrix);
		Integer[] weightsInOrder = new Integer[weights.length];
		
		for (int n=0; n < weights.length; n++) {
			weightsInOrder[n] = weights[n];
		}
		
		Arrays.sort(weightsInOrder, Collections.reverseOrder());
		
		for (int i : defence) {
			for (int j : burned) {
				for (int k : burning) {
					for (int n = 0; n < numVertices; n++ ) {
					
						int candidate = weightsInOrder[n];
				
						if (i != weights[candidate] && j != weights[candidate] && k != weights[candidate]) {
							defence[turnCount] = weights[candidate];

						}
					}
				}
			}
		}
		int[] shortDefence = Arrays.copyOfRange(defence, 0, turnCount+1);
		System.out.println("Defence: " + Arrays.toString(shortDefence));
		return defence;
	}		

// Main method	
	public static void main(String[] args) {
		// Define graph g
		int numVertices = 4;
		Graph g = new Graph(numVertices);

		// Add edges between vertices
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);

		// Print adjacency matrix
		System.out.println("Initial graph:");
		System.out.print(g.toString());

		int start = outbreak(numVertices);
		
		int[] defence = new int[numVertices];
		Arrays.fill(defence, numVertices + 1);
		

		for (int i = 0; i < 2; i++) {
			System.out.println("---- Round: " + i + " ----");
			
			burned = previouslyBurned(start, i);
			burning = currentlyBurning(start, i, defence, burned);
			defence = defenceStrategy(start, i, defence, burning, burned, adjMatrix);
		}
	}
}

