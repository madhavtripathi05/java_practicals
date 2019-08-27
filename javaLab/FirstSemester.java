package charusat.it;
import charusat.students.*;
import charusat.result.*;


public class FirstSemester extends Student implements Result{
    public FirstSemester(String name,String roll,String reg){
     super(name, roll, reg);
    }
   private String subject1, subject2;
   private double mark1, mark2;
   private double grade1, grade2;
   private double credit1, credit2;

   public void setMarks(double mark1,double mark2){
    this.mark1 = mark1;
    this.mark2 = mark2;
    grade1 = markToGrade(mark1);    
    grade2 = markToGrade(mark2);
    }

    public void getSubject(){
        subject1 = "Java Programming"; 
        subject2 = "C Programming";
        credit1 = 2.0;
        credit2 = 3.0;
   }

   public double getGrade1() {
       return grade1;
   }

   public double calculateGpa(){
        return ((grade1* credit1+ grade2*credit2) / (credit1 + credit2));
    }

    public void showResult(){
        System.out.println("----------------------------------");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Registraion no : " + reg);
        System.out.println("Subject 1 : " + subject1);
        System.out.println("Subject 2 : " + subject2);
        System.out.println("Grade 1 : " + grade1);
        System.out.println("Grade 2 : " + grade2);
        System.out.printf("GPA : %.2f\n" , calculateGpa());
        System.out.println("----------------------------------");

    }
   
}