import java.util.*;
public class LargestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int factor=-1;
        int number = scanner.nextInt();
        for(int i=1;i<=number/2;i++){
        if(number%i==0)
	factor=Math.max(factor,i);
        }
	System.out.println("Greatest factor of Number "+number+" except itself is "+factor);
    }
}