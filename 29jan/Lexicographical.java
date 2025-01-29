import java.util.*;
public class Lexicographical{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
if(s1.compareTo(s2)>s2.compareTo(s1))
System.out.println(s2+" comes before "+s1);
else
System.out.println(s1+" comes before "+s2);
}
}