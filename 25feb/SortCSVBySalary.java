import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortCSVBySalary {
    public static void main(String[] args) {
        String filePath = "C:\\\\Users\\\\NITRO 5\\\\OneDrive\\\\Desktop\\\\Assignment\\\\25feb\\employees.csv";

        List<String[]> records = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            records = reader.readAll();

            records.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

            System.out.println("Top 5 Highest-Paid Employees:");
            System.out.println(String.join(" | ", header));
            for (int i = 0; i < Math.min(5, records.size()); i++) {
                System.out.println(String.join(" | ", records.get(i)));
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}