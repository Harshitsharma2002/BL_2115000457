import java.util.*;
public class Largest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("Maximum of three is "+maximum(a,b,c));
}
public static int maximum(int a, int b, int c){
return Math.max(a,Math.max(b,c));
}
}