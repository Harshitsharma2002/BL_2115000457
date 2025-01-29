import java.util.*;
public class TemperatureConversion{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int farenheit=sc.nextInt();
System.out.println("Farenheit to celsius: "+farhenheit2celsius(farenheit));
System.out.println("Celsius to farenheit: "+celsius2farhenheit(farhenheit2celsius(farenheit)));
}
public static double farhenheit2celsius(double farenheit){
return (farenheit - 32) * 5 / 9;
}
public static double celsius2farhenheit(double celsius){
return (celsius * 9 / 5) + 32;
}
}