import java.util.*;

public class mprac4 {

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

    prints("Enter the size of array:");

    int n = scan.nextInt();

    prints("Enter " + n + " elements");

    // dynamic initialization of array
    int[] arr = new int[n];

    // Scanning n elements
    for (int i = 0; i < n; ++i)
      arr[i] = scan.nextInt();

    scan.close();
    // prints true if sequence found
    if (array123(arr))
      prints("true");
    else
      prints("false");

    printId();
  }
}
