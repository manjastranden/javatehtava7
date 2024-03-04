package main;

public class Enrollment {
    private Student student;
    private Course course;
    private int grade;

    public Enrollment(Student student, Course course, int grade) {
        this.student = student;
        this.course = course;
        this.grade = -1; //oletusarvosana, ku ilmottautuu kurssille
    }

    public void gradeCourse(int grade) {
        this.grade = grade;  //apua chat gpt
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

}
