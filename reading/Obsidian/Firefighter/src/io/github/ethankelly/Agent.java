package io.github.ethankelly;

import java.util.Random;

/**
 * Represents an agent in some state (contracted, open, defended).
 * Stores the position and behavioural rating.
 *
 * @author Ethan Kelly
 */
public final class Agent implements Cloneable {
    private final double peril;
    private final double defenceRating;
    private State state;
    private final int position;

    public Agent(int vertex, int[] fires, int[][] adjMatrix) {
        double perilDistance = setPeril(vertex, fires, adjMatrix);
        this.peril = 1 / perilDistance;

        this.position = vertex; // Location of the agent
        this.defenceRating = Math.random(); // Random defence rating

        if (vertex == fires[0]) {
            this.state = State.INFECTED;
        }  else {
            this.state = State.SUSCEPTIBLE;
        }
    }

    // Constructor, used for cloning
    private Agent(double peril, double rating, int position, State state) {
        this.peril = peril;
        this.defenceRating = rating;
        this.position = position;
        this.state = state;
    }

    // Setters
    public final double setPeril(int vertex, int[] fires, int[][] adjMatrix) {
        double perilDistance = 0;
        if (fires.length > 0) {
            int tempDist;
            int[] leastDistancePath = Graph.shortestPath(adjMatrix, vertex);
            int leastDist = leastDistancePath[fires[0]]; //TODO make this work for potentially more than one fire location

            for (int i = 1; i < fires.length; i++) {
                tempDist = (Graph.shortestPath(adjMatrix, fires[i])).length;
                if (tempDist < leastDist)
                    leastDist = tempDist;
            }
            if (leastDist == 0) {
                perilDistance = 1.0;
            } else {
                perilDistance = 1 + (1.0 / leastDist);
            }
        } else {
            perilDistance = 1.0;
        }
        return perilDistance;
    }

    // Getters
    public final double getPeril() {
        return peril;
    }

    public final int getPosition() {
        return position;
    }

    public final double getDefenceRating() {
        return defenceRating;
    }

    public final State getState() {
        return state;
    }

    @Override
    public final boolean equals(Object o) {
        if (o instanceof Agent) {
            Agent other = (Agent) o;
            return (peril == other.peril && position == other.position);
        } else
            return false;
    }
    @Override
    public final Object clone() {
        return new Agent(peril, defenceRating, position, state);
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int numVertices = 9;
        Graph g = new Graph(numVertices);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(3, 7);
        g.addEdge(5, 8);
        g.addEdge(6, 7);
        int[][] adjMatrix = Graph.getAdjMatrix();

        int location = rand.nextInt(numVertices);
        int[] fires = new int[1];
            fires[0] = Graph.outbreak(numVertices);

        Agent agent1 = new Agent(location, fires, adjMatrix);

        System.out.println("Location of agent: " + location);
        System.out.print("Location of fires: ");
        System.out.print(fires[0]);

        double peril1 = agent1.getPeril();
        double defence1 = agent1.getDefenceRating();
        int position = agent1.getPosition();
        State state1 = agent1.getState();

        System.out.println();
        System.out.println("Peril rating: " + peril1);
        System.out.println("Defence rating: " + defence1);
        System.out.println("State: " + state1);
        System.out.println("Defence * Peril: " + defence1 * peril1); // Higher peril number, further fire is from vertex

    }
}