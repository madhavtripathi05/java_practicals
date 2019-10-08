import java.util.*;
import java.io.*;

public class mprac43 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String filename = scan.nextLine();
        try {
            File file = new File(filename);
            if (file.exists() && filename.substring(filename.lastIndexOf(".")).equals(".java")) {
                System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
        }

    }

    public static int countKeywords(File file) throws Exception {
        // Array of all Java Keywords + ture, false and null
        String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null" };

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String word = input.next();
            if (word.equals("//"))
                input.nextLine();
            else if (word.contains("\""))
                while (input.hasNext() && !input.next().contains("\"")) {
                }
            else if (word.contains("/*"))
                while (input.hasNext() && !input.next().contains("*/")) {
                }
            else if (keywordSet.contains(word))
                count++;
        }

        return count;
    }
}