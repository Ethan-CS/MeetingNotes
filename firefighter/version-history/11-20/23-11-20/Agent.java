package io.github.ethankelly;

/**
 * Attributes associated with agency to be associated with vertices
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Represents an agent in some state (contracted, open, defended).
 * Stores the position and behavioural rating.
 */
public final class Agent implements Cloneable {
    private final double defenceRating;
    private final Point position;

    public Agent(Point pos, Point[] fires) {
        position = pos;

        // find distance to closest fire
        if (fires.length > 0) {
            int tempDist;
            int leastDist = pos.distance(fires[0]);
            for (int i = 1; i < fires.length; i++) {
                tempDist = pos.distance(fires[i]);
                if (tempDist < leastDist)
                    leastDist = tempDist;
            }

            defenceRating = 1 + 1.0 / leastDist;
        } else
            defenceRating = 1.0; // (1 + 1/infinity) is 1.0
    }

    // Constructor, used for cloning
    private Agent(double distressIncrement, Point position) {
        this.defenceRating = distressIncrement;
        this.position = position;
    }

    public static final Agent[] clonePersonArray(Agent[] p) {
        Agent[] n = new Agent[p.length];
        for (int i = 0; i < p.length; i++)
            n[i] = (Agent) p[i].clone();

        return n;
    }

    public static final LinkedList deepCopyListOfPersons(LinkedList list) {
        LinkedList newList = new LinkedList();
        ListIterator iter = list.listIterator();

        while (iter.hasNext())
            newList.addLast(((Agent) iter.next()).clone());

        return newList;
    }

    public final double getDefenceRating() {
        return defenceRating;
    }

    public final Point getPosition() {
        return position;
    }
    @Override
    public final boolean equals(Object o) {
        if (o instanceof Agent) {
            Agent other = (Agent) o;
            return (defenceRating == other.defenceRating && position.equals(other.position));
        } else
            return false;
    }
    @Override
    public final Object clone() {
        return new Agent(defenceRating, (Point) position.clone());
    }
}
