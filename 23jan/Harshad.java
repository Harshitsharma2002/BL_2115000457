import java.util.Scanner;
public class Harshad {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int sumOfDigits = 0;
int originalNumber = number;
while (number > 0) {
sumOfDigits += number % 10;
number /= 10;
}
boolean isHarshadNumber=originalNumber % sumOfDigits == 0;
System.out.println("Is entered number Harshad? "+isHarshadNumber);
}
}