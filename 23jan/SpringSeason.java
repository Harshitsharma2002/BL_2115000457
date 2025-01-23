import java.util.*;
public class SpringSeason{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
int day=sc.nextInt();
if(month==3 && day>20)
System.out.println("Entered Date falls in Spring Season");
else
if(month>3 && month < 6)
System.out.println("Entered Date falls in Spring Season");
else
if(month==6 && day<20)
System.out.println("Entered Date falls in Spring Season");
else
System.out.println("Entered Date does not falls in Spring Season");
}
}