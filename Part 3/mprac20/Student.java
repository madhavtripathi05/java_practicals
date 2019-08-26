abstract class Student {
    String studentId = "";
    String StudentName = "";
    int standard = 1;

    public int getStandard() {
        return standard;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

}

interface Department {

    int attendence = 81;

    public int getAttendence();
}

class Exam extends Student implements Department {

    boolean eligible() {
        return (getAttendence() > 80 && !StudentName.isEmpty() && !studentId.isEmpty());
    }

    @Override
    public int getAttendence() {
        return attendence;
    }

}