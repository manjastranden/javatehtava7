package main;

public class Course {
    protected String courseName;
    protected String courseID;
    protected int maxStudents;

    public Course(String courseName, String courseID, int maxStudents) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.maxStudents = maxStudents;

    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
}
