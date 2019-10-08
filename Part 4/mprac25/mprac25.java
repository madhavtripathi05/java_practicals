import java.util.*;

public class mprac25 {
    static void functionWithException() throws Exception {
        System.out.println("fun with exception");
        throw new IllegalAccessError("illegal access Exception");
    }

    public static void main(String[] args) {

        try {
            functionWithException();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
        }

    }
}