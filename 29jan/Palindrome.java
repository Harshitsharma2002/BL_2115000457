import java.util.*;
public class Palindrome{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
s=s.toLowerCase();
String rev="";
for(int i=s.length()-1;i>=0;i--){
rev+=s.charAt(i);
}
if(s.equals(rev))
System.out.println("String is Palindrome");
else
System.out.println("String is not palindrome");
}
}