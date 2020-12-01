package io.github.ethankelly;

/**
 * Attributes associated with agency to be given to vertices
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 **/

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Represents an agent in some state (contracted, open, defended).
 * Stores the position and behavioural rating.
 */
public final class Agent implements Cloneable {
    private final double dangerZone;
    public final double defenceRating;
    private final Point position;

    public Agent(Point pos, Point[] fires) {
        position = pos;
        this.defenceRating = Math.random();

        // find distance to closest fire
        if (fires.length > 0) {
            int tempDist;
            int leastDist = pos.distance(fires[0]);
            for (int i = 1; i < fires.length; i++) {
                tempDist = pos.distance(fires[i]);
                if (tempDist < leastDist)
                    leastDist = tempDist;
            }

            dangerZone = 1 + 1.0/leastDist;
        } else {
            dangerZone = 1.0;
        }
    }

    // Constructor, used for cloning
    private Agent(double dangerZone, double rating, Point position) {
        this.dangerZone = dangerZone;
        this.defenceRating = rating;
        this.position = position;
    }

    public static Agent[] clonePersonArray(Agent[] p) {
        Agent[] n = new Agent[p.length];
        for (int i = 0; i < p.length; i++)
            n[i] = (Agent) p[i].clone();

        return n;
    }

    public static LinkedList deepCopyListOfPeople(LinkedList list) {
        LinkedList newList = new LinkedList();
        ListIterator iteration = list.listIterator();

        while (iteration.hasNext())
            newList.addLast(((Agent) iteration.next()).clone());

        return newList;
    }

    // Getters
    public final double getDangerZone() {
        return dangerZone;
    }

    public final Point getPosition() {
        return position;
    }

    public final double getDefenceRating() {
        return defenceRating;
    }

    @Override
    public final boolean equals(Object o) {
        if (o instanceof Agent) {
            Agent other = (Agent) o;
            return (dangerZone == other.dangerZone && position.equals(other.position));
        } else
            return false;
    }
    @Override
    public final Object clone() {
        return new Agent(dangerZone, dangerZone, (Point) position.clone());
    }
}