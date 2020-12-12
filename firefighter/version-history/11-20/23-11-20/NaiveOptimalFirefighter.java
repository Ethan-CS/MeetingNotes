package io.github.ethankelly;


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

    // Calculate factorial of an integer input
    public static int factorial(int input) {
        if (input <= 2) {
            return input;
        }
        return input * factorial(input - 1);
    }

    /**
     * Determine optimal defence strategy
     *
     * @param perm permutation of the open vertices
     * @return optimal defence strategy from the combinations
     */
    public static int[] optimalDefence(int[][] perm, int[][] state) {
        /*
         * Cycle through defence strategies
         * find end turn count for each and how many vertices burned in each (did we play all defences?)
         * use this info to determine the optimal strategy of all permutations
         */
        int[] pOptimal = new int[0];
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
     * Generates a matrix populated with all permutations of given vertex set
     *
     * @param  openVertices integer array of all open (neither burning nor defended) vertices
     * @return 2d array with all permutations of the open vertices
     */
    public static int[][] permute(int[] openVertices) {
        return permuteMethod(openVertices, 0, openVertices.length);
    }

    // Implement Heap's algorithm to find all permutations of given array of open vertices
    private static int[][] permuteMethod(int[] array, int start, int end) {
        int[][] permutation = new int[factorial(array.length)][array.length];

        if (start < end) {
            int i, j;
            for (i = end - 2; i >= start; i--) {
                for (j = i + 1; j < end; j++) {
                    swap(array, i, j);
                    permuteMethod(array, i + 1, end);
                    //System.out.println(Arrays.toString(array));
                    permutation[i] = array;
                }
                rotateLeft(array, i, end);
            }
        }
        return permutation;
    }

    // Swaps two array elements
    private static void swap(int[] array, int i, int j) {
        int t;
        t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    // Rotates the array
    private static void rotateLeft(int[] array, int start, int end) {
        int tmp = array[start];
        if (end - 1 - start >= 0) System.arraycopy(array, start + 1, array, start, end - 1 - start);
        array[end - 1] = tmp;
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
        int[][] newPerm = permute(openVertices);
        printMatrix(newPerm);

        // Get the optimal defence strategy
        int[] defend = optimalDefence(newPerm, state);
        System.out.println(Arrays.toString(defend));
    }
}