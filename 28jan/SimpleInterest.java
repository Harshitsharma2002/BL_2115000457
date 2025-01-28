import java.util.*;
public class SimpleInterest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principle, rate and time");
int p=sc.nextInt();
int r=sc.nextInt();
int t=sc.nextInt();
System.out.println("The simple interest is: "+Interest(p,r,t));
}
public static double Interest(int p, int r, int t){
return p*r*t*0.01;
}
}