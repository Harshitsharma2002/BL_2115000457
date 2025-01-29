import java.util.*;
public class Toggle{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String toggle="";
for(int i=0;i<s.length();i++){
if(Character.isLowerCase(s.charAt(i))){
toggle+=Character.toUpperCase(s.charAt(i));
}
else if(Character.isUpperCase(s.charAt(i))){
toggle+=Character.toLowerCase(s.charAt(i));
}
else
toggle+=s.charAt(i);
}
System.out.println("Toggled String: "+toggle);
}
}