import java.util.*;

public class mprac2{

//DRY begins
public static void prints(String str){
  System.out.println(str);
}
//ends

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
String str = scan.nextLine();

if(str.charAt(0)=='o' && str.charAt(1)=='z')
  prints("oz");

if(str.charAt(0)=='o')
  prints("o");

if(str.charAt(1)=='z')
  prints("z");
  }
}
