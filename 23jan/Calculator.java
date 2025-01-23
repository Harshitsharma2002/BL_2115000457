import java.util.*;
public class Calculator{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double number1=sc.nextDouble();
double number2=sc.nextDouble();
String op=sc.next();
switch(op){
case "+":
System.out.println("Sum: "+(number1+number2));
break;
case "-":
System.out.println("Difference: "+(number1-number2));
break;
case "*":
System.out.println("Product: "+(number1*number2));
break;
case "/":
System.out.println("Quotient: "+(number1/number2));
break;
default:System.out.println("Invalid Operator");
}
}
}