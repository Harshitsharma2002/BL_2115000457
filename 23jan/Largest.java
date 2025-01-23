import java.util.*;
public class Largest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
int max=Math.max(number1,Math.max(number2, number3));
boolean decision1=max==number1;
boolean decision2=max==number2;
boolean decision3=max==number3;
System.out.println("Is the first number the largest?"+decision1);
System.out.println("Is the second number the largest?"+decision2);
System.out.println("Is the third number the largest?"+decision3);
}
}