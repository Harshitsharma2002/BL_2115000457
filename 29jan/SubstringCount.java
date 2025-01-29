import java.util.*;
public class SubstringCount{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.next();
System.out.println("Enter the substring");
String sub=sc.next();
int count=0;
for(int i=0;i<=s.length()-sub.length();i++){
int j=0;
if(s.charAt(i)==sub.charAt(0)){
for(;j<sub.length();j++){
if(s.charAt(i+j)!=sub.charAt(j))
break;
}
}
if(j==sub.length())
count++;
}
System.out.println(count);
}
}