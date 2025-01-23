import java.util.*;
public class Natural{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean decision=number>1;
if(decision)
System.out.println("The sum of "+number+" natural numbers is "+((number+1)*number)/2);
else
System.out.println("The number "+number+" is not a natural number");
}
}