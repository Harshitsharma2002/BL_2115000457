import java.util.*;
public class Factorial2{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean decision=number>1;
if(decision){
int product=1;
for(int i=number;i>=1;i--){
product*=i;
}
System.out.println("Factorial is: "+product);
}
else
System.out.println("The number "+number+" is not a natural number");
}
}