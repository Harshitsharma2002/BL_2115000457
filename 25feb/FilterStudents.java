import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudents {
    public static void main(String[] args) {
        String filePath = "C:\\\\Users\\\\NITRO 5\\\\OneDrive\\\\Desktop\\\\Assignment\\\\25feb\\\\data.csv";

        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean header = true;

            System.out.println("Students with Marks > 80:");
            while ((line = bf.readLine()) != null) {
                if (header) {
                    header = false; // Skip header row
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) continue; // Ensure valid row format

                int marks = Integer.parseInt(data[3].trim()); // Extract & parse marks
                if (marks > 80) {
                    System.out.println(line); // Print qualifying student record
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}