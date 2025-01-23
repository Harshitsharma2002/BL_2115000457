import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base=scanner.nextInt();
        int power=scanner.nextInt();
	int value=1;
        for(int i=1;i<=power;i++){
	value*=base;
        }
        System.out.println("Power calculated: "+value);
    }
}