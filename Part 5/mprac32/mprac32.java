import java.io.*;

/**
 * mprac32
 */
public class mprac32 {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));

        System.out.println("Enter content to be printed in file : ");
        String temp = reader.readLine();
        writer.write(temp);
        System.out.println("Succesfully copied to out.txt");
        writer.close();

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}