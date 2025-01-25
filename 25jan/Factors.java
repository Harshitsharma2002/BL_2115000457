
import java.util.*;
public class Factors{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
List<Integer> l=new ArrayList<>();
boolean decision=number>1;
if(decision){
int count=0;
for(int i=1;i<=number;i++){
if(number%i==0){
count++;
l.add(i);
}
}
int [] factors=new int[count];
for(int i=0;i<count;i++){
factors[i]=l.get(i);
}
System.out.println("Factors are:");
for(int i=0;i<count;i++){
System.out.print(factors[i]+" ");
}
}
else
System.out.println("The number entered is not a natural number");
}
}
