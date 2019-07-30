/**
 * P12
 */
public interface P12 extends P1,P2{

    final int varP12 =12;

    @Override
    default void printP2() {
        System.out.println("P2");
    }
    
    @Override
    default void printP1() {
        System.out.println("P1");
    }
}