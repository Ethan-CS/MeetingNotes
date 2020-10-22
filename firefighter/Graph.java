package ethankelly.graphs.fire;

/*****
 *
 * @author Ethan Kelly
 * e.kelly.1@research.gla.ac.uk
 *
 *****/

// Program to create graph and represent with an adjacency matrix

public class Graph {
	protected static boolean adjMatrix[][];
	protected static int numVertices;

// Initialise the matrix
	public Graph(int numVertices) {
		Graph.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}

// Add edges
	public void addEdge(int i, int j) {
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
	}

// Remove edges
	public void removeEdge(int i, int j) {
		adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
	}
	
// Get edge
	public static boolean getEdge(int i, int j) {
		if(adjMatrix[i][j] == true) {
			return true;
		} else {
			return false;
		}
	}
	
// Weight of each vertex
	public static int weightVertex(boolean[][] adjMatrix, int vertex) {
		int weight = 0;
		for (int i = 0; i < numVertices; i++) {
		    if (adjMatrix[i][vertex] == true) {
		      weight++;
		    }
		  }
		return weight;
	}
		
// Parse weights into weightsArray		
	public static int[] weightsArray(boolean[][] adjMatrix) {
		int[] weightArr = new int[numVertices];
		for (int v = 0; v < numVertices; v++) {
		    weightArr[v] = weightVertex(adjMatrix, v);
		}
		return weightArr;
		  
	}
	
// Find largest weight in weightsArray
	static int largestWeight(int[] weightsArray) {
		int max = weightsArray[0];
		int index = 0;
		
		// Traverse each element, compare with current max
		for (int i =1; i < weightsArray.length; i++) {
			if (weightsArray[i] > max) {
				max = weightsArray[i];
				index = i;
			}
			
		}
		
		return index;
	}
	
// Find next heaviest vertex (in case the heaviest vertex is on fire)
	public static int nextLargest(int[] weights) {
		int[] otherWeights = new int[weights.length-1];
		
		for (int i=0, k=0; i<weights.length-1; i++) {
			if (i == largestWeight(weights)) {
			} else {
				otherWeights[k++] = weights[i];
		}
	}
	return largestWeight(otherWeights);
}
	
// Build the matrix
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numVertices; i++) {
			s.append(i + ": ");
			for (boolean j : adjMatrix[i]) {
				s.append((j ? 1 : 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public static void main(String args[]) {
		
	}
}
