import java.io.*;

public class BinaryToTextReader {
    public static void main(String[] args) throws IOException {
        String filePath = "java.txt"; 

        FileInputStream fileInputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
    }
}