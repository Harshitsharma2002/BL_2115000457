import java.util.*;
public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Multiples of "+number+" are ");
        for(int i=number;i<=100;i++){
        if(i%number==0)
        System.out.println(i);
        }
    }
}