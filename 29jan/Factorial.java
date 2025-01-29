
import java.util.*;
public class Factorial{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println("Factorial of number is: "+factorial(number));
}
public static int factorial(int number){
if(number==0)
return 1;
return factorial(number-1)*number;
}
}
