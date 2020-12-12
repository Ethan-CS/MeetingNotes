package io.github.ethankelly;

/**
 * a simple point class to contain the coordinates and calculate distances
 **/
public final class Point implements Cloneable {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final Object clone() {
        return new Point(x, y);
    }

    public final boolean equals(Point other) {
        return (x == other.x && y == other.y);
    }

    /**
     * @param  other
     * @return rectilinear distance, (x1+x2, y1+y2)
     **/
    public final int distance(Point other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    public final double straightDistance(Point other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }


    public final String toString() {
        return "(" + x + "," + y + ")";
    }
}