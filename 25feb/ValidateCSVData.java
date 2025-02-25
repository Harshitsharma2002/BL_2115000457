import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static void main(String[] args) {
        String filePath = "C:\\\\Users\\\\NITRO 5\\\\OneDrive\\\\Desktop\\\\Assignment\\\\25feb\\employees.csv";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            String[] record;
            int lineNumber = 1;

            while ((record = reader.readNext()) != null) {
                lineNumber++;
                String email = record[2];
                String phone = record[3];

                if (!Pattern.matches(emailRegex, email)) {
                    System.out.println("Invalid email format at line " + lineNumber + ": " + email);
                }

                if (!Pattern.matches(phoneRegex, phone)) {
                    System.out.println("Invalid phone number at line " + lineNumber + ": " + phone);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}