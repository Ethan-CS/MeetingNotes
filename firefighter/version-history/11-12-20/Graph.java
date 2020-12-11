package io.github.ethankelly;

import java.util.Arrays;
import java.util.Random;

/**
 * Initialise a graph for the Firefighter Problem and methods to use them in solving this problem
 *
 * @author Ethan Kelly
 * <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

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

    // Determine outbreak of fire on graph (choosing random vertex)
    public static int outbreak(int numVertices) {
        int start = new Random().nextInt(numVertices);

        System.out.println("Fire starts at: " + start);
        return start;
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

    public static void main(String[] args) throws InvalidTurnCountException {

    }
}