import java.util.*;

public class mprac6{

  //DRY begins
  public static void prints(String str){
    System.out.println(str);
  }

  public static void printn(float num){
    System.out.println(num);
  }
  //ends

  public static void calculateBMI(float wt,float ht){
//converting into KGs
wt*=0.45359237;
//converting into meters
ht*=0.0254;
float bmi = wt/(ht*ht);

prints("BMI is : ");
printn(bmi);

if(bmi < 18.5)
prints("Underweight");

else if(bmi >= 18.5 && bmi < 25.0)
prints("Normal");

else if(bmi >= 25.0 && bmi < 30.0)
prints("Overweight");

else if(bmi >= 30.0)
prints("Obese");

  }

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

prints("Enter Weight in Pounds : ");
float weight = scan.nextFloat();

prints("Enter Height in inches : ");
float height = scan.nextFloat();

calculateBMI(weight,height);

}

}
