import java.util.*;

class inlab3 {

    public static String getSize(long size) {
        String s = "";
        double kb = size / 1024.0;
        double mb = kb / 1024.0;
        double gb = mb / 1024.0;
        double tb = gb / 1024.0;

        if (kb < 1)
            s = Double.toString(size % 1000) + " Bytes";
        else if (mb < 1)
            s = Double.toString(kb % 1000) + " KBytes";
        else if (gb < 1)
            s = Double.toString(mb % 1000) + " MBytes";
        else if (tb < 1)
            s = Double.toString(gb % 1000) + " GBytes";
        else if (tb > 1)
            s = Double.toString(tb % 1000) + " TBytes";

        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter vaue in Bytes:");
        long lint = scan.nextLong();
        scan.close();

        System.out.println("Byte are : " + getSize(lint));

        System.out.println("\n\nName:MADHAV\nID:18DCS129");
    }

}