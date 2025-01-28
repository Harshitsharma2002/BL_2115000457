import java.util.*;
public class CheckLargest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt();
int number2=sc.nextInt();
int number3=sc.nextInt();
findSmallestAndLargest(number1, number2, number3);
}
public static void findSmallestAndLargest(int number1, int number2, int number3){
int max=Math.max(number1,Math.max(number2, number3));
int min=Math.min(number1,Math.min(number2, number3));
System.out.println("Largest of all is: "+max);
System.out.println("Smallest of all is: "+min);
}
}