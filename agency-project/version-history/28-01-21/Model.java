package io.github.ethankelly;

import java.util.Arrays;
import java.util.List;


/**
 * The agency-based model of this project is driven by this main class.
 *
 * @author Ethan Kelly
 */
public class Model {

    /**
     * Tests graph initialisation, model state and agent object creation
     */
    private static void runTest() {
        Graph g = new Graph(ModelState.getNumVertices());
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(3, 7);
        g.addEdge(5, 8);
        g.addEdge(6, 7);
        System.out.println(g);
    }

    private static void printMatrix(int[][] matrix) {
        // Loop through all rows
        for (int[] row : matrix)
            // Convert each row to string, then print (moving cursor down each time)
            System.out.println(Arrays.toString(row));
    }

    static void printSIRP(List<Agent> agents) {
        System.out.println("   *******    ");
        System.out.println("Susceptible: " + Arrays.toString(ModelState.getSusceptible(agents)));
        System.out.println("Infected:    " + Arrays.toString(ModelState.getInfected(agents)));
        System.out.println("Recovered:   " + Arrays.toString(ModelState.getRecovered(agents)));
        System.out.println("Protected:   " + Arrays.toString(ModelState.getProtected(agents)));
    }

    public static void main(String[] args) {
        runTest();
    }
}
