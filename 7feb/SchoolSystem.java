
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Person teacher = new Teacher("Gaurav Patel", 30, "Mathematics");
        Person student = new Student("Rahul Sharma", 16, 10);
        Person staff = new Staff("Anjali Mehta", 40, "Administration");

        System.out.println("Teacher Details:");
        teacher.displayInfo();
        System.out.println("------------------------------");

        System.out.println("Student Details:");
        student.displayInfo();
        System.out.println("------------------------------");

        System.out.println("Staff Details:");
        staff.displayInfo();
    }
}
