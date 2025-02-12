
import java.util.ArrayList;
import java.util.List;

class Employee{
    String name;
    public Employee(String name){
        this.name = name;
    }
    public void display(){
        System.out.println(this.name);
    }
}
class Department{
    String deptName;
    List<Employee> employees ;
    public Department(String deptName){
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }
    public void addEmp(String empname){
        employees.add(new Employee(empname));
    }
    public void displayDept(){
        System.out.println("DeptName" +this.deptName);
        for(Employee emp:employees){
           emp.display();
        }
        
    }

}
class Company{
    String companyName;
    ArrayList<Department> departments;
    public Company(String companyName){
        this.companyName = companyName;
        this.departments= new ArrayList<>();
    }
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

   
    public void addEmployeeToDepartment(String deptName, String employeeName) {
        for (Department dept : departments) {
            if (deptName.equals(deptName)) {
                dept.addEmp(employeeName);
                return;
            }
        }
    }
    public void display() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDept();
        }
    }

}

public class CompanySystem {
    public static void main(String[] args) {
        Company myCompany = new Company("capgemini");

        myCompany.addDepartment("IT");
        myCompany.addDepartment("HR");

        myCompany.addEmployeeToDepartment("IT", "A");
        myCompany.addEmployeeToDepartment("IT", "B");
        myCompany.addEmployeeToDepartment("HR", "C");

        myCompany.display();
        
    }
    
}
