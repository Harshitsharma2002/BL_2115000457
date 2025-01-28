import java.util.*;
public class Division{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt();
int number2=sc.nextInt();
int [] ans=findRemainderAndQuotient(number1, number2);
System.out.println("The Quotient is "+ans[0]+" and Remainder is "+ans[1]+" of two number "+number1+" and "+number2);
}
public static void findRemainderAndQuotient(int number1, int number2){
int ans[]=new int[2];
int ans[0]=number1/number2;
int ans[1]=number1%number2;
return ans;
}
}