import java.io.*;

class Student {
    int rollNumber;
    String name;
    double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
}

public class StudentBinaryFile {
    public static void main(String[] args) {
        String fileName = "students.dat";

        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Student[] students = {
                new Student(101, "Alice", 3.8),
                new Student(102, "Bob", 3.5),
                new Student(103, "Charlie", 3.9)
            };

            for (Student student : students) {
                dos.writeInt(student.rollNumber);
                dos.writeUTF(student.name);
                dos.writeDouble(student.gpa);
            }
            System.out.println("Student details have been saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

      
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nRetrieved Student Details:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}