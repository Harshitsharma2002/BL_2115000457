import java.util.*;
public class Palindrome1{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println("Is the entered string palindrome? "+palindrome(s));
}
public static boolean palindrome(String s){
String rev="";
for(int i=s.length()-1;i>=0;i--){
rev+=s.charAt(i);
}
if(rev.equals(s))
return true;
else
return false;
}
}