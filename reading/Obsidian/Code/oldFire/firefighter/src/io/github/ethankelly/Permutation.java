package io.github.ethankelly;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

/**
 * Permute a given array of vertices, store as ArrayList of integers
 *
 * NB Not currently used in NaiveOptimalFirefighter, although some methods have been added to that class
 *
 * @author Ethan Kelly
 * <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

public class Permutation implements Serializable {
    public static int[] a;
    public static int numPerm;
    public static ArrayList<int[]> newList;

    //(int[] array) {
    public Permutation(int[] array) {
        a = array;
        numPerm = factorial(a.length);
        newList = new ArrayList<>(numPerm);
    }



    // Calculate factorial of an integer input
    public static int factorial(int input) {
        if (input <= 2) {
            return input;
        }
        return input * factorial(input - 1);
    }

    public static ArrayList<int[]> permute(int[] openVertices) {
        permuteMethod(a, 0, a.length);
        return null;
    }

    public static void permuteMethod(int[] array, int start, int end) {
        newList.add(saveArray(array));

        if (start < end) {
            int i, j;
            for (i = end - 2; i >= start; i--) {
                for (j = i + 1; j < end; j++) {
                    swap(array, i, j);
                    permuteMethod(array, i + 1, end);
                }
                rotateLeft(array, i, end);
            }
        }
    }

    private static int[] saveArray(int[] array) {
        int[] newArray = new int[array.length];

        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static void test() {
        int[] array;
        for (int[] ints : newList) {
            array = ints;
            System.out.println(Arrays.toString(array));
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t;
        t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static void rotateLeft(int[] array, int start, int end) {
        int tmp = array[start];
        if (end - 1 - start >= 0) System.arraycopy(array, start + 1, array, start, end - 1 - start);
        array[end - 1] = tmp;
    }
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("AccessStaticViaInstance")
    public static void main(String[] args) {
        int[] toPermute = new int[] {2, 3, 5, 7, 9};
        Permutation newPerm = new Permutation(toPermute);
        newPerm.permute(toPermute);
        newPerm.test();
    }

    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }

}