abstract class Shape {
    static int length;
    static int width;

    void printArea() {

    }

}

class Rectangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Triangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * length * width));
    }

}

class Circle extends Shape {
    @Override
    void printArea() {
        System.out.printf("Area of circle: %.2f\n", (2 * Math.PI * width));
    }
}