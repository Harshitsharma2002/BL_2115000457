import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvToJsonConverter {

    public static void main(String[] args) {
        String inputCsvFile = "students.csv";  // Input CSV file
        String outputJsonFile = "students.json";  // Output JSON file

        // Convert CSV to JSON
        convertCsvToJson(inputCsvFile, outputJsonFile);
    }

    // Method to convert CSV to JSON
    public static void convertCsvToJson(String inputCsvFile, String outputJsonFile) {
        try {
            // Read the CSV file
            BufferedReader reader = new BufferedReader(new FileReader(inputCsvFile));

            // Read the header row
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",");

            // Initialize a JSONArray to store JSON objects
            JSONArray jsonArray = new JSONArray();

            // Read each data line
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                // Create a JSONObject for each row in the CSV
                JSONObject student = new JSONObject();
                for (int i = 0; i < headers.length; i++) {
                    student.put(headers[i], values[i]);
                }

                // Add the JSONObject to the JSONArray
                jsonArray.put(student);
            }

            // Write the JSON array to a file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputJsonFile))) {
                writer.write(jsonArray.toString(4));  // Pretty print with indentation
                System.out.println("CSV data successfully written to JSON: " + outputJsonFile);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
