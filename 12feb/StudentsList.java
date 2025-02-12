

class Student{
    int rollNo;
    String name;
    int age;
    int grade;
    Student next;
    public Student(int rollNo, String name, int age, int grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age; 
        this.grade = grade;
        this.next=null;
        }
        
        }
 class SList {
        Student head;
        public SList() {
            head = null;
            }
            public void addAtbeginning(int rollNo ,String name,int age,int grade){
                Student newStudent = new Student(rollNo, name, age, grade);
                newStudent.next = head;
                head=newStudent;
            }
            public void addAtLast(int rollNo,String name,int age,int grade){
                Student newStudent=new Student(rollNo, name, age, grade);
                if(head==null){
                    head=newStudent;
                    return;
                    }
                    Student last = head;
                    while(last.next!=null){
                        last = last.next;
                        }
                        last.next = newStudent;
                        }
                        
                
                        public void searchByRoll(int rollNo){
                            Student current = head;
                            while(current != null) {
                                if(current.rollNo == rollNo) {
                                    System.out.println("Student found with roll number " + rollNo);
                                    return;
                                    }
                                    current = current.next;
                                    }
                                }
                                    public void deleteByRoll(int rollNo){
                                        if (head == null) {
                                            System.out.println("List is empty");
                                            return;
                                            }
                                            if (head.rollNo == rollNo) {
                                                head = head.next;
                                                }
                                                Student current = head;
                                                while (current.next != null) {
                                                    if (current.next.rollNo == rollNo) {
                                                            current.next=current.next.next;
                                                            return;
                                                            }
                                                            current = current.next;
                                                        }
                                                    }
                                public void updateByRoll(int rollno,int grade){
                                    Student current = head;
                                    while(current != null) {
                                        if(current.rollNo == rollno) {
                                            current.grade = grade;
                                            return;
                                        }
                                        current = current.next;
                                    }
                                }
                        public void show(){
                            Student current = head;
                            while(current != null) {
                                System.out.println(current.rollNo + " " + current.name + " " + current.grade);
                                current = current.next;
                                }
                        }
                                                



            }


public class StudentsList{
    public static void main(String[] args) {
        SList list=new SList();
        list.addAtbeginning(1,"Guzzar",12,10);
        list.addAtLast(12, "sdfs", 0, 0);
    
        list.show();
    }
}