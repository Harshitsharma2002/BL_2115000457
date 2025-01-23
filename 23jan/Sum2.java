import java.util.*;
public class Sum2{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double number=2;
double sum=0;
while(number!=0){
number=sc.nextDouble();
if(number<0)
break;
sum+=number;
}
System.out.println("Sum: "+sum);
}
}