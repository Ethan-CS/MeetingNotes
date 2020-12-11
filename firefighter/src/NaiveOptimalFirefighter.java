package io.github.ethankelly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
     * Permutes a given integer array input, using helper method (below)
     *
     * @param  array an array of integers
     * @return all permutations of the given integer array as a list of lists (of integers)
     */
    public static List<List<Integer>> permute(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, array, result);
        return result;
    }

    private static void helper(int start, int[] array, List<List<Integer>> result){
        if(start == array.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num : array){
                list.add(num);
            }
            result.add(list);
            return;
        }

        for(int i=start; i<array.length; i++){
            swap(array, i, start);
            helper(start+1, array, result);
            swap(array, i, start);
        }
    }

    // Swaps two elements of an integer array
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Determine optimal defence strategy
     *
     * @param  perm permutation of the open vertices
     * @return optimal defence strategy from the combinations
     */
    public static List<Integer> optimalDefence(List<List<Integer>> perm, int[][] state, int[] openVertices) {

        List<Integer> strategy;
        int[] end = new int[factorial(openVertices.length)];

        // Cycle through defence strategies
        for (int i = 0; i < factorial(openVertices.length); i++) {

            strategy = perm.get(i); // Strategy is the i-th list of perm
            System.out.println("Strategy: " + Arrays.toString(new List[]{strategy}));

            int firstDefence = findDefence(strategy, state); // Get first defensible vertex
            System.out.println("First defensible vertex: " + firstDefence);

            List<Integer> subList = strategy.subList(firstDefence, strategy.size()); // Start strategy at first defensible vertex

            int[][] defenceState = defend(subList, state); // Defend according to strategy

            // Store end turn count for the defence (number of columns in the state matrix)
            System.out.println("LENGTH: " + defenceState[0].length);
            end[i] = defenceState[0].length;
        }

        // Find smallest length of game, return corresponding strategy
        System.out.println(Arrays.toString(end));
        System.out.println(findSmallest(end));
        return perm.get(findSmallest(end));

    }

    /**
     * Cycle through a given defence strategy, record information about how it performs
     *
     * @param strategy a defence strategy
     * @param state    the matrix containing the current state of the graph
     * @return the end state of the graph given we play the given strategy
     */
    public static int[][] defend (List<Integer> strategy, int[][] state) {
        for (int i = 1; i < strategy.size(); i++) {
            // Odd numbered turn - defensive move
            if (i % 2 == 1) {
                int defendVertex = strategy.get(i-1);
                if (state[defendVertex][i-1] == 0) {
                    // Remove all edges connected to the defended vertex
                    for (int j = 0; j < strategy.size(); j++) {
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
                int[] toBurn = burn(state, i);
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

    // Finds the smallest value in the given integer array
    public static int findSmallest (int[] array) {
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }


    //Determine first defensible vertex in a strategy
    public static int findDefence(List<Integer> strategy, int[][] state) {
        int index = -1;

        for (int i = 0; i < strategy.size(); i++) {
            if (state[strategy.get(i)][i] == 0) {
                index = i;
                break;
            }
        }
        return index;
    }


    // Prints a (permutation) array to check the method works
    public static void test(List<List<Integer>> permutation) {
        List<Integer> array;
        System.out.println("Permutations of the open vertices: ");
        for (List<Integer> ints : permutation) {
            array = ints;
            System.out.println(array);
        }
    }

    // Returns the factorial of a given integer input
    public static int factorial(int input) {
        if (input <= 2) {
            return input;
        }
        return input * factorial(input - 1);
    }

    // Gets the open vertices
    public static int[] getOpenVertices(int start, int numVertices) {
        int[] vertices = new int[numVertices];
        for (int i = 0; i < numVertices; ++i) vertices[i] = i;

        int[] openVertices = new int[numVertices - 1];
        for (int i = 0, k = 0; i < numVertices; i++) if (i != start) openVertices[k++] = vertices[i];

        return openVertices;
    }

    public static void main(String[] args) {
        // Define the graph
        int numVertices = 4;
        Graph g = new Graph(numVertices);

        g.addEdge(0, 1);
        //g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        // Print adjacency matrix
        System.out.println("Graph:");
        System.out.print(g.toString());

        // Inputs and state at t=0
        int start = outbreak(numVertices);
        var turnCount = 0;
        int[][] state = initialState(numVertices, start, turnCount);

        // Get the open vertices
        int[] openVertices = getOpenVertices(start, numVertices);

        // Get permutations to try as defence strategies
        List<List<Integer>> newPerm = permute(openVertices);
        test(newPerm);

        // Get the optimal defence strategy
        List<Integer> defend = optimalDefence(newPerm, state, openVertices);
        System.out.println("Optimal defence: " + Arrays.toString(new List[]{defend}));
    }
}