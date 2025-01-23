import java.util.*;
public class Natural2{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean decision=number>1;
if(decision){
int sum1=((number+1)*number)/2;
int sum=0;
while(number>0){
sum+=number;
number--;
}
System.out.println("Sum using while is "+sum+" and sum using formula is "+sum1);
}
else
System.out.println("The number "+number+" is not a natural number");
}
}