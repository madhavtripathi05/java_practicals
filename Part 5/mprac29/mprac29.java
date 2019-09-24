import java.util.Scanner;
import java.io.*;

public class mprac29 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter name of file : ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        File file = new File(fileName);
        scan.close();
        System.out.println("Exist : " + file.exists());
        System.out.println("Readable : " + file.canRead());
        System.out.println("Writable : " + file.canWrite());
        String extension = "";
        int i = fileName.lastIndexOf('.');
        if (i >= 0) {
            extension = fileName.substring(i + 1);
        }
        System.out.println("Extension : " + extension);
        System.out.println("Size in Bytes : " + file.length());
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}