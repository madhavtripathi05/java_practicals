import java.util.*;

public class mprac5{

  //DRY begins
  public static void prints(String str){
    System.out.println(str);
  }

  public static void printn(int num){
    System.out.println(num);
  }
  //ends

  public static int minLength(String s1,String s2){
    if(s1.length() < s2.length())
    return s1.length() ;
    else
    return s2.length() ;
}

  public static int stringMatch(String str1,String str2){
    int count=0;
    for(int i=0;i<minLength(str1,str2)-1 ;i++){
      if(str1.charAt(i)==str2.charAt(i) && str1.charAt(i+1)==str2.charAt(i+1))
      count++;
    }
    return count;
  }

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      prints("Enter two strings : ");

      String str1 = scan.nextLine();
      String str2 = scan.nextLine();

      prints("no. of occourences of substrings are :");
      printn(stringMatch(str1,str2));



  }
}
