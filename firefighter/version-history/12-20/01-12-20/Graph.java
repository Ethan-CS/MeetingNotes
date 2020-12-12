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
        // Define the graph
        int numVertices = 4;
        Graph g = new Graph(numVertices);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        // Print adjacency matrix
        System.out.println("Graph:");
        System.out.print(g.toString());
    }
}