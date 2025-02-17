import java.io.*;
import java.nio.file.*;

public class LargeFileReadingEfficiency {

    public static void main(String[] args) {
        String fileName = "largefile.txt"; 
        
       
        System.out.println("Testing with FileReader (Character Stream):");
        long startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(fileName)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("FileReader Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // Test InputStreamReader
        System.out.println("\nTesting with InputStreamReader (Byte Stream):");
        startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName))) {
            int ch;
            while ((ch = inputStreamReader.read()) != -1) {
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1000000.0 + " ms");
    }
}
