import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        String sourceFile = "sourceFile.txt";  
        String bufferedDestFile = "bufferedDestFile.txt"; 
        String unbufferedDestFile = "unbufferedDestFile.txt"; 

        
        long bufferedTime = copyFileWithBufferedStreams(sourceFile, bufferedDestFile);
        System.out.println("Buffered Streams Copy Time: " + bufferedTime + " nanoseconds");

       
        long unbufferedTime = copyFileWithUnbufferedStreams(sourceFile, unbufferedDestFile);
        System.out.println("Unbuffered Streams Copy Time: " + unbufferedTime + " nanoseconds");
    }

    
    private static long copyFileWithBufferedStreams(String sourceFile, String destFile) {
        long startTime = System.nanoTime(); 
        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {
             
            byte[] buffer = new byte[4096];  
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.flush();  
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();  
        return endTime - startTime;  
    }

   
    private static long copyFileWithUnbufferedStreams(String sourceFile, String destFile) {
        long startTime = System.nanoTime();  
        
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[4096];  
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();  
        return endTime - startTime;  
    }
}
