import java.util.*;

public class mprac10 {

    // DRY begins
    public static void prints(String str) {
        System.out.println(str);
    }

    public static void printn(double num) {
        System.out.println(num);
    }

    public static void printId() {
        prints("\nID:18DCS129 \nNAME:MADHAV ");
    }

    // ends
    static double Dist(double x1, double x2, double y1, double y2) {
        return (Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // //number of points(x,y)
        // int n = scan .nextInt();
        // int pts[][]=new int [n][2];
        // prints("Enter "+n+" Points.");
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < 2; j++) {
        // pts[i][j]=scan.nextInt();
        // }
        // }

        double pts[][] = { { -1, 3 }, { -1, -1 }, { 1, 1 }, { 2, 0.5 }, { 2, -1 }, { 3, 3, }, { 4, 2 }, { 4, -0.5 } };
        double min = 100_00.00;
        int ti = 0, tj = 0;
        for (int i = 0; i < pts.length; i++) {
            for (int j = 0; j < pts.length; j++) {
                double temp = Dist(pts[i][0], pts[j][0], pts[i][1], pts[j][1]);
                if (temp < min && i != j) {
                    // when dist is mini i and j index will be temperorily stored which in turn will
                    // retrun us the closest points
                    min = temp;
                    ti = i;
                    tj = j;
                }

            }

        }
        prints("Closest points are:");
        prints("(" + pts[ti][0] + "," + pts[ti][1] + ") " + " (" + pts[tj][0] + "," + pts[tj][1] + ") ");
        printId();
    }

}
