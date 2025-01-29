import java.util.*;
public class RemoveDuplicates{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
HashMap<Character, Integer> hp=new HashMap<>();
for(int i=0;i<s.length();i++){
hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
}
String different="";
for(char ch:hp.keySet()){
different+=ch;
}
System.out.println("String after removing duplicates: "+different);
}
}