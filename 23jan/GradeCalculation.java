import java.util.*;
public class GradeCalculation{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int physics=sc.nextInt();
int chemistry=sc.nextInt();
int maths=sc.nextInt();
double percentage=(physics+chemistry+maths)/3;
if(percentage>=80)
System.out.println("Percentage calculated: "+percentage+" Level: 4 and Remark:Above agency-normalized standards");
else if(percentage>=70 && percentage<=79)
System.out.println("Percentage calculated: "+percentage+" Level: 3 and Remark:at agency-normalized standards");
else if (percentage>=60 && percentage>=69)
System.out.println("Percentage calculated: "+percentage+" Level: 2 and Remark:Below but approaching agency-normalized satndards");
else if(percentage>=50 && percentage<=59)
System.out.println("Percentage calculated: "+percentage+" Level: 1 and Remark:well below agency-normalized standards");
else if(percentage>=40 && percentage<=49)
System.out.println("Percentage calculated: "+percentage+" Level: 1- and Remark:too below agency-normalized standards");
else
System.out.println("Percentage calculated: "+percentage+" Level: 4 and Remark:remedial standards");
}
}