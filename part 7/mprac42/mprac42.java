import java.util.*;
import java.io.*;

public class mprac42 {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Enter name of your file:");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        File file = new File(fileName);

        if (file.length() == 0) {
            System.out.println(fileName + " : empty file");
            Thread.sleep(2000);
            System.exit(0);
        }

        Map<String, Integer> map = new TreeMap<>();// so that everything will be sorted implicitly
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String inputLine = null;
        List<String> words = null;
        try {

            while ((inputLine = bufferedReader.readLine()) != null) {
                words = Arrays.asList(inputLine.split("[ ,.]"));
            }

            for (String str : words) {
                if (map.containsKey(str)) {
                    map.put(str, 1 + map.get(str));// returns true if the key is already present in map and increments
                                                   // by 1
                } else {
                    map.put(str, 1);
                }
            }
            // System.out.println(map);//directly printing the whole map

            Set<String> wordsInString = map.keySet();

            for (String word : wordsInString) {
                System.out.println(word + " : " + map.get(word));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            scan.close();
            System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
        }
    }
}