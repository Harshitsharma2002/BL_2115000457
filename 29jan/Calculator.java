import java.util.*;
public class Calculator{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double n1=sc.nextDouble();
double n2=sc.nextDouble();
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+n1+" and "+n2+" is "+addition(n1,n2)+","+subtraction(n1,n2)+","+multiplication(n1,n2)+" and "+division(n1,n2));
}
public static double addition(double number1, double number2){
return number1+number2;
}
public static double subtraction(double number1, double number2){
return number1-number2;
}
public static double multiplication(double number1, double number2){
return number1*number2;
}
public static double division(double number1, double number2){
return number1/number2;
}
}