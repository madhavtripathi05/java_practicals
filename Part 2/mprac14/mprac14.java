
import java.util.*;

class Office {
    private int employee_Number;
    private String employee_Name;
    private double salary;

    Office() {
        this(1, "", 0);
    }

    Office(int employee_Number, String employee_Name, double salary) {
        this.employee_Number = employee_Number;
        this.employee_Name = employee_Name;
        this.salary = salary;
    }

    void setEmployeeNumber(int employee_Number) {
        this.employee_Number = employee_Number;
    }

    void setEmployeeName(String employee_Name) {
        this.employee_Name = employee_Name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    int getEmployeeNumber() {
        return employee_Number;
    }

    String getEmployeeName() {
        return employee_Name;
    }

    double getSalary() {
        return salary;
    }

    void Display() {
        System.out.println("Employee ID : " + employee_Number);
        System.out.println("Employee Name : " + employee_Name);
        System.out.println("Employee Salary : " + salary);
    }
}

class Teaching extends Office {
    private String designation;

    Teaching() {
        super();
        designation = "";
    }

    Teaching(int id, String name, double pay, String designation) {
        super(id, name, pay);
        this.designation = designation;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

    String getDesignation() {
        return designation;
    }

    void Display() {
        super.Display();
        System.out.println("Employee Designation : " + designation);
    }
}

class Non_Teaching extends Office {
    private String designation;

    Non_Teaching() {
        super();
        designation = "";
    }

    Non_Teaching(int id, String name, double pay, String designation) {
        super(id, name, pay);
        this.designation = designation;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

    String getDesignation() {
        return designation;
    }

    void Display() {
        super.Display();
        System.out.println("Employee Designation : " + designation);
    }
}

class mprac14 {
    public static void main(String args[]) {
        Teaching t1 = new Teaching(1, "Madhav", 10, "Assistant Proffesor");
        Non_Teaching t2 = new Non_Teaching(2, "Dev", 5000, "General Manager");

        t1.Display();
        t2.Display();

        System.out.println("\nID:18DCS129\nNAME:MADHAV");
    }
}