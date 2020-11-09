package io.github.ethankelly;

import java.util.Arrays;
import java.util.Random;

/*****
 *
 * Initialise a graph for the Firefighter Problem and methods to use them in solving this problem
 *
 * @author Ethan Kelly
 * e.kelly.1@research.gla.ac.uk
 *
 *****/

// Graph represented with an adjacency matrix
public class Graph {
    protected static boolean[][] adjMatrix;
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
    public static void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Get edge
    public static boolean getEdge(int i, int j) {
        return adjMatrix[i][j] || adjMatrix[j][i];
    }

/* Construct the union of two arrays
	public static int[] unionArrays(int[]... arrays) {
		int maxSize = 0;
		int counter = 0;

		for (int[] array : arrays) {
			maxSize += array.length;
		}
		int[] accumulator = new int[maxSize];

		for (int[] array : arrays)
			for (int i : array)
				if (!isDuplicated(accumulator, counter, i))
					accumulator[counter++] = i;

		int[] result = new int[counter];
		for (int i = 0; i < counter; i++) {
			result[i] = accumulator[i];
		}

		return result;
	}

	public static boolean isDuplicated(int[] array, int counter, int value) {

		boolean duplicate = false;

		for (int i = 0; i < counter; i++) {
			if (array[i] == value) {
				duplicate = true;
			} else {
				duplicate = false;
			}
		}
		return duplicate;
	}
*/

    // Determine outbreak of fire on graph (choosing random vertex)
    public static int outbreak(int numVertices) {
        int start = new Random().nextInt(numVertices);

        System.out.println("Fire starts at: " + start);
        return start;
    }

    /***
     *
     * Initialise 2D array to represent state of each vertex in graph at given time
     *
     * Rows correspond to vertices (indexed from 0), columns correspond to turn
     * count (time t) Defence happens in odd rounds, burning in even rounds
     *
     * 0 -> open; 1 -> defended; 2 -> burning.
     *
     ***/

    public static int[][] initialState(int numVertices, int start, int turnCount) {
        int[][] state = new int[numVertices][turnCount + 1];

        // Initialise with outbreak at t=0: 2,
        // everything else 0

        for (int n = 0; n <= turnCount; n++) {
            state[start][n] = 2;
        }

        return state;
    }

    // Determine which vertices burn
    public static int[] burn(int[][] state, int turnCount) {
        int[] burningVertices = new int[numVertices];

        if (turnCount % 2 != 0) {
            // TODO Make this an exception
            System.out.println("Not an even numbered turn, cannot burn adjacent vertices");
        } else
            // burningVertices is an int array;
            // Value of 1 if vertex (index) is burning, 0 otherwise (defended or open)
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    // Store any vertices already on fire
                    if (state[i][turnCount - 1] == 2) {
                        burningVertices[i] = 1;
                        // Open neighbours of burning vertices catch fire
                        if (state[j][turnCount - 1] == 0 && getEdge(i, j)) {
                            burningVertices[j] = 1;
                        }
                    }
                }
            }
        // Array containing vertices burning last round,
        // Used to check if we should end (in main())
        int[] previouslyBurning = new int[numVertices];
        for (int k = 0; k < numVertices; k++) {
            if (state[k][turnCount - 1] == 2) {
                previouslyBurning[k] = 1;
            }
        }
        // If we haven't burned anything new, fire cannot spread, end game
        // Flag if nothing can burn by filling all entries with -1 (usually meaningless
        // in array: 1 if burning, 0 if not)
        if (Arrays.equals(burningVertices, previouslyBurning)) {
            Arrays.fill(burningVertices, -1);
        }

        return burningVertices;

    }

    // Update the state of the graph given what is currently burning
    public static int[][] updateStateBurning(int[][] state, int[] toBurn, int turnCount) {
        int[][] updatedBurning = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updatedBurning[i][j] = state[i][j];
                updatedBurning[i][j + 1] = state[i][j];
            }
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                // If something is previously burned or defended, ensure all following
                // incidences also that state
                if (toBurn[i] == 1) {
                    if (getEdge(i, j)) {
                        updatedBurning[j][turnCount] = 2;
                    }
                }
            }
        }
        // Test:
        // System.out.print(Arrays.deepToString(updatedBurning));
        return updatedBurning;
    }


    // Update the state of the graph given defence information
    public static int[][] updateStateDefence(int[][] state, int defend, int turnCount) {

        int[][] updatedDefence = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updatedDefence[i][j] = state[i][j];
                updatedDefence[i][j + 1] = state[i][j];
            }
        }

        for (int k = turnCount; k <= turnCount; k++) {
            // Only update what has been defended
            updatedDefence[defend][k] = 1;
        }
        // Test:
        // System.out.println(Arrays.deepToString(updatedState));
        return updatedDefence;

    }

    public static void printMatrix(int[][] matrix) {
        // Loop through all rows
        for (int[] row : matrix)

            // Convert each row to string, then print (moving cursor down each time)
            System.out.println(Arrays.toString(row));
    }

    // Build the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i).append(": ");
            for (boolean j : adjMatrix[i]) {
                s.append(j ? 1 : 0).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {

    }
}