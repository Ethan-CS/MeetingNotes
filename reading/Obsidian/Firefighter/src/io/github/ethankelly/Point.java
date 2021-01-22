package io.github.ethankelly;

/**
 * Simple point class to represent coordinates and calculate distances
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

public final class Point extends Graph implements Cloneable {
    public int x;
    public int y;

    public Point(int x, int y) {
        super(numVertices);
        this.x = x;
        this.y = y;
    }

    @Override
    public final Object clone() {
        return new Point(x, y);
    }

    public final boolean equals(Point other) {
        return (x == other.x && y == other.y);
    }

    /**
     * @param other - point to find distance to
     * @return rectilinear distance, (x1-x2, y1-y2)
     */
    public final int distance(Point other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    public final double straightDistance(Point other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }



        @Override
    public final String toString() {
        return "(" + x + "," + y + ")";
    }
}