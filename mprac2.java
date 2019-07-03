import java.util.*;

public class mprac2 {

  // DRY begins
  public static void prints(String str) {
    System.out.println(str);
  }

  public static void printId() {
    prints("\nID:18DCS129 \nNAME:MADHAV ");
  }
  // ends

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    prints("Enter a string : ");
    String str = scan.nextLine();
    scan.close();
    
    if (str.charAt(0) == 'o' && str.charAt(1) == 'z')
      prints("oz");

    else if (str.charAt(0) == 'o')
      prints("o");

    else if (str.charAt(1) == 'z')
      prints("z");

    printId();
  }
}
