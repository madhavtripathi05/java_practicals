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

    // checking for duplicate elements
    static boolean isValid(int[] arr) {
        // sorting arr so we can compare it afterwards
        Arrays.sort(arr);
        int i = 0;
        for (int el : arr) {
            // iterating over elements in arr to check if they are unequal
            if (el != ++i)
                return false;
        }
        return true;
    }

    // validating sudoku
    static boolean isValidSoln(int[][] soln) {
        // this loop will run 9 times checking each row,col,grid
        for (int i = 0; i < soln.length; i++) {

            int row[] = new int[9];
            int col[] = new int[9];
            int grid[] = new int[9];

            // filling rows
            for (int j = 0; j < soln.length; j++) {
                row[j] = soln[i][j];
            }

            // filling columns
            for (int j = 0; j < soln.length; j++) {
                col[j] = soln[j][i];
            }

            int rowindex = 3 * (i / 3);
            int colindex = 3 * (i % 3);

            // filling grids
            for (int j = 0; j < soln.length; j++) {
                grid[j] = soln[rowindex + j / 3][colindex + j % 3];
            }

            // if anyone of the below are in valid return false
            if (!(isValid(row) && isValid(col) && isValid(grid)))
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        // to check wether the solution is correct or not
        int soln[][] = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

        // for scanning
        // Scanner scan = new Scanner(System.in);

        // for (int i = 0; i < 9; i++) {
        // for (int j = 0; j < 9; j++) {
        // soln[i][j] = scan.nextInt();
        // }
        // }
        // scan.close();

        if (isValidSoln(soln))
            prints("Valid");
        else
            prints("invalid");

    
        printId();
    }
}