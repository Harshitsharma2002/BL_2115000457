import java.util.*;
public class Quadratic{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of a,b,c ");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double delta=Math.pow(b,2)+(4*a*c);
double [] root=roots(delta,a,b,c);
for(int i=0;i<root.length;i++){
System.out.println(root[i]+" ");
}
}
public static double[] roots(double delta, double a, double b, double c){
if(delta>0){
double [] roots=new double[2];
roots[0]=(-b+Math.pow(delta,0.5))/(2*a);
roots[1]=(-b-Math.pow(delta,0.5))/(2*a);
return roots;
}
else if(delta==0){
double [] roots=new double[1];
roots[0]=(-b)/(2*a);
return roots;
}
else
return new double[0];
}
}