import java.util.Scanner;

class CheckEqual {
    boolean isEqual(int a[], int b[]) {
        boolean bool = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    bool = false;
                    break;
                }
            }
        } else {
            bool = false;
        }
        return bool;
    }
}

public class Prac9 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the size of two arrays :");
        n = scnr.nextInt();
        m = scnr.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        System.out.println("\nEnter the values of the array1 :");
        for (int i = 0; i < n; i++) {
            a[i] = scnr.nextInt();
        }
        System.out.println("\nEnter the values of the array2 :");
        for (int i = 0; i < n; i++) {
            b[i] = scnr.nextInt();
        }
        CheckEqual e = new CheckEqual();
        if (e.isEqual(a, b)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
