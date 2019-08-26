interface myInterface {
    String id = "SampleId";

    default void displayId() {
        System.out.println("ID : " + id);
    }

    void normalMethod();
}

class Demo implements myInterface {

    public void normalMethod() {
        System.out.println("overriding normal method");
    }
}

public class mprac23 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.displayId();
        demo.normalMethod();
        System.out.println("\nID:18DCS129\nNAME:MADHAV");

    }

}