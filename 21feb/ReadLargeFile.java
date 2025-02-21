import java.io.*;

public class ReadLargeFile {

    public static void main(String[] args) {
        String inputFile = "largeFile.txt";  

       
        readFileAndPrintErrors(inputFile);
    }

    
    public static void readFileAndPrintErrors(String inputFile) {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            
           
            while ((line = reader.readLine()) != null) {
             
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);  
                }
            }

        } catch (IOException e) {
            System.err.println("IOException occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
