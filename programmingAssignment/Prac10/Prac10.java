import java.util.*;

class Circle {
    final private int x;
    final private int y;
    final private double radius;

    Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    double getRadius() {
        return radius;
    }

    double centerDistance(Circle c) {
        return Math.sqrt((x - c.x) * (x - c.x) + (y - c.y) * (y - c.y));
    }

    double distance(Circle c) {
        return (this.centerDistance(c) - this.radius - c.radius);
    }

    boolean touches(Circle c) {
        if (this.distance(c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean overlap(Circle c) {
        if (this.distance(c) < 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Prac10 {
    public static void main(String args[]) {
        boolean t1, o1;
        Circle c1 = new Circle(0, 0, 4);
        Circle c2 = new Circle(8, 6, 5);
        double dist;
        double cdist;
        cdist = c1.centerDistance(c2);
        dist = c1.distance(c2);
        t1 = c1.touches(c2);
        o1 = c1.overlap(c2);
        System.out.println("center distance: " + cdist);
        System.out.println("distance: " + dist);
        System.out.println("touches: " + t1);
        System.out.println("overlaps: " + o1);

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
