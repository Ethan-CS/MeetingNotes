package io.github.ethankelly;

import java.util.ArrayList;
import java.util.Arrays;

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
    public static int[] optimalDefence(ArrayList<int[]> perm, int[][] state) {
        int[] pOptimal = new int[0];
        /*
         * Cycle through defence strategies
         * find end turn count for each and how many vertices burned in each (did we play all defences?)
         * use this info to determine the optimal strategy of all permutations
         */
        return pOptimal;
    }
    /**
     * Determine first defensible vertex in a strategy
     *
     * @param  strategy a defence strategy
     * @param  i the vertex we want to start at
     * @param  state the matrix containing the current state of the graph
     * @return optimal defence strategy from the combinations
     */
    public static int findDefence(int[] strategy, int i, int[][] state) {
        // Initialise at -1 - catch this as meaning no possible defences
        int index = -1;
        // Traverse strategy, find first open vertex
        for (int j = i; j < strategy.length; j++) {
            if (state[strategy[j]][state[0].length] == 0) {
                index = j;
                break;
            }
        }
        if (index == -1) {
            System.out.println("No defence possible in this strategy");
        } else {
            System.out.println("First possible defence in " + Arrays.toString(strategy) + " is " + strategy[index]);
        }
        return index;
    }

    /**
     * Cycle through a given defence strategy, record information about how it performs
     *
     * @param  strategy a defence strategy
     * @param  state the matrix containing the current state of the graph
     * @return the end state of the graph given we play the given strategy
     */
     public static int[][] defence(int[] strategy, int[][] state) {
        /*
         * Given a strategy (and which row it is in permutation matrix)
         * defend first defensible vertex, i++, burn relevant vertices, i++, repeat
         * No: "Impossible defence strategy," break
         * How many of the vertices was it necessary to defend, if we defended all? When was the fire contained?
         *
         */
        for (int i = 1; i < strategy.length; i++) {
            // Odd numbered turns - defence move
            if (i % 2 == 1) {
                int defendVertex = strategy[findDefence(strategy, i - 1, state)];
                if (defendVertex >= 0) {


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
                    System.out.println("Nothing to defend");
                    break;
                }
            } else {
                // Even turn count - burn all open vertices adjacent to a burning vertex
                int[] toBurn = burn(state, i + 1);
                int[] comparator = new int[numVertices];
                Arrays.fill(comparator, -1);

                // See if anything can be burned
                if (!Arrays.equals(toBurn, comparator)) {
                    // Burn all open neighbours of burning vertices
                    state = updateStateBurning(state, toBurn, i);
                    System.out.println("After burning: ");
                    printMatrix(state);
                } else {
                    System.out.println("No vertices can be burned; game over.");
                    break;
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
        int numVertices = 12;
        Graph g = new Graph(numVertices);

        g.addEdge(0, 5);
        g.addEdge(1, 5);
        g.addEdge(1, 6);
        g.addEdge(1, 10);
        g.addEdge(1, 11);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 6);
        g.addEdge(3, 4);
        g.addEdge(3, 6);
        g.addEdge(3, 11);
        g.addEdge(5, 10);

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
        int h = Permutation.factorial(w);
       // int[][] newPerm = Permutation.permutations(openVertices, 0, w);
      //  printMatrix(newPerm);

        // Get the optimal defence strategy
        //int[] defend = optimalDefence(newPerm, state);
        //System.out.println(Arrays.toString(defend));
    }
}