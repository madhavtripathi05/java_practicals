import java.util.*;

public class mprac6 {

  public static void calculateBMI(float wt, float ht) {
    // converting into KGs
    wt *= 0.45359237;
    // converting into meters
    ht *= 0.0254;
    float bmi = wt / (ht * ht);

    System.out.println("BMI is : " + bmi);

    if (bmi < 18.5)
      System.out.println("Underweight");

    else if (bmi >= 18.5 && bmi < 25.0)
      System.out.println("Normal");

    else if (bmi >= 25.0 && bmi < 30.0)
      System.out.println("Overweight");

    else if (bmi >= 30.0)
      System.out.println("Obese");

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Weight in Pounds : ");
    float weight = scan.nextFloat();

    System.out.println("Enter Height in inches : ");
    float height = scan.nextFloat();

    scan.close();

    calculateBMI(weight, height);

    System.out.println("\nID:18DCS129 \nNAME:MADHAV ");

  }

}
