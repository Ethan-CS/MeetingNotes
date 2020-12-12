package io.github.ethankelly;

/**
 * Generates a matrix populated with all permutations of given vertex set
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implement Heap's algorithm to find all permutations of given array of open vertices
 */
public class Permutation {
    public static int[] a;
    public int size;
    public int numPerm;
    public ArrayList<int[]> newList;

    public Permutation() {
        a = new int[size];
        for (int x = 0; x < size; x++)
            a[x] = x + 1;
        numPerm = factorial(a.length);
        newList = new ArrayList<>(numPerm);
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

    // Calculate factorial of an integer input
    public static int factorial(int input) {
        if (input <= 2) {
            return input;
        }
        return input * factorial(input - 1);
    }

    public static void permute() {
        permutation(a, 0, a.length);
    }

    static int[][] permutation(int[] array, int start, int end) {
        int w = array.length;
        int h = factorial(w);
        int[][] permutation = new int[h][w];


        if (start < end) {
            int i, j;
            for (i = end - 2; i >= start; i--) {
                for (j = i + 1; j < end; j++) {
                    swap(array, i, j);
                    permutation(array, i + 1, end);
                    permutation[i] = saveArray(array);
                }
                rotateLeft(array, i, end);
            }
        }
        return permutation;
    }

    private static int[] saveArray(int[] array) {
        int[] newArray = new int[array.length];

        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public void print() {
        System.out.println("the current size of newList is : " + newList.size());
        int[] array = new int[a.length];
        for (int x = 0; x < newList.size(); x++) {
            array = newList.get(x);
            System.out.println(Arrays.toString(array));
        }
    }
}
