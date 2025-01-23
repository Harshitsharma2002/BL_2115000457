import java.util.*;
public class Sum1{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double number=-1;
double sum=0;
while(number!=0){
number=sc.nextDouble();
sum+=number;
}
System.out.println("Sum: "+sum);
}
}