import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateComparison{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first date (yyyy-MM-dd): ");
LocalDate d1=LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
System.out.print("Enter second date (yyyy-MM-dd): ");
LocalDate d2=LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
System.out.println(d1.isBefore(d2)?"First date is before second date":
d1.isAfter(d2)?"First date is after second date":"Both dates are the same");
}
}