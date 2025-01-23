import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfDigits=0;
        while(number>0){
        numberOfDigits++;
        number/=10;
        }
        System.out.println("Number of digits in number entered is "+numberOfDigits);
    }
}