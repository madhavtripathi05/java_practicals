import java.util.*;

public class mprac2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string : ");
    String str = scan.nextLine();
    scan.close();

    if (str.charAt(0) == 'o' && str.charAt(1) == 'z')
      System.out.println("oz");

    else if (str.charAt(0) == 'o')
      System.out.println("o");

    else if (str.charAt(1) == 'z')
      System.out.println("z");

    System.out.println("\nID:18DCS129 \nNAME:MADHAV ");
  }
}
