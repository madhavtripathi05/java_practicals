// package programmingAssignment.Prac1;

class Counter {
    private int counter;

    void increment() {
        counter++;
    }

    int getValue() {
        return counter;
    }
}

public class Prac1 {
    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println("Before calling = " + c.getValue());
        c.increment();
        System.out.println("After calling = " + c.getValue());

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
