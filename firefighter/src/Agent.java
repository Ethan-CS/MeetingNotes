package io.github.ethankelly;

/**
 * Attributes associated with agency to be given to vertices
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Represents an agent in some state (contracted, open, defended).
 * Stores the position and behavioural rating.
 */
public final class Agent implements Cloneable {
    private static Point location;
    private final double peril;
    public final double defenceRating;
    public State state = State.SUSCEPTIBLE;
    private final Point position;

    public Agent(Point pos, Point[] fires) {
        position = pos; // Location of the agent
        this.defenceRating = Math.random(); // Random defence rating

        // Find distance to closest fire
        if (fires.length > 0) {
            int tempDist;
            int leastDist = pos.distance(fires[0]);
            for (int i = 1; i < fires.length; i++) {
                tempDist = pos.distance(fires[i]);
                if (tempDist < leastDist)
                    leastDist = tempDist;
            }

            peril = 1 + 1.0/leastDist;
        } else {
            peril = 1.0;
        }
    }

    // Constructor, used for cloning
    private Agent(double peril, double rating, Point position, State state) {
        this.peril = peril;
        this.defenceRating = rating;
        this.position = position;
        this.state = state;
    }

    public static Agent[] clonePersonArray(Agent[] p) {
        Agent[] n = new Agent[p.length];
        for (int i = 0; i < p.length; i++)
            n[i] = (Agent) p[i].clone();

        return n;
    }

    public static LinkedList<Object> deepCopyListOfPeople(LinkedList<Agent> list) {
        LinkedList<Object> newList = new LinkedList<>();
        ListIterator<Agent> iteration = list.listIterator();

        while (iteration.hasNext())
            newList.addLast((iteration.next()).clone());

        return newList;
    }

    // Getters
    public final double getPeril() {
        return peril;
    }

    public final Point getPosition() {
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
            return (peril == other.peril && position.equals(other.position));
        } else
            return false;
    }
    @Override
    public final Object clone() {
        return new Agent(peril, defenceRating, (Point) position.clone(), state);
    }

    public static void main(String[] args) {
        location = new Point(1,1);
        Point[] fires = new Point[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            fires[i] = new Point(rand.nextInt(50),rand.nextInt(50));
        }

        Agent agent = new Agent(location, fires);

        System.out.println("Location of agent: " + location.toString());
        System.out.print("Location of fires: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(fires[j].toString());
        }
        System.out.println();
        System.out.println("Peril rating: " + agent.getPeril());
        System.out.println("Defence rating: " + agent.getDefenceRating());
        System.out.println("Position: " + agent.getPosition());
        System.out.println("State: " + agent.getState());


    }
}
