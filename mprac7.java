import java.util.*;

public class mprac7{

  //DRY begins
  public static void prints(String str){
    System.out.println(str);
  }

  public static void printn(int num){
    System.out.println(num);
  }
  //ends

public static void Lottery(int rn,int myNum){

prints("Lottery num is:");
printn(rn);
  if(rn==myNum)
  prints("you win $10,000");


}

public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  Random rand = new Random();
  prints("Enter your lottery number : ");
  int num = scan.nextInt();
  int rn = rand.nextInt(num+1);

  Lottery(rn,num);
}

}
