import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
	int temporary=number;
	int armstrong=0;
	while(number>0){
	int lastDigit=number%10;
	armstrong+=lastDigit*lastDigit*lastDigit;
	number/=10;
	}
	boolean decision=armstrong==temporary;
	System.out.println("Is the number "+temporary+" armstrong ? "+decision);
    }
}