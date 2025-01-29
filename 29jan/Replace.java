import java.util.*;
public class Replace{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String word1=sc.next();
String word2=sc.next();
String [] arr=s.split("\\s+");
String ans="";
for(int i=0;i<arr.length;i++){
if(!arr[i].equals(word1)){
ans+=arr[i]+" ";
}
else
ans+=word2+" ";
}
System.out.println(ans);
}
}