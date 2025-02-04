public class Employee{
    static String companyName="Google";
    private String name;
    private String id="ENG00123";
    private String designation;
    static int totalEmployees=0;
    public Employee(String name, String designation){
    this.name=name;
    this.designation=designation;
    totalEmployees++;
    }
    static void displayTotalEmployees(){
    System.out.println("Total Number of Employees: "+totalEmployees);
    }
    public void Display(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee id: "+id);
    System.out.println("Employee Designation: "+designation);
    }
    public static void main(String [] args){
    Employee e=new Employee("gumnaam","Software Engineer");
    e.displayTotalEmployees();
    e.Display();
    System.out.println(e instanceof Employee);
    }
    }