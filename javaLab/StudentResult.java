import charusat.result.*;
import charusat.students.*;
import charusat.it.FirstSemester;
import charusat.it.SecondSemester;
public class StudentResult {

    public static void main(String[] args) {
        
        System.out.println("Enter First Semester Student's Info:");
        
        FirstSemester firstSemester = new FirstSemester("Jay", "id16001", "reg31");
        firstSemester.setMarks(70, 80);
        firstSemester.getSubject();
        firstSemester.showResult();

        SecondSemester secondSemester = new SecondSemester("Bhavya", "id17001", "reg45");
        secondSemester.setMarks(60, 70);
        secondSemester.getSubject();
        secondSemester.showResult();
    }
}