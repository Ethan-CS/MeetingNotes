package io.github.ethankelly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Takes a graph input, selects a random vertex to begin the fire,
 * returns an optimal solution to the firefighter problem in this context.
 *
 * @author ethankelly
 */

public class NaiveOptimalFirefighter extends State {

    public NaiveOptimalFirefighter(int numVertices) {
        super(numVertices);
    }


    /**
     * Permutes a given integer array input
     *
     * @param array an array of integers
     * @return all permutations of the given integer array as a list of lists (of integers)
     */
    public static List<List<Integer>> permute(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, array, result);
        return result;
    }

    // Helper method for permute()
    private static void helper(int start, int[] array, List<List<Integer>> result) {
        if (start == array.length - 1) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : array) {
                list.add(num);
            }
            result.add(list);
            return;
        }

        for (int i = start; i < array.length; i++) {
            swap(array, i, start);
            helper(start + 1, array, result);
            swap(array, i, start);
        }
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

    // Swaps two elements of an integer array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    /**
     * Determine optimal defence strategy
     *
     * @param perm         permutation of the open vertices
     * @param state        the current state of the graph
     * @param openVertices the vertices not currently burning or defended
     * @return optimal defence strategy from the combinations
     */
    public static List<Integer> optimalDefence(List<List<Integer>> perm, int[][] state, int[] openVertices) {

        List<Integer> strategy;
        int[] end = new int[factorial(openVertices.length)];

        // Cycle through defence strategies
        for (int i = 0; i < factorial(openVertices.length); i++) {

            strategy = perm.get(i); // Strategy is the i-th list of perm
            //System.out.println("Strategy: " + Arrays.toString(new List[]{strategy}));

            int firstDefence = findDefence(strategy, state); // Get first defensible vertex
            //System.out.println("First defensible vertex: " + firstDefence);

            List<Integer> subList = strategy.subList(firstDefence, strategy.size()); // Start strategy at first defensible vertex

            int[][] defenceState = defend(subList, state); // Defend according to strategy

            // Store end turn count for the defence (number of columns in the state matrix)
            //System.out.println("LENGTH: " + defenceState[0].length);
            end[i] = defenceState[0].length;
        }

        // Find smallest length of game, return corresponding strategy
        System.out.println("Number of rounds for each strategy: " + Arrays.toString(end));
        //System.out.println("Optimal length: " + end[findSmallest(end)]);

        List<Integer> fullOptimalStrategy = perm.get(findSmallest(end));
        int[] fullOptimalArray = fullOptimalStrategy.stream().mapToInt(i->i).toArray();

        int lengthOfState = end[findSmallest(end)];

        // Work out how many vertices we actually had to defend
        int numberOfDefences;
        if (lengthOfState % 2 == 1) {
            numberOfDefences = ((lengthOfState + 1) / 2);
        } else {
            numberOfDefences = (lengthOfState / 2);
        }

        System.out.println("Full optimal strategy: " + fullOptimalStrategy.toString());

        //System.out.println("Number of defences played: " + numberOfDefences);
        //System.out.println("Actual strategy: " + Arrays.toString(Arrays.copyOfRange(fullOptimalArray, 0, numberOfDefences)));

        return Arrays.stream(Arrays.copyOfRange(fullOptimalArray, 0, numberOfDefences))
                                         .boxed()
                                         .collect(Collectors.toList());

    }

    /**
     * Cycle through a given defence strategy, record information about how it performs
     *
     * @param strategy a defence strategy
     * @param state    the matrix containing the current state of the graph
     * @return the end state of the graph given we play the given strategy
     */
    public static int[][] defend(List<Integer> strategy, int[][] state) {
        for (int i = 1; i < strategy.size(); i++) {
            // Odd numbered turn - defensive move
            if (i % 2 == 1) {
                int defendVertex = strategy.get(i - 1);
                if (state[defendVertex][i - 1] == 0) {
                    // Remove all edges connected to the defended vertex
                    for (int j = 0; j < strategy.size(); j++) {
                        if (getEdge(defendVertex, j)) {
                            removeEdge(defendVertex, j);
                        }
                    }
                    // Update the state with defence information
                    state = updateStateDefence(state, defendVertex, i);

                    //System.out.println("After defence: ");
                    //printMatrix(state);
                } else {
                    //System.out.println("Nothing to defend; game over.");
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

                    //System.out.println("After burning: ");
                    //printMatrix(state);
                } else {
                    //System.out.println("No vertices can be burned; game over.");
                    break;
                }
            }
        }
        // For each element in defence, if it could have been defended in the turn it was played
        // (i.e. 2x the index) then leave it, otherwise remove using .remove()
        // OR perhaps easier, read off defence from last column of state!

        return state;
    }

    // Finds the smallest value in the given integer array
    public static int findSmallest(int[] array) {
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

    // Gets the open vertices
    public static int[] getOpenVertices(int[][] state, int numVertices) {
        int currentRound = state[0].length;

        int[] vertices = new int[numVertices];
        for (int i = 0; i < numVertices; ++i) vertices[i] = i;

        int[] openVertices = new int[numVertices - 1];
        for (int i = 0, k = 0; i < numVertices; i++) if (state[i][currentRound-1] == 0) openVertices[k++] = vertices[i];

        return openVertices;
    }

    public static void main(String[] args) {
        // Define the graph
        int numVertices = 10; // Indexed 0 to 5
        Graph g = new Graph(numVertices);

        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
        g.addEdge(3, 7);
        g.addEdge(3, 8);
        g.addEdge(4, 6);
        g.addEdge(4, 7);
        g.addEdge(4, 8);
        g.addEdge(6, 7);
        g.addEdge(6, 8);
        g.addEdge(6, 9);
        g.addEdge(7, 8);
        g.addEdge(7, 9);
        g.addEdge(8,9);

        // Print adjacency matrix
        System.out.println("Graph:");
        System.out.print(g.toString());

        // Inputs and state at t=0
        int start = 2;//outbreak(numVertices);
        var turnCount = 0;
        int[][] state = initialState(numVertices, start, turnCount);

        // Get the open vertices
        int[] openVertices = getOpenVertices(state, numVertices);
        System.out.println("Open vertices: " + Arrays.toString(openVertices));

        // Get permutations to try as defence strategies
        List<List<Integer>> newPerm = permute(openVertices);
        test(newPerm);

        // Get the optimal defence strategy
        List<Integer> defend = optimalDefence(newPerm, state, openVertices);
        System.out.println("If the fire starts at " + start + ", then our optimal defence is: " + defend.toString());
    }
}