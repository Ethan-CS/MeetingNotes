package io.github.ethankelly;

import java.util.Arrays;

public class Model {

    // Returns an array of any vertices currently infected (on fire)
    public static int[] getFires(ModelState modelState) {
        int[][] state = modelState.getGraphState();
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

    public static int[] getDefended(ModelState modelState) {
        int[][] state = modelState.getGraphState();
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
        //ModelState.printMatrix(ModelState.adjMatrix());

        System.out.println("   *******    ");

        System.out.println(Arrays.toString(getFires(graphState)));

        for (int i = 0; i < numVertices; i++) {
            Agent a = new Agent(i, graphState);
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {
        runTest();
    }
}
