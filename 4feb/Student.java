public class Student{
    static String universityName="GLA University";
    private String name;
    private char grade;
    final private int rollNumber;
    static int totalStudents=0;
    public Student(String name, char grade, int rollNumber){
    this.name=name;
    this.grade=grade;
    this.rollNumber=rollNumber;
    totalStudents++;
    }
    public void displayTotalStudents(){
    System.out.println("Total Students: "+totalStudents);
    }
    public void Display(){
    System.out.println("University Name: "+universityName);
    System.out.println("Student name: "+name);
    System.out.println("Student grade: "+grade);
    System.out.println("Student roll Number: "+rollNumber);
    }
    public static void main(String [] args){
    Student s=new Student("Ajay",'A',2115000001);
    System.out.println(s instanceof Student);
    s.displayTotalStudents();
    s.Display();
    }
    }