import java.util.*;

public class mprac4 {

  // function to check the sequence
  public static boolean array123(int[] arr) {
    for (int i = 0; i < arr.length; ++i) {
      if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size of array:");

    int n = scan.nextInt();

    System.out.println("Enter " + n + " elements");

    // dynamic initialization of array
    int[] arr = new int[n];

    // Scanning n elements
    for (int i = 0; i < n; ++i)
      arr[i] = scan.nextInt();

    scan.close();
    // System.out.println true if sequence found
    if (array123(arr))
      System.out.println("true");
    else
      System.out.println("false");

 System.out.println("\nID:18DCS129 \nNAME:MADHAV ");
  }
}
