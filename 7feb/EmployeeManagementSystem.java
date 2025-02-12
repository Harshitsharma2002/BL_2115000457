class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;

    public Intern(String name, int id, int salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Gaurav Patel", 101, 90000, 12);
        Employee developer = new Developer("Gaurav Patel", 102, 75000, "MERN Stack");
        Employee intern = new Intern("Gaurav Patel", 103, 25000, 6);

        System.out.println("Manager Details:");
        manager.display();
        System.out.println("-------------------------------");

        System.out.println("Developer Details:");
        developer.display();
        System.out.println("-------------------------------");

        System.out.println("Intern Details:");
        intern.display();
    }
}