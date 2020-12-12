package io.github.ethankelly;

import java.util.Arrays;

import static io.github.ethankelly.Permutation.factorial;
import static io.github.ethankelly.Permutation.permutation;


/**
 * Program to return an optimal firefighter solution
 *
 * @author ethankelly
 */

public class NaiveOptimalFirefighter extends State {

    public NaiveOptimalFirefighter(int numVertices) {
        super(numVertices);
    }

    /**
     * Determine optimal defence strategy
     *
     * @param perm permutation of the open vertices
     * @return optimal defence strategy from the combinations
     */
    public static int[] optimalDefence(int[][] perm, int[][] state) {
        int[] pOptimal = new int[0];
        /*
         * Cycle through defence strategies
         * find end turn count for each and how many vertices burned in each (did we play all defences?)
         * use this info to determine the optimal strategy of all permutations
         */
        return pOptimal;
    }

    public static int findDefence(int[] strategy, int i, int[][] state) {
        // Initialise at -1 - catch this as meaning no possible defences
        int index = -1;

        for (int j = i; j < strategy.length; j++) {
            if (state[strategy[j]][state[0].length] == 0) {
                index = j;
            }
        }
        System.out.println("First possible defence in " + Arrays.toString(strategy) + " is " + strategy[index]);
        return index;
    }


     public static int[][] defence(int[] strategy, int[][] state) {
        /*
         * Given a strategy (and which row it is in permutation matrix)
         * defend first defensible vertex, i++, burn relevant vertices, i++, repeat
         * No: "Impossible defence strategy," break
         * How many of the vertices was it necessary to defend, if we defended all? When was the fire contained?
         *
         */
        for (int i = 1; i < strategy.length; i++) {
            if (i % 2 == 1) {
                int defendVertex = strategy[findDefence(strategy, i - 1, state)];
                // Remove all edges connected to the defended vertex
                for (int j = 0; j < strategy.length; j++) {
                    if (getEdge(defendVertex, j)) {
                        removeEdge(defendVertex, j);
                    }
                }
                // Update the state with defence information
                state = updateStateDefence(state, defendVertex, i);
                System.out.println("After defence: ");
                printMatrix(state);
            } else {
                int[] toBurn = burn(state, i + 1);
                int[] comparator = new int[numVertices];
                Arrays.fill(comparator, -1);

                // See if anything can be burned
                if (Arrays.equals(toBurn, comparator)) {
                    System.out.println("No vertices can be burned; game over.");
                    break;
                } else {
                    // Burn all open neighbours of burning vertices
                    state = updateStateBurning(state, toBurn, i);
                    System.out.println("After burning: ");
                    printMatrix(state);
                }

            }
        }
        return state;
    }


    /**
     *
     */
    public static void main(String[] args) {
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

        // Inputs and state at t=0
        int start = outbreak(numVertices);
        var turnCount = 0;
        int[][] state = initialState(numVertices, start, turnCount);

        // Find the open vertices
        int[] vertices = new int[numVertices];
        for (int i = 0; i < numVertices; ++i) vertices[i] = i;

        int[] openVertices = new int[numVertices - 1];
        for (int i = 0, k = 0; i < numVertices; i++) if (i != start) openVertices[k++] = vertices[i];

        // Give all permutations of the open vertices
        int w = openVertices.length;
        int h = factorial(w);
        int[][] newPerm = new int[h][w];
        newPerm = permutation(openVertices, 0, w);
        printMatrix(newPerm);

        // Get the optimal defence strategy
        //int[] defend = optimalDefence(newPerm, state);
        //System.out.println(Arrays.toString(defend));
    }
}