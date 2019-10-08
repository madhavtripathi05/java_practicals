import java.util.Scanner;

class Prac7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string with multiple spaces: ");
        String s1 = scan.nextLine();
        System.out.println("The string you entered is : " + s1);
        char arr[] = s1.toCharArray();
        char arr2[] = new char[100];
        int space_count = 0;
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                arr2[j] = arr[i];
                space_count = 0;
                j++;
            } else if (arr[i] == ' ' && space_count < 1) {
                arr2[j] = arr[i];
                space_count++;
                j++;
            }
        }
        String s2 = new String(arr2);
        System.out.println("\nString after removal of extra spaces : " + s2);

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
