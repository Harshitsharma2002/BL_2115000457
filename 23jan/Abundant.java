import java.util.*;
public class Abundant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temporary=number;
	int sum=0;
	for(int i=1;i<number;i++){
        if(number%i==0)
	sum+=i;
        }
        boolean decision=sum>temporary;
        System.out.println("Is the number "+temporary+" abundant? "+decision);
    }
}