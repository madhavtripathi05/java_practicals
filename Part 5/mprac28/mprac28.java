import java.io.*;

/**
 * mprac28 # denotes a file and {} denotes a directory
 */
public class mprac28 {

    public static void recursiveFilename(File arr[], int depth) {
        for (File file : arr) {

            for (int i = 0; i < depth; i++)
                System.out.print("\t");

            if (file.isFile()) {
                System.out.println("  # " + file.getName() + '\n');
            } else if (file.isDirectory()) {
                System.out.println("Dir { " + file.getName() + " }\n");

                recursiveFilename(file.listFiles(), depth + 1);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        // Enter main directory
        File file = new File("D:\\course vids\\JAVA\\servlet");
        if (file.exists() && file.isDirectory()) {
            File arr[] = file.listFiles();
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("Files from Directory : ");
            System.out.println(file.getAbsolutePath());
            System.out.println("-----------------------------------------------------------------------");
            recursiveFilename(arr, 0);
        }
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}