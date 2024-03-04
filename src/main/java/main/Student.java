package main;

public class Student {
    protected String studentName;
    protected String studentID;

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;

    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }


}
