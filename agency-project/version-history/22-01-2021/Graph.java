package io.github.ethankelly;

import java.util.Random;

/**
 * Graph represented by an adjacency matrix
 *
 * @author Ethan Kelly
 */

public class Graph {
    private static boolean[][] adjMatrix; // How the graph is represented
    private static int numVertices; // No. of vertices in the graph

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

    // Get edges
    public static boolean getEdge(int i, int j) {
        return adjMatrix[i][j] || adjMatrix[j][i];
    }

    // Determine outbreak of fire on graph (choosing random vertex)
    public static int outbreak(int numVertices) {
        int start = new Random().nextInt(numVertices);

        System.out.println("Fire starts at: " + start);
        return start;
    }

    // Get minimum distance (helper)
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

    // Print the array of distances (helper)
    public static void printMinPath(int[] pathArray) {
        System.out.println("Vertex No. \t Minimum Distance from Source");
        for (int i = 0; i < numVertices; i++)
            if (pathArray[i]==Integer.MAX_VALUE) {
                System.out.println(i + " \t\t\t " + "No such path");
            } else {
                System.out.println(i + " \t\t\t " + pathArray[i]);
            }
    }

    public static int[] shortestPath(ModelState graphState, int vertex)  {
        int[][] matrix = ModelState.adjMatrix();
        int[] pathArray = new int[numVertices];

        // Shortest path set contains vertices that have shortest path
        Boolean[] shortestPathSet = new Boolean[numVertices];

        // Initially all distances are HUGE and shortestPathSet[] is set to false
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
                if (!shortestPathSet[v] && matrix[u][v] != 0 && pathArray[u] !=
                        Integer.MAX_VALUE && pathArray[u]
                        + matrix[u][v] < pathArray[v])
                    pathArray[v] = pathArray[u] + matrix[u][v];
        }

        // print the path array
        //printMinPath(pathArray);
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
}
