import java.util.*;
public class FindFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
	System.out.println("Factors of "+number+" are ");
        for(int i=1;i<=number;i++){
        if(number%i==0)
        System.out.println(i);
        }
    }
}