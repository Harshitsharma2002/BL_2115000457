import java.util.*;
public class Factors{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int [] arr=factors(number);
System.out.println("Factors are:");
for(int i=0;i<count;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
double [] cal=Calculate(arr);
System.out.println("Sum of all factors: "+cal[0]);
System.out.println("Square Sum of all factors: "+cal[1]);
System.out.println("Product of all factors: "+cal[2]);
}
public static int[] factors(int number){
List<Integer> l=new ArrayList<>();
int count=0;
for(int i=1;i<=number;i++){
if(number%i==0){
count++;
l.add(i);
}
}
int [] arr=new int[count];
for(int i=0;i<count;i++){
arr[i]=l.get(i);
}
return arr;
}
public static double[] Calculate(int [] arr){
double cal[]=new double[3];
cal[2]=1;
for(int i=0;i<arr.length;i++){
cal[0]+=arr[i];
cal[1]+=Math.pow(arr[i],2);
cal[2]*=arr[i];
}
return cal;
}
}