package io.github.ethankelly;

import java.util.Arrays;

public class Agent {
    private int vertex; // Index of agent in graph
    private double peril; // Peril rating based on proximity to fire
    private double protection; // Protection rating between 0 and 1
    private State state;

    public Agent(int vertex, ModelState graphState) {
        this.vertex = vertex;
        this.peril = setPeril(graphState);
        this.protection = setProtection();
        this.state = setState(vertex, graphState);
    }

    public int getVertex() {
        return vertex;
    }

    public double getProtection() {
        return protection;
    }

    private double setProtection() { // Based on some random baseline and proximity to fire
        double baseline = Math.random();
        double protection = 0.0;
        double peril = getPeril();

        if (peril == 0) {
            protection = baseline;
        } else {
            protection = baseline*getPeril();
        }

        return protection;
    }

    public double getPeril() {
        return peril;
    }

    private double setPeril(ModelState graphState) { // Using Dijkstra's Algorithm to find shortest distance
        int[] fires = Model.getFires(graphState);
        double perilDistance;

            double tempDist;
            int[] leastDistancePath = Graph.shortestPath(graphState, vertex);
            double leastDist = leastDistancePath[fires[0]]; //TODO make this work for more than one fire location - find closest fire, find shortest path to it

            for (int i = 1; i < fires.length; i++) {
                tempDist = (Graph.shortestPath(graphState, fires[i])).length;
                if (tempDist < leastDist)
                    leastDist = tempDist;
            }
            if (leastDist == 0) {
                perilDistance = 1.0;
            } else if (leastDist == Integer.MAX_VALUE) {
                perilDistance = 0.0;
            } else {
                perilDistance = 1 / leastDist;
            }
        return perilDistance;
    }
    public State getState() {
        return state;
    }

    private State setState(int vertex, ModelState graphState) {
        int[][] adjMatrix = graphState.adjMatrix();
        int vertices = adjMatrix.length;

        int[] fires = Model.getFires(graphState);
        int[] defended = Model.getDefended(graphState);

        State toSet = State.SUSCEPTIBLE;

        for (int i = 0; i < fires.length; i++) {
            if (fires[i] == vertex) {
                toSet = State.INFECTED;
            }
        }

        for (int j = 0; j < defended.length; j++) {
            if (defended[j] == vertex) {
                toSet = State.PROTECTED;
            }
        }

        if (this.getPeril() == 0) {
            toSet = State.PROTECTED;
        }

        this.state = toSet;
        return toSet;

    }

    public String toString() {
        return "Agent at position " + getVertex()
                + " has peril rating " + getPeril()
                + ", protection rating " + getProtection()
                + " and is in state " + getState();
    }
}
