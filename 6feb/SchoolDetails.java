import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("  - " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("  - " + c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("  - " + s.getName());
        }
    }
}

public class SchoolDetails{
    public static void main(String[] args) {
        School mySchool = new School("ABC Academy");

        Student gaurav = new Student("Gaurav");
        Student guzzar = new Student("Guzzar");

        Course python = new Course("Python");
        Course java = new Course("Java");

        gaurav.enrollInCourse(python);
        gaurav.enrollInCourse(java);
        guzzar.enrollInCourse(python);

        mySchool.addStudent(gaurav);
        mySchool.addStudent(guzzar);

        mySchool.displayStudents();
        System.out.println();

        gaurav.displayCourses();
        System.out.println();

        python.displayStudents();
    }
}