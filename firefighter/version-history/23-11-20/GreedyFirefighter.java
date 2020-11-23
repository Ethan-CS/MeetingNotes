package io.github.ethankelly;

import java.util.Arrays;


/**
 *
 * Firefighter defence uses Greedy algorithm (1/2 approx. for optimal solution)
 *
 * @author Ethan Kelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 *
 */


public class  GreedyFirefighter extends State {

    public GreedyFirefighter(int numVertices) {
        super(numVertices);
    }

    // Weight of each vertex
    public static int weightVertex(boolean[][] adjMatrix, int vertex) {
        int weight = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjMatrix[i][vertex]) {
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
        for (int i = 0; i < weightsArray.length; i++) {
            if (weightsArray[i] > max) {
                max = weightsArray[i];
                index = i;
            }

        }

        return index;
    }

    // Choose which vertex to defend each odd turnCount
    public static int defence(int[][] state, int turnCount) {
        int defendVertex = 0;
        int[] possibleWeights = weightsArray(adjMatrix);

        if (turnCount % 2 == 0) {
            // TODO Make this an exception!
            System.out.println("Not an odd numbered turn, cannot defend");
        } else
            for (int i = 0; i < numVertices; i++) {
            if (state[i][turnCount - 1] != 0) {
                possibleWeights[i] = 0;
            }
            defendVertex = largestWeight(possibleWeights);
        }
        for (int j = 0; j < numVertices; j++) {
            if (getEdge(defendVertex, j)) {
                removeEdge(defendVertex, j);
            }
        }
        if (possibleWeights[defendVertex] == 0) {
            defendVertex = numVertices + 1;
        } else {
            System.out.println("Defending heaviest possible vertex: " + defendVertex);
        }

        return defendVertex;
    }

    // Main method
    public static void main(String[] args) {
        // Define graph g
        int numVertices = 4;
        Graph g = new Graph(numVertices);

        // Add edges between vertices
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        // Print adjacency matrix
        System.out.println("Graph:");
        System.out.print(g.toString());

        // Inputs and state at t=0
        int turnCount = 0;
        int start = outbreak(numVertices);
        int[][] state = initialState(numVertices, start, turnCount);
        System.out.println("Initial state of play: ");
        printMatrix(state);
        turnCount++;

        // In odd rounds, defend;
        // In even rounds, determine what is burning.
        // Two possibilities to end: we can't defend anything else, or we can't burn
        // anything (e.g. fire is contained).
        for (int c = turnCount; c < numVertices * 10; c++) {
            System.out.println("---- Turn Count: " + c + " ----");
            if (c % 2 == 1) {
                // Play a defence
                int defend = defence(state, c);
                // See if we can defend anything
                if (defend > numVertices) {
                    System.out.println("No defensive moves can be made; game over.");
                    break;
                } else {
                    int[][] newState = updateStateDefence(state, defend, c);
                    System.out.println("After defence: ");
                    printMatrix(newState);
                    state = newState;
                }

            } else {
                // Determine burning vertices
                int[] toBurn = burn(state, c);
                int[] comparator = new int[numVertices];
                Arrays.fill(comparator, -1);
                // See if anything can be burned
                if (Arrays.equals(toBurn, comparator)) {
                    System.out.println("No vertices can be burned; game over.");
                    break;
                } else {
                    /*
                     * Test: prints the vertices to burn System.out.print("Burning: "); for (int i =
                     * 0; i < numVertices; i++) { if (toBurn[i] == 1) { System.out.print(i + " "); }
                     * } System.out.println();
                     */
                    int[][] newState = updateStateBurning(state, toBurn, c);
                    System.out.println("After burning: ");
                    printMatrix(newState);
                    state = newState;
                }

            }
        }
    }
}
