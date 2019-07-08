import java.util.*;

public class mprac9 {
    // DRY begins
    public static void prints(String str) {
        System.out.println(str);
    }

    public static void printn(int num) {
        System.out.println(num);
    }

    public static void printId() {
        prints("\nID:18DCS129 \nNAME:MADHAV ");
    }
    // ends

    public static void main(String[] args) {
        int soln[][] = new int[9][9];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                soln[i][j] = scan.nextInt();
            }
        }
        scan.close();

        int arr1[] = new int[9];
        int arr2[] = new int[9];

        for (int rows = 0; rows < 9; rows++)
            arr1[rows] = soln[rows][0];

        for (int cols = 0; cols < 9; cols++)
            arr2[cols] = soln[0][cols];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            prints("Correct solution");
        else
            prints("Incorrect solution");

        printId();
    }
}