import java.io.*;
import java.util.*;

public class DetectDuplicates {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv"; 
        Set<String> seenIds = new HashSet<>();  
        List<String> duplicateRecords = new ArrayList<>();  

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

  
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0].trim(); 
                if (seenIds.contains(id)) {
                    
                    duplicateRecords.add(line);
                } else {
                   
                    seenIds.add(id);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

       
        if (!duplicateRecords.isEmpty()) {
            System.out.println("Duplicate records found:");
            for (String record : duplicateRecords) {
                System.out.println(record);
            }
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
