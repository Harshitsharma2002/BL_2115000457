import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateCalculator{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a date (yyyy-MM-dd): ");
LocalDate date=LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
date=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
System.out.println("Final date:"+date);
}
}