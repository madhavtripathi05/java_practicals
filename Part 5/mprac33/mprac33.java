import java.util.*;

/**
 * mprac33
 */
public class mprac33 {

    public static void main(String[] args) {
        /*
         * We can't use primitive datatypes in java for collection framework or anything
         * containing objects, so we use Wrapper classes instead. also we can use some
         * utility functions like parsing from one type to other, and valueOf etc.
         */
        Integer I = Integer.valueOf("11111111", 2);
        System.out.println(I);
        System.out.println(I.byteValue());
        System.out.println(I.toString());

        int i = Integer.parseInt("1001", 2);
        System.out.println(i);

        System.out.println(Integer.toString(15, 2));

        /*
         * Automatic conversion of primitive types to the object of their corresponding
         * wrapper classes is known as autoboxing.
         */
        char c = 'c';

        // Autoboxing- primitive to Character object conversion
        Character ch = c;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(07);

        // printing the values from object
        System.out.println(arrayList.get(0));

        /*
         * Automatically converting an object of a wrapper class to its corresponding
         * primitive type is known as unboxing.
         */
        Character che = 'c';

        // unboxing - Character object to primitive conversion
        char ce = che;

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(77);

        // unboxing because get method returns an Integer object
        int num = arrayList2.get(0);

        // printing the values from primitive data types
        System.out.println(num);

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}