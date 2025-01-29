import java.util.*;
public class Frequent{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
HashMap<Character, Integer> hp=new HashMap<>();
for(int i=0;i<s.length();i++){
hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
}
int max=0;
char ch=' ';
for(char c:hp.keySet()){
if(hp.get(c)>max){
max=hp.get(c);
ch=c;
}
}
System.out.println("Most Frequent Character: "+ch);
}
}