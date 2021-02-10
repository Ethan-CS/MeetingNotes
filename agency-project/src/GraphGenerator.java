package io.github.ethankelly;

import java.util.stream.IntStream;

/**
 * The {@code GraphGenerator} class provides several methods for creating various graphs, including Erdos-Renyi random
 * graphs, random bipartite graphs, random k-regular graphs, and random rooted trees.
 *
 * @author Ethan Kelly
 */
public class GraphGenerator {
    private static long seed;

    static {
        setSeed();
    }

    /**
     * The Edge class is used to represent an edge as a pair of vertex locations (v, w) where v < w, between which the
     * edge exists.
     *
     * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
     */
    private static final class Edge implements Comparable<Edge> {
        private final int v;
        private final int w;


        /**
         * Class constructor - ensures v is less than w.
         *
         * @param v the first vertex the edge is attached to.
         * @param w the other vertex the edge is attached to.
         */
        private Edge(int v, int w) {
            if (v < w) {
                this.v = v;
                this.w = w;
            } else {
                this.v = w;
                this.w = v;
            }
        }

        /**
         * Compares the location of two edges. Returns -1 if either this v is less than the v given as a parameter or
         * this w is less than the w given as a parameter.
         *
         * @param that the edge to which we compare the current edge.
         * @return 1 if the original v or w are each greater than their parameter counterparts, -1 if at least one of
         * the original v or w are less than the comparison v or w, 0 if the edges have the same start and end vertices
         * (i.e. they are the same edge).
         */
        public int compareTo(Edge that) {
            if (this.v < that.v || this.w < that.w) return -1;
            else if (this.v > that.v || this.w > that.w) return +1;
            else return 0;
        }
    }

    /**
     * A simple graph is an unweighted and undirected graph with no loops or multiple edges.A simple graph may be either
     * connected or disconnected. This method randomly generates and returns such a simple graph given (valid) numbers
     * of vertices and edges.
     *
     * @param numVertices the number of vertices.
     * @param numEdges    the number of vertices.
     * @return a random simple graph on the given number of vertices with the given number of edges.
     * @throws AssertionError if no such simple graph can be generated.
     */
    public static Graph simple(int numVertices, int numEdges) {
        assert numEdges <= numVertices * (numVertices - 1) / 2 : "Too many edges.";
        assert numEdges >= 0 : "Too few edges.";
        Graph g = new Graph(numVertices);
        g.setNumEdges(0);
        Set<Edge> set = new Set<>();
        while (g.getNumEdges() < numEdges) {
            int v = StdRandom.uniform(numVertices);
            int w = StdRandom.uniform(numVertices);
            Edge e = new Edge(v, w);
            if ((v != w) && !set.contains(e)) {
                set.add(e);
                g.addEdge(v, w);
            }
        }
        return g;
    }

    /**
     * Generates and returns a random Erdős–Rényi graph on a given number of vertices, with an edge between any two
     * vertices existing with some given probability.
     *
     * @param numVertices the number of vertices
     * @param probability the probability of choosing an edge.
     * @return a random erdosRenyi graph on {@code numVertices} vertices, with an edge between any two vertices with
     * probability {@code probability}.
     * @throws AssertionError if the given probability is not between 0 and 1.
     */
    public static Graph erdosRenyi(int numVertices, double probability) {
        assert !(probability < 0.0) && !(probability > 1.0) : "Probability must be between 0 and 1";
        Graph g = new Graph(numVertices);
        for (int v = 0; v < numVertices; v++)
            for (int w = v + 1; w < numVertices; w++)
                if (StdRandom.bernoulli(probability))
                    g.addEdge(v, w);
        return g;
    }

    /**
     * A complete graph is a graph in which every pair of vertices is connected by a single unique edge. This method
     * generates and returns the complete graph on a given number of vertices.
     *
     * @param numVertices the number of vertices.
     * @return the complete graph on the given number of vertices.
     */
    public static Graph complete(int numVertices) {
        return erdosRenyi(numVertices, 1.0);
    }

    /**
     * A bipartite graph (or simply bigraph) is a graph where the vertices can be divided into two disjoint, independent
     * sets such that every edge connects a vertex in the first set to one in the second set. This method generates and
     * returns a complete bipartite graph with {@code numVer1} vertices in the first set and {@code numVer2} vertices in
     * the second set.
     *
     * @param numVer1 the number of vertices in the first partition.
     * @param numVer2 the number of vertices in the second partition.
     * @return a complete bipartite graph on {@code numVer1} and {@code numVer2} vertices.
     */
    public static Graph completeBipartite(int numVer1, int numVer2) {
        return bipartite(numVer1, numVer2, numVer1 * numVer2);
    }

    /**
     * Generates and returns a bipartite graph using the Erdős–Rényi model on {@code numVer1} and {@code numVer2}
     * vertices with {@code numEdges} edges.
     *
     * @param numVer1  the number of vertices in the first partition.
     * @param numVer2  the number of vertices in the second partition.
     * @param numEdges the number of edges onto which to generate the graph.
     * @return a random Erdős–Rényi bipartite graph on {@code numVer1} and {@code numVer2} vertices, containing a total
     * of {@code numEdges} edges.
     * @throws AssertionError if no such Erdős–Rényi bipartite graph can be generated.
     */
    public static Graph bipartite(int numVer1, int numVer2, int numEdges) {
        assert numEdges <= numVer1 * numVer2 : "Too many edges";
        assert numEdges >= 0 : "Too few edges";
        Graph g = new Graph(numVer1 + numVer2);

        int[] vertices = IntStream.range(0, numVer1 + numVer2).toArray();
        StdRandom.shuffle(vertices);

        Set<Edge> set = new Set<>();
        while (g.getNumEdges() < numEdges) {
            int i = StdRandom.uniform(numVer1);
            int j = numVer1 + StdRandom.uniform(numVer2);
            Edge e = new Edge(vertices[i], vertices[j]);
            if (!set.contains(e)) {
                set.add(e);
                g.addEdge(vertices[i], vertices[j]);
            }
        }
        return g;
    }

    /**
     * Returns a random Erdős–Rényi bipartite graph on {@code numVer1} and {@code numVer2} vertices, containing each
     * possible edge with probability {@code probability}.
     *
     * @param numVer1     the number of vertices in the first partition.
     * @param numVer2     the number of vertices in the second partition.
     * @param probability the probability that the graph contains an edge with one endpoint in either side.
     * @return a random erdosRenyi bipartite graph on {@code numVer1} and {@code numVer2} vertices, containing each
     * possible edge with probability {@code probability}.
     * @throws AssertionError if probability is not between 0 and 1.
     */
    public static Graph bipartite(int numVer1, int numVer2, double probability) {
        assert !(probability < 0.0) && !(probability > 1.0) : "Probability must be between 0 and 1";
        int[] vertices = IntStream.range(0, numVer1 + numVer2).toArray();
        StdRandom.shuffle(vertices);
        Graph G = new Graph(numVer1 + numVer2);
        for (int i = 0; i < numVer1; i++)
            for (int j = 0; j < numVer2; j++)
                if (StdRandom.bernoulli(probability))
                    G.addEdge(vertices[i], vertices[numVer1 + j]);
        return G;
    }

    /**
     * A path is a sequence of edges joining a given sequence of vertices. This method generates and returns a path
     * graph on {@code numVertices} vertices.
     *
     * @param numVertices the number of vertices in the path
     * @return a path graph on {@code numVertices} vertices
     */
    public static Graph path(int numVertices) {
        Graph g = new Graph(numVertices);
        // Generate an array: [0, 1, ..., numVertices] and randomly shuffle it.
        int[] vertices = IntStream.range(0, numVertices).toArray();
        StdRandom.shuffle(vertices);
        // Connect the consecutive vertices to generate the random path graph
        for (int i = 0; i < numVertices - 1; i++) {
            g.addEdge(vertices[i], vertices[i + 1]);
        }
        return g;
    }

    /**
     * A binary tree is a tree where each vertex has at most two children. A complete binary tree is a binary tree in
     * which every level is completely filled (every vertex has exactly two children) and all nodes are as far left as
     * possible. This method generates and returns a complete binary tree graph on {@code numVertices} vertices.
     *
     * @param numVertices the number of vertices in the binary tree
     * @return a complete binary tree graph on {@code numVertices} vertices
     */
    public static Graph binaryTree(int numVertices) {
        Graph g = new Graph(numVertices);
        // Generate an array: [0, 1, ..., numVertices] and randomly shuffle it.
        int[] vertices = IntStream.range(0, numVertices).toArray();
        StdRandom.shuffle(vertices);
        // Give each vertex two children (if we can)
        for (int i = 1; i < numVertices; i++) {
            g.addEdge(vertices[i], vertices[(i - 1) / 2]);
        }
        return g;
    }

    /**
     * A cycle in a graph is a non-empty sequence of edges (a trail) in which the only repeated vertices are the first
     * and last ones. This method generates and returns a cycle graph on {@code numVertices} vertices, a graph composed
     * of a single cycle.
     *
     * @param numVertices the number of vertices in the cycle.
     * @return a cycle graph on {@code numVertices} vertices.
     */
    public static Graph cycle(int numVertices) {
        Graph g = new Graph(numVertices);
        // Generate an array: [0, 1, ..., numVertices] and randomly shuffle it.
        int[] vertices = IntStream.range(0, numVertices).toArray();
        StdRandom.shuffle(vertices);
        // Connect vertices from 0 to 2 less than the number of vertices consecutively
        for (int i = 0; i < numVertices - 1; i++) {
            g.addEdge(vertices[i], vertices[i + 1]);
        }
        // Connect the last and first vertices to complete the cycle.
        g.addEdge(vertices[numVertices - 1], vertices[0]);
        return g;
    }

    /**
     * An Eulerian path is a path on a graph that visits each edge precisely once. This method generates and returns an
     * Eulerian path graph on {@code numVertices} vertices.
     *
     * @param numVertices the number of vertices in the path
     * @param numEdges    the number of edges in the path
     * @return a graph that is an Eulerian path on {@code numVertices} vertices and {@code numEdges} edges
     * @throws AssertionError if either {@code numVertices <= 0} or {@code numEdges < 0}
     */
    public static Graph eulerianPath(int numVertices, int numEdges) {
        // Catch incorrect input of number of edges or vertices
        assert numEdges >= 0 : "negative number of edges";
        assert numVertices > 0 : "An Eulerian path must have at least one vertex";
        Graph g = new Graph(numVertices);
        // Fill an array of length equal to the number of edges with uniformly random values
        int[] vertices = IntStream.range(0, numEdges + 1).map(i -> StdRandom.uniform(numVertices)).toArray();
        // Connect consecutive (i, i+1) vertices
        IntStream.range(0, numEdges).forEach(i -> g.addEdge(vertices[i], vertices[i + 1]));
        return g;
    }

    /**
     * An Eulerian cycle is a graph cycle that has each edge in the cycle exactly once. This method generates and
     * returns an Eulerian cycle graph on {@code numVertices} vertices.
     *
     * @param numVertices the number of vertices in the cycle.
     * @param numEdges    the number of edges in the cycle.
     * @return a graph that is an Eulerian cycle on {@code numVertices} vertices and {@code numEdges} edges
     * @throws AssertionError if either {@code numVertices <= 0} or {@code numEdges <= 0}
     */
    public static Graph eulerianCycle(int numVertices, int numEdges) {
        assert numEdges > 0 : "An Eulerian cycle must have at least one edge";
        assert numVertices > 0 : "An Eulerian cycle must have at least one vertex";
        Graph G = new Graph(numVertices);
        // Fill an array of length equal to the number of edges with uniformly random values
        int[] vertices = IntStream.range(0, numEdges).map(i -> StdRandom.uniform(numVertices)).toArray();
        // Connect consecutive (i, i+1) vertices
        IntStream.range(0, numEdges - 1).forEach(i -> G.addEdge(vertices[i], vertices[i + 1]));
        // Connect the last edge-indexed element in the vertex array to the first vertex to complete the cycle
        G.addEdge(vertices[numEdges - 1], vertices[0]);
        return G;
    }

    /**
     * A wheel graph is a single vertex connected to every vertex in a cycle. This method generates and returns a wheel
     * graph on {@code numVertices} vertices.
     *
     * @param numVertices the number of vertices in the wheel
     * @return a wheel graph on {@code numVertices} vertices
     * @throws AssertionError if the number of vertices provided is not at least 2.
     */
    public static Graph wheel(int numVertices) {
        assert numVertices > 1 : "Number of vertices must be at least 2";
        Graph g = new Graph(numVertices);
        // Generate an array: [0, 1, ..., numVertices] and randomly shuffle it.
        int[] vertices = IntStream.range(0, numVertices).toArray();
        StdRandom.shuffle(vertices);

        // Create an Erdős–Rényi cycle on numVertices-1 vertices
        IntStream.range(1, numVertices - 1).forEach(i -> g.addEdge(vertices[i], vertices[i + 1]));
        // Connect the last vertex to the first to complete the cycle
        g.addEdge(vertices[numVertices - 1], vertices[1]);

        // Connect vertices[0] to every vertex on cycle
        IntStream.range(1, numVertices).forEach(i -> g.addEdge(vertices[0], vertices[i]));

        return g;
    }

    /**
     * A star graph is a tree with a single internal vertex and a given number of leaves. This method generates and
     * returns a star graph on {@code numVertices} vertices.
     *
     * @param numVertices the number of vertices in the star.
     * @return a star graph on {@code numVertices} vertices.
     */
    public static Graph star(int numVertices) {
        assert numVertices > 0 : "Number of vertices must be at least 1";
        Graph g = new Graph(numVertices);
        // Generate an array: [0, 1, ..., numVertices] and randomly shuffle it.
        int[] vertices = IntStream.range(0, numVertices).toArray();
        StdRandom.shuffle(vertices);

        // Connect vertices[0] to every other vertex
        IntStream.range(1, numVertices).forEach(i -> g.addEdge(vertices[0], vertices[i]));

        return g;
    }

    /**
     * Returns a uniformly random {@code k}-regular graph on {@code numVertices} vertices. This graph is not necessarily
     * Erdős–Rényi and is in fact Erdős–Rényi with probability only about <em>e^(-k^2/4)</em>, which is tiny when k =
     * 14.
     *
     * @param numVertices the number of vertices in the graph
     * @param k           degree of each vertex
     * @return a uniformly random {@code k}-regular graph on {@code numVertices} vertices.
     * @throws AssertionError if the number of vertices multiplied by k is not even.
     */
    public static Graph regular(int numVertices, int k) {
        assert numVertices * k % 2 == 0 : "Number of vertices * k must be even";
        Graph g = new Graph(numVertices);

        // Create k copies of each vertex
        int[] vertices = new int[numVertices * k];
        for (int v = 0; v < numVertices; v++) {
            for (int j = 0; j < k; j++) {
                vertices[v + numVertices * j] = v;
            }
        }
        // Pick a random perfect matching:
        // Shuffle the vertices and, for i from 0 to (k*numVertices)/2,
        // add edges between consecutive vertices (2i, 2i + 1)
        StdRandom.shuffle(vertices);
        IntStream.range(0, numVertices * k / 2).forEach(i -> g.addEdge(vertices[2 * i], vertices[2 * i + 1]));
        return g;
    }

    /**
     * Returns a uniformly random tree on {@code numVertices} vertices. This algorithm uses a Prüfer sequence, which is
     * a unique sequence associated to a tree, and takes time proportional to <em>numVertices log(numVertices)</em>.
     *
     * @param numVertices the number of vertices in the tree.
     * @return a uniformly random tree on {@code numVertices} vertices.
     */
    public static Graph tree(int numVertices) {
        Graph g = new Graph(numVertices);

        if (numVertices == 1) return g;

        // Cayley's theorem: there are numVertices^(numVertices-2) labeled trees on numVertices vertices
        // Prüfer sequence: sequence of numVertices-2 values between 0 and numVertices-1
        // Prüfer's proof of Cayley's theorem: Prufer sequences are in 1-1 with labeled trees on numVertices vertices

        // Fill a new array of size two less than numVertices with uniformly random integers
        int[] prufer = IntStream.range(0, numVertices - 2).map(i -> StdRandom.uniform(numVertices)).toArray();

        // Degree of vertex v = 1 + no. times it appears in Prüfer sequence
        int[] degree = IntStream.range(0, numVertices).map(v -> 1).toArray();
        IntStream.range(0, numVertices - 2).forEach(i -> degree[prufer[i]]++);

        // Minimum priority queue object pq contains all vertices of degree 1
        MinPriorityQueue<Integer> pq = new MinPriorityQueue<>();
        IntStream.range(0, numVertices).filter(v -> degree[v] == 1).forEach(pq::insert);

        // Repeatedly call delMin() (removes and returns smallest key on the priority queue)
        // on each degree 1 vertex that has the current minimum index
        for (int i = 0; i < numVertices - 2; i++) {
            int v = pq.delMin();
            g.addEdge(v, prufer[i]);
            degree[v]--;
            degree[prufer[i]]--;
            if (degree[prufer[i]] == 1) pq.insert(prufer[i]);
        }
        g.addEdge(pq.delMin(), pq.delMin());
        return g;
    }

    /**
     * @return the seed from StdRandom used to generate the pseudo-random values used to create random graphs.
     */
    public static long getSeed() {
        return seed;
    }

    /**
     * Sets the seed attribute of this class to the seed attribute of the StdRandom instance used to generate random
     * graphs.
     */
    public static void setSeed() {
        seed = StdRandom.getSeed();
    }

    /**
     * Unit tests the {@code GraphGenerator} library.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        // Declare a number of vertices and a number of edges
        int numVertices = 8;
        int numEdges = 5;

        // Split vertices into two partitions for bipartite graphs
        int numVertices1 = numVertices / 2;
        int numVertices2 = numVertices - numVertices1;

        // Probabilities for testing Erdős–Rényi and Erdős–Rényi bipartite graphs
        double p = (double) numEdges / (numVertices * (numVertices - 1) / 2.0);
        double q = (double) numEdges / (numVertices1 * numVertices2);

        // Print the numbers of vertices and edges to the standard output
        StdOut.println();
        StdOut.println("Generating random graphs on " + numVertices + " vertices and " + numEdges + " edges.");
        StdOut.println();

        // Generate and print each graph from the methods above to the standard output
        StdOut.println("Complete graph");
        StdOut.println(complete(numVertices));
        StdOut.println();

        StdOut.println("Simple");
        StdOut.println(simple(numVertices, numEdges));
        StdOut.println();

        StdOut.println("Erdős–Rényi");
        StdOut.println(erdosRenyi(numVertices, p));
        StdOut.println();

        StdOut.println("Complete bipartite");
        StdOut.println(completeBipartite(numVertices1, numVertices2));
        StdOut.println();

        StdOut.println("Bipartite");
        StdOut.println(bipartite(numVertices1, numVertices2, numEdges));
        StdOut.println();

        StdOut.println("Erdős–Rényi bipartite");
        StdOut.println(bipartite(numVertices1, numVertices2, q));
        StdOut.println();

        StdOut.println("Path");
        StdOut.println(path(numVertices));
        StdOut.println();

        StdOut.println("Cycle");
        StdOut.println(cycle(numVertices));
        StdOut.println();

        StdOut.println("Binary tree");
        StdOut.println(binaryTree(numVertices));
        StdOut.println();

        StdOut.println("Eulerian Cycle");
        StdOut.println(eulerianCycle(numVertices, numEdges));
        StdOut.println();

        StdOut.println("Eulerian Path ");
        StdOut.println(eulerianPath(numVertices, numEdges));
        StdOut.println();

        StdOut.println("Tree");
        StdOut.println(tree(numVertices));
        StdOut.println();

        StdOut.println("4-Regular");
        StdOut.println(regular(numVertices, 4));
        StdOut.println();

        StdOut.println("Star");
        StdOut.println(star(numVertices));
        StdOut.println();

        StdOut.println("Wheel");
        StdOut.println(wheel(numVertices));
        StdOut.println();
    }
}
