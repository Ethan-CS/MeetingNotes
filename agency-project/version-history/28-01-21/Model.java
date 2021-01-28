package io.github.ethankelly;

import java.util.Arrays;

/**
 * The agency-based model of this project is driven by this main class. The methods here
 * are used to pass probabilities which dictate infection dynamics, depending on the
 * particular context we want to consider.
 *
 * @author Ethan Kelly
 */
public class Model {

    // Returns an array of any vertices currently infected (on fire)
    public static int[] getFires() {
        int[][] state = ModelState.getGraphState();
        int vertices = state.length;
        int currentRound = state[0].length;

        int[] vertexSet = new int[vertices];
        for (int i = 0; i < vertices; ++i) vertexSet[i] = i;

        int[] onFire = new int[vertices - 1];
        int k = 0;
        for (int i = 0; i < vertices; i++) {
            if (state[i][currentRound-1] == 2) {
                onFire[k++] = vertexSet[i];
            }
        }
        return Arrays.copyOf(onFire, k);
    }

    public static int[] getDefended() {
        int[][] state = ModelState.getGraphState();
        int vertices = state.length;
        int currentRound = state[0].length;

        int[] vertexSet = new int[vertices];
        for (int i = 0; i < vertices; ++i) vertexSet[i] = i;

        int[] defended = new int[vertices - 1];
        int k = 0;
        for (int i = 0; i < vertices; i++) {
            if (state[i][currentRound-1] == 1) {
                defended[k++] = vertexSet[i];
            }
        }
        return Arrays.copyOf(defended, k);
    }

    // Tests graph initialisation, model state and agent object creation
    private static void runTest() {
        int numVertices = 9;
        Graph g = new Graph(numVertices);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(3, 7);
        g.addEdge(5, 8);
        g.addEdge(6, 7);
        System.out.println(g);

        int source = Graph.outbreak(numVertices);
        ModelState graphState = new ModelState(numVertices, source);

        System.out.println("   *******    ");

        System.out.println(Arrays.toString(getFires()));

        for (int i = 0; i < numVertices; i++) {
            Agent a = new Agent(i);
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {
        runTest();
    }
}
