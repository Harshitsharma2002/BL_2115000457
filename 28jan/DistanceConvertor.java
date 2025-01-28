import java.util.Scanner;
public class DistanceConvertor{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the units in km and meters");
double km=sc.nextDouble();
double meter=sc.nextDouble();
System.out.println("Km to miles: "+km2miles(km));
System.out.println("Miles to km: "+miles2km(km2miles(km)));
System.out.println("Meters to feets: "+meter2feet(meter));
System.out.println("feets to meters: "+feet2meters(meter2feet(meter)));
}
public static double km2miles(double km){
return km*0.621371;
}
public static double miles2km(double miles){
return miles*1.60934;
}
public static double meter2feet(double meter){
return meter*3.28084;
}
public static double feet2meters(double feet){
return feet*0.3048;
}
}