import java.util.Scanner;

class MethodOverloading {
    int product(int num1, int num2) {
        return (num1 * num2);
    }

    float product(float num1, float num2) {
        return (num1 * num2);
    }

    double product(double num1, double num2) {
        return (num1 * num2);
    }
}

class mprac15 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter two integer values: ");
        Scanner scan = new Scanner(System.in);
        MethodOverloading m = new MethodOverloading();

        num1 = scan.nextInt();
        num2 = scan.nextInt();

        float num3, num4;
        System.out.println();
        System.out.println("Enter two float values: ");

        num3 = scan.nextFloat();
        num4 = scan.nextFloat();

        double num5, num6;
        System.out.println();
        System.out.println("Enter two Double values:");

        num5 = scan.nextDouble();
        num6 = scan.nextDouble();

        System.out.println();
        System.out.println("The product of the two integer numbers is : " + m.product(num1, num2));
        System.out.println("The product of the two float numbers is : " + m.product(num3, num4));
        System.out.println("The product of the two double numbers is : " + m.product(num5, num6));

        System.out.println("\nID:18DCS129\nNAME:MADHAV");
    }
}