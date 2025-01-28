import java.util.*;
public class Temperature{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double temperature=sc.nextDouble();
double windSpeed=sc.nextDouble();
double windChill=calculateWindChill(temperature, windSpeed);
System.out.println("WindChill calculated is: "+windChill);
}
public static double calculateWindChill(double temp, double windSpeed){
return 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * (Math.pow(windSpeed,0.16));
}
}