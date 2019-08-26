
public class mprac20 {

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.StudentName = "madhav";
        exam.studentId = "18CS12";
        // exam.attendence = 85; can't assign as it's final variable
        System.out.println("Attendence : " + exam.getAttendence() + "\nName : " + exam.StudentName + "\nID : "
                + exam.studentId + "\nEligible : " + exam.eligible());
        System.out.println("\nID:18DCS129\nNAME:MADHAV");

    }
}