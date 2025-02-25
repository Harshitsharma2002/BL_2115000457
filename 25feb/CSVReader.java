import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static void main(String[] args) {
        String csvFile = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv";  
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
          
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(","); 
                int id = Integer.parseInt(fields[0].trim());
                String name = fields[1].trim();
                int age = Integer.parseInt(fields[2].trim());

             
                Student student = new Student(id, name, age);
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
