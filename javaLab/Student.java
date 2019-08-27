package charusat.students;
import java.util.*;
public class Student {

    public String name;
    public String roll;
    public String reg;
    public boolean inBetween(int m1,int m2,double marks){
        return (marks >= m1 && marks <= m2);
    }

    public Student(String name, String roll, String reg){
        this.name= name;
        this.roll = roll;
        this.reg = reg;
    }

   
    public String getName() {
        return name;
    }

    public String getReg() {
        return reg;
    }


    public String getRoll() {
        return roll;
    }

    public double markToGrade(double marks){
    if(inBetween(80, 100, marks))
         return 4.00;
    else if(inBetween(75, 79, marks))
        return 3.75;
    else if(inBetween(70, 74, marks))
        return 3.50;
    else if(inBetween(65, 69, marks))
        return 3.25;
    else if(inBetween(60, 64, marks))
        return 3.00;
    else if(inBetween(55, 59, marks))
        return 2.75;
    else if(inBetween(50, 45, marks))
        return 2.50;
    else if(inBetween(45, 49, marks))
        return 2.25;
    else if(inBetween(45, 49, marks))
        return 2.00;
    else
        return 0.00;
    }
}