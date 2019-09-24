
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mprac27 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name to open : ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        scan.close();
        //by scanning file name
        File file = new File(fileName);
        //File file = new File("hello.txt");
        System.out.println("File name : "+file.getName());
        System.out.println("Absolute path : "+file.getAbsolutePath());
        if (file.exists()) {
            System.out.println("Writeable : "+file.canWrite()); 
            System.out.println("Readable : "+file.canRead()); 
            System.out.println("Size in bytes : "+file.length()); 
            System.out.println("Name : MADHAV\nID : 18DCS129");
        }
    }
}
