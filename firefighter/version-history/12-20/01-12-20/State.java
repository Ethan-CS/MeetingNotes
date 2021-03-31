package io.github.ethankelly;

import java.util.Arrays;

public class State extends Graph {
    public State(int numVertices) {
        super(numVertices);
    }

    public static int[][] initialState(int numVertices, int start, int turnCount) {
        int[][] state = new int[numVertices][turnCount + 1];

        // Initialise with outbreak at t=0: 2,
        // everything else 0

        for (int n = 0; n <= turnCount; n++) {
            state[start][n] = 2;
        }

        return state;
    }

    // Determine which vertices burn
    public static int[] burn(int[][] state, int turnCount) {
        int[] burningVertices = new int[numVertices];

        if (turnCount % 2 != 0) {
            try {
                throw new InvalidTurnCountException("Not an even numbered turn, cannot burn adjacent vertices");
            } catch (InvalidTurnCountException e) {
                e.printStackTrace();
            }
        } else
            // burningVertices is an int array;
            // Value of 1 if vertex (index) is burning, 0 otherwise (defended or open)
            for (int i = 0; i < numVertices; i++) {
                for (int j = 0; j < numVertices; j++) {
                    // Store any vertices already on fire
                    if (state[i][turnCount - 1] == 2) {
                        burningVertices[i] = 1;
                        // Open neighbours of burning vertices catch fire
                        if (state[j][turnCount - 1] == 0 && getEdge(i, j)) {
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
        // Flag if nothing can burn by filling all entries with -1 (usually meaningless
        // in array: 1 if burning, 0 if not)
        if (Arrays.equals(burningVertices, previouslyBurning)) {
            Arrays.fill(burningVertices, -1);
        }

        return burningVertices;

    }

    // Update the state of the graph given what is currently burning
    public static int[][] updateStateBurning(int[][] state, int[] toBurn, int turnCount) {
        int[][] updatedBurning = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updatedBurning[i][j] = state[i][j];
                updatedBurning[i][j + 1] = state[i][j];
            }
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                // If something is previously burned or defended, ensure all following
                // incidences also that state
                if (toBurn[i] == 1) {
                    if (getEdge(i, j)) {
                        updatedBurning[j][turnCount] = 2;
                    }
                }
            }
        }
        // Test:
        // System.out.print(Arrays.deepToString(updatedBurning));
        return updatedBurning;
    }


    // Update the state of the graph given defence information
    public static int[][] updateStateDefence(int[][] state, int defend, int turnCount) {

        int[][] updatedDefence = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updatedDefence[i][j] = state[i][j];
                updatedDefence[i][j + 1] = state[i][j];
            }
        }

        for (int k = turnCount; k <= turnCount; k++) {
            // Only update what has been defended
            updatedDefence[defend][k] = 1;
        }
        // Test:
        // System.out.println(Arrays.deepToString(updatedState));
        return updatedDefence;

    }
}