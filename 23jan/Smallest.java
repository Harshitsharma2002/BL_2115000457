import java.util.*;
public class Smallest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
int min=Math.min(number1,Math.min(number2, number3));
boolean decision=min==number1;
System.out.println("Is the first number the smallest? "+decision);
}
}