package io.github.ethankelly;


import java.util.Random;


/**
 * A graph is a collection of vertices connected by edges in some configuration. While the basis for the model is
 * agency, this agency is represented as interactions of vertices of a graph.
 * <p>
 * Using a graph to represent and examine allows the use of many excellent existing results in graph theory, plus the
 * use of a graph is not an unusual choice of visualisation in models of contagion even intuitively. The graphs to be
 * used in this model, objects of this class, have two important attributes:
 * <ul>
 *     <li> The number of vertices in the graph.
 *     <li> An adjacency matrix - each entry is true if the vertices represented by the row
 *          and column are connected by an edge, false otherwise
 *          (@see <a href ="https://mathworld.wolfram.com/AdjacencyMatrix.html">https://mathworld.wolfram.com/AdjacencyMatrix.html</a>).
 * </ul>
 * In much of the literature, graphs of this kind represent 'contact networks.'
 *
 * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
 */
public class Graph {
    private int numVertices;
    private int numEdges;
    private boolean[][] adjMatrix;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new boolean[numVertices][numVertices];
    }

    /**
     * Helper method for calculating the shortest path, returns the minimum value of an array of path lengths if such a
     * minimum value exists.
     *
     * @param pathArray       a collection of minimum distances from some vertex, v.
     * @param shortestPathSet array containing whether a shortest path exists from v to each vertex.
     * @return the index of the minimum value path distance from the path array.
     */
    public int minDistance(int[] pathArray, Boolean[] shortestPathSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < getNumVertices(); i++) {
            if (!shortestPathSet[i] && pathArray[i] <= min) {
                min = pathArray[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Given the current state of the model, calculates the shortest paths from a given vertex to every other vertex
     *
     * @param vertex the vertex relative to which we want to calculate paths.
     * @return the shortest path to each other vertex in the graph (if one exists).
     */
    public int[] shortestPath(int vertex) {
        int n = this.getNumVertices();
        boolean[][] adjMatrix = this.getAdjMatrix();
        int[][] matrix = new int[n][n];

        // Convert adjacency matrix from boolean to integer (true -> 1, false -> 0)
        // For ease of computation further into this method
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (adjMatrix[i][j]) matrix[i][j] = 1;

        int[] pathArray = new int[n];

        // Shortest path set contains vertices that have a shortest path
        // I.e. shortestPathSet[i] is true if i has a shortest path to the
        // parameter 'vertex' and false otherwise.
        Boolean[] shortestPathSet = new Boolean[n];

        // Initially, all distances are HUGE and shortestPathSet[] is set to false
        // I.e. no vertices have a shortest path to the parameter 'vertex'
        for (int i = 0; i < n; i++) {
            pathArray[i] = Integer.MAX_VALUE;
            shortestPathSet[i] = false;
        }
        pathArray[vertex] = 0; // Path between vertex and itself is always 0

        // Now, we find the shortest path for all vertices
        for (int count = 0; count < n - 1; count++) {
            // Call minDistance to find the vertex v with minimum distance to the parameter 'vertex'
            int u = minDistance(pathArray, shortestPathSet);
            // Then, vertex u is processed
            shortestPathSet[u] = true;
            // We now process adjacent nodes of the current vertex
            for (int v = 0; v < n; v++)
                // If vertex v is not in shortestPathSet yet, then update it
                if (!shortestPathSet[v] && matrix[u][v] != 0 && pathArray[u] !=
                        Integer.MAX_VALUE && pathArray[u]
                        + matrix[u][v] < pathArray[v])
                    pathArray[v] = pathArray[u] + matrix[u][v];
        }
        // Return the array of minimum distances to each vertex from the parameter 'vertex'
        return pathArray;
    }

    /**
     * Adds a bidirectional edge between two vertices i and j in a graph
     *
     * @param i first vertex
     * @param j second vertex
     */
    public void addEdge(int i, int j) {
        boolean[][] adjMat = getAdjMatrix();
        adjMat[i][j] = true;
        adjMat[j][i] = true;
        this.setAdjMatrix(adjMat);
        this.setNumEdges(getNumEdges() + 1);
    }

    /**
     * Removes an edge between the two vertices specified from a graph
     *
     * @param i first vertex
     * @param j second vertex
     */
    public void removeEdge(int i, int j) {
        boolean[][] adjMat = getAdjMatrix();
        adjMat[i][j] = false;
        adjMat[j][i] = false;
        this.setAdjMatrix(adjMat);
    }

    /**
     * @return The number of vertices in the graph.
     */
    public int getNumVertices() {
        return numVertices;
    }

    /**
     * Sets the number of vertices in a given graph.
     *
     * @param numVertices the number of vertices to be included in the graph.
     */
    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    /**
     * An adjacency matrix represents a (finite) graph by indicating whether a pair of vertices share an edge between
     * them. At the intersection of row i, column j, if the value is 1 there is an edge from i to j and if it's zero
     * then there is no such edge. In our uses, graphs will mostly be bidirectional, meaning this value will be the same
     * in row i, column j and row j, column i.
     *
     * @return the adjacency matrix of the graph
     */
    public boolean[][] getAdjMatrix() {
        return adjMatrix;
    }

    /**
     * Some methods update the adjacency matrix when called - this method makes this update.
     *
     * @param adjMatrix the updated version of the adjacency matrix to set.
     */
    public void setAdjMatrix(boolean[][] adjMatrix) {
        this.adjMatrix = adjMatrix;
    }

    /**
     * Determines whether there exists an edge between two vertices in a graph.
     *
     * @param i first vertex
     * @param j second vertex
     * @return true if i and j share an edge, false otherwise
     */
    public boolean isEdge(int i, int j) {
        return getAdjMatrix()[i][j] || getAdjMatrix()[j][i];
    }

    /**
     * Returns a textual representation of a graph as an adjacency matrix to be printed to the standard output.
     *
     * @return a string representation of the graph.
     */
    @Override
    public String toString() {
        int n = getNumVertices();
        boolean[][] matrix = getAdjMatrix();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(i).append(": ");
            for (boolean j : matrix[i]) {
                s.append(j ? 1 : 0).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Selects a random vertex from the set of vertices to begin the setOutbreak.
     *
     * @param numVertices the number of vertices (indexed 0, 1, ..., numVertices) to choose from
     * @return a pseudo-randomly selected vertex between 0 and numVertices to be the source node
     */
    public int randomVertex(int numVertices) {
        return new Random().nextInt(numVertices);
    }

    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }
}
