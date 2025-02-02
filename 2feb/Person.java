public class Person{
    private String name;
    private int age;
    public Person(int age, String name){
    this.age=age;
    this.name=name;
    }
    public Person(Person p){
    this.age=p.age;
    this.name=p.name;
    }
    public void Display(){
    System.out.println("Person's name: "+name);
    System.out.println("Person's age: "+age);
    }
    public static void main(String [] args){
    Person p1=new Person(20, "Aman");
    Person p2=new Person(p1);
    p1.Display();
    p2.Display();
    }
    }