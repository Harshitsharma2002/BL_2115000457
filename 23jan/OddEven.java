import java.util.*;
public class OddEven{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
boolean decision=number>1;
if(decision){
System.out.println("Even Numbers: ");
for(int i=1;i<=number;i++){
if(i%2==0)
System.out.print(i+" ");
}
System.out.println();
System.out.println("Odd Numbers: ");
for(int i=1;i<=number;i++){
if(i%2!=0)
System.out.print(i+" ");
}
}
else
System.out.println("The number "+number+" is not a natural number");
}
}