
interface P {

    static int varP = 0;

    public void printP4();
}

interface P1 extends P {
    final int varP1 = 1;

    void printP1();
}

interface P2 extends P {
    final int varP2 = 2;

    void printP2();

}

interface P12 extends P1, P2 {

    final int varP12 = 12;

    void printP3();

}

public class mprac17 implements P12 {
    public void printP1() {
        System.out.println("P1");
    }

    public void printP2() {
        System.out.println("P2");
    }

    public void printP3() {
        System.out.println("P3");
    }

    public void printP4() {
        System.out.println("P4");

    }

    public static void main(String[] args) {

        mprac17 obj1 = new mprac17();

        obj1.printP1();
        obj1.printP2();
        obj1.printP3();
        obj1.printP4();
        System.out.println(varP);
        System.out.println("\nID:18DCS129\nNAME:MADHAV");
    }

}