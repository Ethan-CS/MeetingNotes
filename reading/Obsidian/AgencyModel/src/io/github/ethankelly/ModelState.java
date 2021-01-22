package io.github.ethankelly;

import java.util.Arrays;

/**
 * Store the state of a graph (as a 2d array) at each time-step
 *
 * @author Ethan Kelly
 * <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

public class ModelState {
    private static int numVertices;
    private static int[][] graphState;

    public ModelState(int numVertices, int source) {
        ModelState.numVertices = numVertices;
        graphState = initialState(numVertices, source);
    }

    public static int[][] adjMatrix() {
        int[][] matrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (Graph.getEdge(i, j)) {
                    matrix[i][j] = 1;
                    matrix[j][i] = 1;
                }
            }
        }
        return matrix;
    }

    /**
     * Rows correspond to vertices, columns correspond to turn count.
     * Defence happens in odd rounds, burning in even rounds.
     * 0 -> open; 1 -> defended; 2 -> burning.
     */

    private static int[][] initialState(int numVertices, int outbreak) {
        int[][] state = new int[numVertices][1];
        // Initialise with outbreak at t=0 -> 2, everything else -> 0
        state[outbreak][0] = 2;

        return state;
    }

    // Determine which vertices burn
    public static int[] burn(int[][] state, int turnCount) {
        int[] burningVertices = new int[getNumVertices()];
            // Value of 1 if vertex (index) is burning, 0 otherwise (defended or open)
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    // Store any vertices already on fire
                    if (state[i][turnCount - 1] == 2) {
                        burningVertices[i] = 1;
                        // Open neighbours of burning vertices catch fire
                        if (state[j][turnCount - 1] == 0 && Graph.getEdge(i, j)) {
                            burningVertices[j] = 1;
                        }
                    }
                }
            }
        // Array containing vertices burning last round,
        // Used to check if we should end (in main())
        int[] previouslyBurning = new int[numVertices];
        for (int k = 0; k < numVertices; k++) {
            if (state[k][turnCount - 1] == 2) {
                previouslyBurning[k] = 1;
            }
        }
        // If we haven't burned anything new, fire cannot spread, end game
        // Flag if nothing can burn by filling all entries with -1
        if (Arrays.equals(burningVertices, previouslyBurning)) {
            Arrays.fill(burningVertices, -1);
        }

        return burningVertices;

    }

    //TODO public static int[][] updateState(int[][] state, int turnCount) {calls burn or defence}

    // Update the state of the graph given what is currently burning
    public static int[][] updateStateBurning(int[][] state, int[] toBurn, int turnCount) {
        int[][] updated = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updated[i][j] = state[i][j];
                updated[i][j + 1] = state[i][j];
            }
        }
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                // If something is previously burned or defended, ensure all following
                // incidences also that state
                if (toBurn[i] == 1) {
                    if (Graph.getEdge(i, j)) {
                        updated[j][turnCount] = 2;
                    }
                }
            }
        }
        return updated;
    }

    // Update the state of the graph given defence information
    public static int[][] updateStateDefence(int[][] state, int defend, int turnCount) {
        int[][] updated = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updated[i][j] = state[i][j];
                updated[i][j + 1] = state[i][j];
            }
        }
        for (int k = turnCount; k <= turnCount; k++) {
            // Only update what has been defended
            updated[defend][k] = 1;
        }
        return updated;
    }

    public static void printMatrix(int[][] matrix) {
        // Loop through all rows
        for (int[] row : matrix)
            // Convert each row to string, then print (moving cursor down each time)
            System.out.println(Arrays.toString(row));
    }

    public static int getNumVertices() {
        return numVertices;
    }

    public static int[][] getGraphState() {
        return ModelState.graphState;
    }

    public static void setGraphState(int[][] graphState) {
        ModelState.graphState = graphState;
    }
}