import java.util.*;

abstract class CourseType {
    String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void displayEvaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    
    public void displayEvaluationMethod() {
        System.out.println("Evaluation Method: Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    
    public void displayEvaluationMethod() {
        System.out.println("Evaluation Method: Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    
    public void displayEvaluationMethod() {
        System.out.println("Evaluation Method: Research-Based");
    }
}

class Course<T extends CourseType> {
    String departmentName;
    T courseType;

    public Course(String departmentName, T courseType) {
        this.departmentName = departmentName;
        this.courseType = courseType;
    }

    public void displayCourseDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Course: " + courseType.courseName);
        courseType.displayEvaluationMethod();
    }
}

class CourseManagementSystem {
   
    public void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.courseName);
            course.displayEvaluationMethod();
        }
    }
}

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
       
        Course<ExamCourse> examCourse = new Course<>("Computer Science", new ExamCourse("Data Structures"));
        Course<AssignmentCourse> assignmentCourse = new Course<>("Electrical Engineering", new AssignmentCourse("Circuit Design"));
        Course<ResearchCourse> researchCourse = new Course<>("Physics", new ResearchCourse("Quantum Mechanics"));


        List<CourseType> courseList = new ArrayList<>();
        courseList.add(examCourse.courseType);
        courseList.add(assignmentCourse.courseType);
        courseList.add(researchCourse.courseType);

        
        CourseManagementSystem cms = new CourseManagementSystem();

       
        System.out.println("Displaying All Courses in the System:");
        cms.displayAllCourses(courseList);

        
        System.out.println("\nIndividual Course Details:");
        examCourse.displayCourseDetails();
        assignmentCourse.displayCourseDetails();
        researchCourse.displayCourseDetails();
    }
}
