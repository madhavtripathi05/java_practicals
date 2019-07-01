import java.util.*;

public class mprac3{

//function to check if the lastDigit are same or not
  public static boolean lastDigit(int a,int b){
    b%=10;
    a%=10;
    return (a==b);
    //returns true if a==b;
  }


  //DRY begins
  public static void prints(String str){
    System.out.println(str);
  }

  public static void printn(int num){
    System.out.println(num);
  }
  //ends

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    prints("Enter two numbers to check if their last digits are same or not :");
    //taking inputs from user
    int a = scan.nextInt();
    int b = scan.nextInt();

    if(lastDigit(a,b))//if function returns true
    prints("true");
    else
    prints("false");

  }
}
