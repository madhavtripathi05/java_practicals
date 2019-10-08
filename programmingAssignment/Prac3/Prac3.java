import java.util.Scanner;

abstract class Person {
    String name;
    String address;
    String phone_Number;
    String Email;

    Person() {
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the person : ");
        name = scan.nextLine();
        System.out.print("Enter the address of the person : ");
        address = scan.nextLine();
        System.out.print("Enter the phone number of the person : ");
        phone_Number = scan.nextLine();
        System.out.print("Enter the Email of the person : ");
        Email = scan.nextLine();
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Phone Number : " + phone_Number);
        System.out.println("Email : " + Email);
    }
}

class Student extends Person {
    String enrollmentID;
    String courseName;

    Student() {
        super.input();
        input();
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Enrolment ID of the student : ");
        enrollmentID = scan.nextLine();
        System.out.print("Enter the course name of the Student : ");
        courseName = scan.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Enrolment ID : " + enrollmentID);
        System.out.println("Course Name : " + courseName);
    }
}

class Faculty extends Person {
    String officeName;
    String Salary;
    String designation;

    Faculty() {
        super.input();
        input();
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Office name of the Faculty : ");
        officeName = scan.nextLine();
        System.out.print("Enter the Salary of the Faculty : ");
        Salary = scan.nextLine();
        System.out.print("Enter the designation of the Faculty : ");
        designation = scan.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Office Name : " + officeName);
        System.out.println("Salary : " + Salary);
        System.out.println("Designation : " + designation);
    }
}

class Prac3 {
    public static void main(String[] args) {
        System.out.println("Enter the student details :");
        Person p1 = new Student();
        System.out.println("\nEnter the faculty details :");
        Person p2 = new Faculty();
        System.out.println("\n\nDisplaying the Student details :");
        p1.display();
        System.out.println("\n\nDisplaying the faculty details :");
        p2.display();
        
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
