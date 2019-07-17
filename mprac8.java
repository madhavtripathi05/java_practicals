import java.util.*;

public class mprac8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of students:");

        // m number of rows or students
        int m = scan.nextInt();

        // by default I've considered no. of questions as 5
        char mcq[][] = new char[m][5];
        char key[] = { 'a', 'b', 'c', 'a', 'e', 'A', 'B', 'C', 'A', 'E' };

        // scanning mcqs of m students
        for (int student = 0; student < m; student++) {

            System.out.println("Enter Student " + (student + 1) + "\'s data: ");

            for (int question = 0; question < 5; question++) {

                System.out.println("mcq in " + (question + 1));

                mcq[student][question] = scan.next().charAt(0);
            }
        }

        scan.close();

        // Displaying students details
        for (int student = 0; student < m; student++) {

            System.out.println("Student " + (student + 1));

            for (int question = 0; question < 5; question++) {

                System.out.println("mcq in question " + (question + 1) + " = " + mcq[student][question]);
            }
        }

        int grade[] = new int[m];

        // Counting grades

        for (int student = 0; student < m; student++) {
            for (int question = 0; question < 5; question++) {
                if (key[question] == mcq[student][question] || key[question + 5] == mcq[student][question])
                    (grade[student])++;
            }

        }

        // displaying grades of students
        for (int student = 0; student < m; student++) {
            System.out.println("Grade of student " + (student + 1) + " is: " + grade[student]);
        }

        System.out.println("\nID:18DCS129 \nNAME:MADHAV ");
    }
}