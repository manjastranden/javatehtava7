package main;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    static ArrayList<Course> courses = new ArrayList<>();
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Gifu gifu = new Gifu();
        System.out.println( "Tervetuloa Gifu-järjestelmään" );
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String university = sc.nextLine();
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna kurssin nimi:");
                        String courseName = sc.nextLine();
                        System.out.println("Anna kurssin ID:");
                        String courseID = sc.nextLine();
                        System.out.println("Anna kurssin maksimi opiskelija määrä:");
                        String maxStudents = sc.nextLine();
                        int maxStudentsint = Integer.parseInt(maxStudents);
                        gifu.addCourse(new Course(courseName, courseID, maxStudentsint)); 
                        break;
                    
                    case 2:
                        System.out.println("Anna opiskelijan nimi:");
                        String studentName = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String studentID = sc.nextLine();
                        gifu.addStudent(new Student(studentName, studentID));
                        break;

                    case 3:
                        gifu.listCourses();
                        break;

                    case 4:
                        gifu.listStudents();
                        break;

                    case 5:
                        gifu.listCourses();
                        System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                        String courseIndexString = sc.nextLine();
                        int courseIndex = Integer.parseInt(courseIndexString);
                    
                        gifu.listStudents();
                        System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                        String studentIndexString = sc.nextLine();
                        int studentIndex = Integer.parseInt(studentIndexString);
                        Student selectedStudent = gifu.getStudents().get(studentIndex);
                        Course selectedCourse = gifu.getCourses().get(courseIndex);

                        gifu.enrollStudent(selectedStudent, selectedCourse);
                        break;

                    case 6:
                        gifu.listCourses();
                        System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                        String courseIndexString2 = sc.nextLine();
                        int courseIndex2 = Integer.parseInt(courseIndexString2);
                        Course course = courses.get(courseIndex2);
                        String studentInfo =sc.nextLine();
                        String[] studentData = studentInfo.split(" ");
                        String studentID2 = studentData[0];
                        String studentName2 = studentData[1];
                        Student student = new Student(studentName2, studentID2);
                        System.out.println("Anna arvosana opiskelijalle"+ studentID2+studentName2);
                        int grade = Integer.parseInt(sc.nextLine());
                        //gifu.gradeCourse(student, course, grade);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit=true;
                        break;
                    default:
                        System.out.println("Virheellinen valinta!");

                }
            }
        } 
    sc.close();       
    }
}
