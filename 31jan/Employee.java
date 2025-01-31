public class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee Name: "+name);
        System.out.println("id"+id);
        System.out.println("salary"+salary);
    }
    public static void main(String[] args){
        Employee emp=new Employee("Harshit",1,20000);
            emp.display();
    }
}