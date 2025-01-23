import java.util.*;
public class SalaryCalculation{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double salary=sc.nextInt();
int yearsOfService=sc.nextInt();
if(yearsOfService>5)
{
salary=salary+(0.04*salary);
}
System.out.println("Total salary: "+salary);
}
}