import java.util.Scanner;
import java.io.*;
/**
 * mprac30
 */
public class mprac30 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Source file name : ");
        String src = scan.next();
        System.out.println("Enter Destination file name : ");
        String dst = scan.next();
        scan.close();
        FileInputStream sFile = new FileInputStream(src);
        File dFile = new File(dst);
        if (!dFile.exists()) {
            FileOutputStream dStream = new FileOutputStream(dst);
            int c = 0;
            while ((c = sFile.read()) != -1) {
                dStream.write(c);
            }
            System.out.println("Succesfully created " + dst + " and copied content");
            dStream.close();
        }
        sFile.close();
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}