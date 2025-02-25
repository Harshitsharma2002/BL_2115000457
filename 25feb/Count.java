import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count
{
    public static void main(String[] args) {

        try{
            Boolean header=true;
            int rowCount = 0;
            BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv"));
            String line="";

            while((line=bf.readLine())!=null){
                String[] data=line.split(",");
                if(header==true){
                    header=false;
                    continue;
                }
                rowCount++;




            }
            bf.close();
            System.out.println(rowCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}