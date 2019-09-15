import java.util.*;

public class mprac26 {

    public static void main(String[] args) {
        int a,b;
        int arr[]= {1,2,3};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a,b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
       
        //exeption is always gonna occur
       
        try{
          System.out.println("division a/b : " + a/b);
          System.out.println("accesing 4th element : "+arr[3]);
        }
        catch(ArithmeticException aException){
            System.out.println(aException);
        }
        catch(IndexOutOfBoundsException iException){
            System.out.println(iException);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        finally{
            System.out.println("Exiting using finally");
        }
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}