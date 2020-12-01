package io.github.ethankelly;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Permute a given array of vertices, store as ArrayList of integers
 *
 * @author Ethan Kelly
 * <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

public class Permutation {
    public static int[] a;
    public final int numPerm;
    public final ArrayList<int[]> newList;

    public Permutation() {
        a = new int[3];
        Arrays.setAll(a, x -> x );
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

    public void permute() {
        permuteMethod(a, 0, a.length);
    }

    private void permuteMethod(int[] array, int start, int end) {
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

    private int[] saveArray(int[] array) {
        int[] newArray = new int[array.length];

        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public void test() {
        System.out.println("the current size of newList is : " + newList.size());
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Permutation newPerm = new Permutation();
        newPerm.permute();
        newPerm.test();
    }
}