import java.util.*;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] arr = {10, 20, 30};
            int index = scanner.nextInt();
            try {
                System.out.println(arr[index] / scanner.nextInt());
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        scanner.close();
    }
}