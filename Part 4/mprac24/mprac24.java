import java.util.Scanner;

public class mprac24 {

    public static void main(String[] args) {
        int a,b;
        String str1 = null;
        String str2 =  "null";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a,b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
       
        //exeption is always gonna occur
       
        try{
          System.out.println("division a/b : " + a/b);
        
          if(str1.equals(str2))
            System.out.println("String 1 and 2 : " + str1 + str2);
        }
        
        catch(ArithmeticException aException){
            System.out.println(aException);
        }
        
        catch(NullPointerException nException){
            System.out.println(nException);
        }
        
        catch (Exception e) {
           System.out.println(e);
        }

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
    
}