package main;

import java.util.ArrayList;
import java.util.List;

public class Gifu {
    protected String university;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Enrollment> enrollments;

    public Gifu() {
        //this.university = university;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.enrollments = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void getCourse(String courseName, String courseID, int maxStudents) {
        Course course = new Course(courseName, courseID, maxStudents);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void listCourses() {
        for (int i = 0; i < courses.size(); ++i) {
            System.out.println(i + ") " + courses.get(i).getCourseID()+" "+courses.get(i).getCourseName());
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void getStudent(String studentName, String studentID) {
        Student student = new Student(studentName, studentID);
        students.add(student);
    }

    
    public void listStudents() {
        for (int i = 0; i < students.size(); ++i) {
            System.out.println(i + ") " + students.get(i).getStudentID()+" "+students.get(i).getStudentName());
        }
    }
    

    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course, -1);
        enrollments.add(enrollment);
        
    }

    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }



}

