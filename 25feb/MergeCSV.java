import java.io.*;
import java.util.*;

public class MergeCSV {

    public static void main(String[] args) {
        String file1 = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv";  
        String file2 = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv"; 
        String outputFile = "merged_students.csv"; 

        Map<Integer, Student> studentMap = new HashMap<>();

     
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0].trim());
                String name = fields[1].trim();
                int age = Integer.parseInt(fields[2].trim());

                Student student = new Student(id, name, age, 0, "");
                studentMap.put(id, student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

      
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0].trim());
                int marks = Integer.parseInt(fields[1].trim());
                String grade = fields[2].trim();

           
                if (studentMap.containsKey(id)) {
                    Student student = studentMap.get(id);
                    student.setMarks(marks);
                    student.setGrade(grade);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
       
            writer.write("ID,Name,Age,Marks,Grade\n");

            for (Student student : studentMap.values()) {
                writer.write(student.toString() + "\n");
            }
            System.out.println("Merged data has been written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
