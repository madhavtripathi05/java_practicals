class Circle {
    double radius = 1.0;

    Circle() {
        System.out.println("default constructor called");
    }

    Circle(double rad) {
        this.radius = rad;
        System.out.println("Radius is set to: " + this.radius);
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }
}

public class mprac11 {

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle();
        System.out.println("Area of c1 :" + String.format("%.2f", c1.getArea()));
        System.out.println("Area of c2 :" + String.format("%.2f", c2.getArea()));
        System.out.println("perimeter of c1 :" + String.format("%.2f", c1.getPerimeter()));
        System.out.println("perimeter of c2 :" + String.format("%.2f", c2.getPerimeter()));

        System.out.println("\nID:18DCS129 \nNAME:MADHAV ");
    }
}