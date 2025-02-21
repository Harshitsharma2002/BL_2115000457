import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Employee implements Serializable {
    private static final long serialVersionUID = 1L; 
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { ID=" + id + ", Name='" + name + "', Department='" + department + "', Salary=" + salary + " }";
    }
}

public class EmployeeManagement {
    private static final String FILE_NAME = "employees.ser"; 

    
    public static void saveEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("\n Employees saved successfully.");
        } catch (IOException e) {
            System.out.println(" Error saving employees: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return employees; 
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("\n Employees loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" No previous data found or error occurred.");
        }
        return employees;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = loadEmployees();

        while (true) {
            System.out.println("\n Menu:");
            System.out.println(" Add Employee");
            System.out.println(" Display Employees");
            System.out.println(" Save & Exit");
            System.out.print(" Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("🔹 Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("🔹 Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("🔹 Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("🔹 Enter Salary: ");
                    double salary = scanner.nextDouble();

                    employees.add(new Employee(id, name, department, salary));
                    System.out.println(" Employee added successfully.");
                    break;

                case 2:
                    System.out.println("\n Employee List:");
                    if (employees.isEmpty()) {
                        System.out.println(" No employees found.");
                    } else {
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    saveEmployees(employees);
                    System.out.println(" Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }
        }
    }
}