import java.util.Scanner;
public class UnitConvertor{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the units in yards and meters");
double yards=sc.nextDouble();
double meter=sc.nextDouble();
System.out.println("yards to feet: "+yards2feet(yards));
System.out.println("feet to yards: "+feet2yards(yards2feet(yards)));
System.out.println("Meters to inches: "+meter2inch(meter));
System.out.println("inches to meters: "+inch2meter(meter2inch(meter)));
System.out.println("inches to centimeters: "+inch2cm(meter2inch(meter)));
}
public static double yards2feet(double yards){
return yards*3;
}
public static double feet2yards(double feet){
return feet*0.333333;
}
public static double meter2inch(double meter){
return meter*39.3701;
}
public static double inch2meter(double inch){
return inch*0.0254;
}
public static double inch2cm(double inch){
return inch*2.54;
}
}