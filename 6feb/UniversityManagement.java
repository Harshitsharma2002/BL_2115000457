import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayDepartments() {
        System.out.println("University: " + universityName);
        for (Department dept : departments) {
            System.out.println("  - Department: " + dept.getDepartmentName());
        }
    }

    public void displayFaculties() {
        System.out.println("Faculty Members at " + universityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println("  - " + faculty.getName());
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); 
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University myUniversity = new University("Tech University");

        myUniversity.addDepartment("Computer Science");
        myUniversity.addDepartment("Mechanical Engineering");

        Faculty gaurav = new Faculty("Gaurav");
        Faculty guzzar = new Faculty("Guzzar");

        myUniversity.addFaculty(gaurav);
        myUniversity.addFaculty(guzzar);

        myUniversity.displayDepartments();
        System.out.println();
        
        myUniversity.displayFaculties();
        System.out.println();

        myUniversity.deleteUniversity(); 

        myUniversity.displayDepartments(); 
        System.out.println();

        System.out.println("Faculty members still exist:");
        System.out.println("  - " + gaurav.getName());
        System.out.println("  - " + guzzar.getName());
    }
}