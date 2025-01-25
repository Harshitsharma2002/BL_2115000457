import java.util.*;
public class MeanHeight{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double [] heights=new double[11];
double total=0;
for(int ind=0;ind<10;ind++){
heights[ind]=sc.nextDouble();
total+=heights[ind];
}
double mean=total/11;
System.out.println("Mean of all heights is "+mean);
}
}