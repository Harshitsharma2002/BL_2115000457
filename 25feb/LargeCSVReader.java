 import java.io.*;

public class LargeCSVReader {
    
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv"; // Path to the large CSV file
        int chunkSize = 100;  // Number of lines to read and process at a time
        int totalRecordsProcessed = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentCount = 0;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Process the line here (e.g., display it or parse it)
                currentCount++;

                // If 100 lines are processed, display the count and reset for the next chunk
                if (currentCount == chunkSize) {
                    totalRecordsProcessed += currentCount;
                    System.out.println("Processed " + currentCount + " records.");
                    currentCount = 0;  // Reset for the next chunk
                }
            }

            // If there are any remaining records less than the chunk size, process them
            if (currentCount > 0) {
                totalRecordsProcessed += currentCount;
                System.out.println("Processed " + currentCount + " records.");
            }

            // Final count of records processed
            System.out.println("Total records processed: " + totalRecordsProcessed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 {
    
}
