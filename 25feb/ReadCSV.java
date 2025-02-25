import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
            try{
                BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv"));
                String line="";
                while((line=bf.readLine())!=null){
                    String[] data=line.split(",");
                    System.out.println(data[0]);
                    System.out.println(data[1]);
                    System.out.println(data[2]);
                    System.out.println(data[3]);


                }
                bf.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException("file not found");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}