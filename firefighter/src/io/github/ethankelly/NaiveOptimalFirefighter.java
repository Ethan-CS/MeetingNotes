package io.github.ethankelly;

import java.util.ArrayList;
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
    public static int factorial(int input) {
        if (input <= 2) {
            return input;
        }
        return input * factorial(input - 1);
    }

    /**
     * @param perm  permutation of the open vertices
     * @return      optimal defence strategy from the combinations
     */
    public static int[] defence(Permutations perm) {
        int[][] permMatrix = perm.asMatrix();
        int[] pOptimal = new int[numVertices];
        for (int r = 0; r < factorial(numVertices); r++){
            for (int c = 0; c < numVertices; c++) {
                for (int i = 0; i < numVertices; i++) {
                    if (getEdge(permMatrix[r][c], i)) {
                        removeEdge(permMatrix[r][c], i);
                    }
                }

            }
        }

        return pOptimal;
    }

    private static class Permutations {
        public static int[] input;
        public final int numPerm;
        public final ArrayList<int[]> newList;

        public Permutations(int[] openVertices) {
            input = openVertices;
            numPerm = factorial(input.length);
            newList = new ArrayList<>(numPerm);
        }

        public void permute(int[] openVertices) {
            permutare(openVertices, 0, openVertices.length);
        }

        private void permutare(int[] array, int start, int end) {
            newList.add(saveArray(      array));

            if (start < end) {
                int i, j;
                for (i = end - 2; i >= start; i--) {
                    for (j = i + 1; j < end; j++) {
                        swap(array, i, j);
                        permutare(array, i + 1, end);
                    }
                    rotateLeft(array, i, end);
                }
            }
        }

        private int[] saveArray(int[] array) {
            int[] newArray = new int[array.length];

            System.arraycopy(array, 0, newArray, 0, array.length);
            return newArray;
        }

        public void print() {
            int[] array;
            for (int[] ints : newList) {
                array = ints;
                System.out.println(Arrays.toString(array));
            }
        }

        private void swap(int[] array, int i, int j) {
            int t;
            t = array[i];
            array[i] = array[j];
            array[j] = t;
        }

        private void rotateLeft(int[] array, int start, int end) {
            int tmp = array[start];
            if (end - 1 - start >= 0) System.arraycopy(array, start + 1, array, start, end - 1 - start);
            array[end - 1] = tmp;
        }


        public int[][] asMatrix() {
            int[][] permAsArray = new int[factorial(numVertices)][numVertices];


            return permAsArray;
        }
    }

    /**
     * @param args the command line arguments
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
        Permutations newPerm = new Permutations(openVertices);
        newPerm.permute(openVertices);
        newPerm.print();

        defence(newPerm);
    }
}