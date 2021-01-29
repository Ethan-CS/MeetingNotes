package io.github.ethankelly;

import java.util.Arrays;
import java.util.List;

/**
 * The agency-based model of this project is driven by this main class.
 *
 * @author Ethan Kelly
 */
public class Model {

    /**
     * Tests graph initialisation, model state and agent object creation
     */
    private static void runTest() {
        int numVertices = 9;
        Graph g = new Graph(numVertices);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(3, 7);
        g.addEdge(5, 8);
        g.addEdge(6, 7);
        System.out.println(g);

        int source = Graph.outbreak(numVertices);
        ModelState graphState = new ModelState(numVertices, source);

        System.out.println("   *******    ");

//        System.out.println(Arrays.toString(getFires()));

        for (int i = 0; i < numVertices; i++) {
            Agent a = new Agent(i);
            System.out.println(a.toString());
        }
    }

        public static int[] getSusceptible(List<Agent> agents) {
        int[] isSusceptible = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.SUSCEPTIBLE) {
                isSusceptible[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isSusceptible, k);
    }

    public static int[] getInfected(List<Agent> agents) {
        int[] isInfected = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.INFECTED) {
                isInfected[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isInfected, k);
    }

    public static int[] getRecovered(List<Agent> agents) {
        int[] isRecovered = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.RECOVERED) {
                isRecovered[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isRecovered, k);
    }

    public static int[] getProtected(List<Agent> agents) {
        int[] isProtected = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.PROTECTED) {
                isProtected[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isProtected, k);
    }
    
    public static void main(String[] args) {
        runTest();
    }
}
