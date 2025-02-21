import java.io.*;

public class ConvertToLowercase {

    public static void main(String[] args) {
       
        String inputFile = "input.txt";  
        String outputFile = "output.txt";  

        
        convertToLowercase(inputFile, outputFile);
    }

    
    public static void convertToLowercase(String inputFile, String outputFile) {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                
                String lowercaseLine = line.toLowerCase();

                
                writer.write(lowercaseLine);
                writer.newLine();  
            }

            System.out.println("The content has been converted to lowercase and saved in " + outputFile);

        } catch (IOException e) {
            System.err.println("An error occurred while reading or writing the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
