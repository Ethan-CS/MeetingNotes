package io.github.ethankelly;


import java.util.Arrays;

/**
 * Program to return an optimal firefighter solution
 *
 * @author ethankelly
 */

public class NaiveOptimalFirefighter extends Graph {

    public NaiveOptimalFirefighter(int numVertices) {
        super(numVertices);
    }

    // Array of vertices
    public static int[] vertexArray(int numVertices) {
        int[] a = new int[numVertices];
        for (int i = 0; i < numVertices; ++i) a[i] = i;
        return a;
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
         * discount any that aren't possible
         * find end turn count for each and how many vertices burned in each (did we play all defences?)
         * use this info to determine the optimal strategy of all permutations
         */
        int[] pOptimal = new int[numVertices];
        for (int i = 0; i < perm[0].length; i++) {
            defence(perm[i], i, state);
        }

        return pOptimal;
    }

    public static boolean canDefend(int[] strategy, int permNumber, int index, int[][] state) {
        boolean defencePossible = false;
        if (state[permNumber][index] != strategy[index]) {
            defencePossible = true;
        }
        return defencePossible;
    }
    
    public static int[][] defence(int[] strategy, int permNumber, int[][] state) {
        /*
         * Given a strategy (and which row it is in permutation matrix)
         * Play defence at position i (starting at 0)
         * burn all open neighbours of the outbreak
         * i++
         * possible to defend vertex at position i?
         * Yes: defend, i++, burn relevant vertices, possible to defend at i?
         * No: "Impossible defence strategy," break
         * How many of the vertices was it necessary to defend, if we defended all? When was the fire contained?
         *
         */
        for (int i = 1; i < strategy.length; i++) {
            if (canDefend(strategy, permNumber, i, state)) {
                state = updateStateBurning(updateStateDefence(state, strategy[i-1], i), burn(state, i+1), i+1);
            } else {
                System.out.println(" Permutation " + Arrays.toString(strategy) + " is not a valid defence strategy");
                break;
            }
        }
        return state;
    }
    
    /**
     * Generate matrix populated with all permutations of openVertices
     *
     * @param   openVertices int array of all vertices neither burning nor defended
     * @return  2d array populated with all permutations of openVertices
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
                }
                rotateLeft(array, i, end);
                permutation[i] = array;
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
        int[] vertices = vertexArray(numVertices);
        int[] openVertices = new int[numVertices - 1];
        for (int i = 0, k = 0; i < numVertices; i++) if (i != start) openVertices[k++] = vertices[i];

        // Give all permutations of the open vertices
        int[][] newPerm = permute(openVertices);
        printMatrix(newPerm);

        int[] defend = optimalDefence(newPerm, state);
        System.out.println(Arrays.toString(defend));
    }
}
