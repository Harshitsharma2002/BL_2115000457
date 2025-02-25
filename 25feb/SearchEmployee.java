import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployee {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\employees.csv";

        try (BufferedReader bf = new BufferedReader(new FileReader(filePath));
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter employee name to search: ");
            String searchName = scanner.nextLine().trim().toLowerCase(); // Convert to lowercase for case-insensitive search

            String line;
            boolean header = true;
            boolean found = false;

            while ((line = bf.readLine()) != null) {
                if (header) {
                    header = false; // Skip header row
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) continue; // Ensure valid row format

                String name = data[1].trim().toLowerCase(); // Extract & normalize name
                if (name.equals(searchName)) {
                    System.out.println("Employee Found:");
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: $" + data[3]);
                    found = true;
                    break; // Stop searching after finding the first match
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}