import java.util.*;
public class Random{
public static void main(String [] args){
int [] randoms=generate4DigitRandomArray(5);
System.out.println("Numbers are: ");
for(int i=0;i<randoms.length;i++){
System.out.print(randoms[i]+" ");
}
double[] cal=findAverageMinMax(randoms);
System.out.println("Average: "+cal[0]);
System.out.println("Min: "+cal[2]);
System.out.println("Max: "+cal[1]);
}
public static int[] generate4DigitRandomArray(int size){
int[] randoms=new int[5];
for(int i=0;i<5;i++){
randoms[i]=(int) Math.random()*10000;
}
return randoms;
}
public static double[] findAverageMinMax(int[] numbers){
double [] cal=new double[3];
cal[2]=Integer.MAX_VALUE;
for(int i=0;i<numbers.length;i++){
cal[0]+=numbers[i];
cal[1]=Math.max(numbers[i],cal[1]);
cal[2]=Math.min(numbers[i],cal[2]);
}
cal[0]/=numbers.length;
return cal;
}
}