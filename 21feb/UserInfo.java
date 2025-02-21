import java.io.*;

public class UserInfo {

    public static void main(String[] args) {
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            
            System.out.print("Enter your age: ");
            String age = reader.readLine();

            
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            
            FileWriter writer = new FileWriter("userInfo.txt", true);  
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            
            bufferedWriter.write("Name: " + name + "\n");
            bufferedWriter.write("Age: " + age + "\n");
            bufferedWriter.write("Favorite Programming Language: " + language + "\n");
            bufferedWriter.write("-----------------------------\n");  

           
            bufferedWriter.close();

            System.out.println("Your information has been saved to 'userInfo.txt'.");

        } catch (IOException e) {
            System.err.println("An error occurred while reading input or writing to the file.");
            e.printStackTrace();
        }
    }
}
