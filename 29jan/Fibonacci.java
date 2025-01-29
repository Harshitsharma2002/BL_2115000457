import java.util.*;
public class Fibonacci{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int terms=sc.nextInt();
for(int i=0;i<terms;i++)
System.out.print(fibonacci(i)+" ");
}
public static int fibonacci(int terms){
if(terms<=1){
return terms;
}
return fibonacci(terms-1)+fibonacci(terms-2);
}
}