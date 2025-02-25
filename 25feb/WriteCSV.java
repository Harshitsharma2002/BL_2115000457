import java.io.*;

public class WriteCSV {
    public static void main(String[] args) {


  try{
        BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\NITRO 5\\OneDrive\\Desktop\\Assignment\\25feb\\data.csv"));
      BufferedWriter wf=new BufferedWriter((new FileWriter("C:\\\\Users\\\\NITRO 5\\\\OneDrive\\\\Desktop\\\\Assignment\\\\25feb\\target.csv")));

        String line="";
        while((line=bf.readLine())!=null){
            wf.write(line);
            String[] data=line.split(",");
            wf.newLine();
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);


        }
        bf.close();
        wf.close();
    } catch (
    FileNotFoundException e) {
        throw new RuntimeException("file not found");
    } catch (
    IOException e) {
        throw new RuntimeException(e);
    }
}
}