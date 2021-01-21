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

    public static int[][] getAdjMatrix() {
        int[][]adjacencyMatrix = new int[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (getEdge(i, j)) {
                    adjacencyMatrix[i][j] = 1;
                    adjacencyMatrix[j][i] = 1;
                }
            }
        }
        return adjacencyMatrix;

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

    public static int minDistance(int[] pathArray, Boolean[] shortestPathSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < numVertices; i++) {
            if (!shortestPathSet[i] && pathArray[i] <= min) {
                min = pathArray[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Print the array of distances (path_array)
    public static void printMinPath(int[] path_array) {
        System.out.println("Vertex No. \t Minimum Distance from Source");
        for (int i = 0; i < numVertices; i++)
            if (path_array[i]==Integer.MAX_VALUE) {
                System.out.println(i + " \t\t\t " + "No such path");
            } else {
                System.out.println(i + " \t\t\t " + path_array[i]);
            }
    }

    public static int[] shortestPath(int[][] graph, int vertex)  {
        int[] pathArray = new int[numVertices];

        // Shortest path set contains vertices that have shortest path
        Boolean[] shortestPathSet = new Boolean[numVertices];

        // Initially all distances are INFINITE and shortestPathSet[] is set to false
        for (int i = 0; i < numVertices; i++) {
            pathArray[i] = Integer.MAX_VALUE;
            shortestPathSet[i] = false;
        }
        // Path between vertex and itself is always 0
        pathArray[vertex] = 0;
        // now find shortest path for all vertices
        for (int count = 0; count < numVertices - 1; count++) {
            // call minDistance method to find the vertex with min distance
            int u = minDistance(pathArray, shortestPathSet);
            // the current vertex u is processed
            shortestPathSet[u] = true;
            // process adjacent nodes of the current vertex
            for (int v = 0; v < numVertices; v++)

                // if vertex v not in shortestPathSet yet, then update it
                if (!shortestPathSet[v] && graph[u][v] != 0 && pathArray[u] !=
                        Integer.MAX_VALUE && pathArray[u]
                        + graph[u][v] < pathArray[v])
                    pathArray[v] = pathArray[u] + graph[u][v];
        }

        // print the path array
        printMinPath(pathArray);
        return pathArray;
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
        int numVertices = 9;
        Graph g = new Graph(numVertices);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(3, 7);
        g.addEdge(5, 8);
        g.addEdge(6, 7);

        System.out.println(g.toString());
            shortestPath(getAdjMatrix(),0);
    }
}