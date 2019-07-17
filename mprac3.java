import java.util.*;

public class mprac3 {

  // function to check if the lastDigit are same or not
  public static boolean lastDigit(int a, int b) {
    b %= 10;
    a %= 10;
    return (a == b);
    // returns true if a==b;
  }


  

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers to check if their last digits are same or not :");
    // taking inputs from user
    int a = scan.nextInt();
    int b = scan.nextInt();

    scan.close();

    if (lastDigit(a, b))// if function returns true
      System.out.println("true");
    else
      System.out.println("false");
System.out.println("\nID:18DCS129 \nNAME:MADHAV ");

  }
}
