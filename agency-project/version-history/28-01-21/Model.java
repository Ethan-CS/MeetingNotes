package io.github.ethankelly;

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

    public static void main(String[] args) {
        runTest();
    }
}
