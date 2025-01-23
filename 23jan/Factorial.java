import java.util.*;
public class Factorial{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean decision=number>1;
if(decision){
int product=1;
while(number>0){
product*=number;
number--;
}
System.out.println("Factorial is "+product);
}
else
System.out.println("The number entered is not a natural number");
}
}