import java.io.*;

/**
 * mprac31
 */
public class mprac31 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        /*
         * In Java, characters are stored using Unicode conventions, Character stream
         * automatically allows us to read/write data character by character.To use
         * Character Stream we use FileReader/FileWriter.
         */
        FileReader fReader = new FileReader("hello.txt");
        int c;
        while ((c = fReader.read()) != -1)
            System.out.print((char) c);

        /*
         * Byte streams process data byte by byte (8 bits). For example FileInputStream
         * is used to read from source and FileOutputStream to write to the destination.
         * To use ByteStream we use FileInputStream/FileOutputStream.
         */
        FileInputStream fStream = new FileInputStream("src.txt");
        FileOutputStream fStream2 = new FileOutputStream("dst.txt");
        c = 0;
        while ((c = fStream.read()) != -1)
            fStream2.write((char) c);
        System.out.println("\nContents copied Succesfully");

        fReader.close();
        fStream.close();
        fStream2.close();

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}