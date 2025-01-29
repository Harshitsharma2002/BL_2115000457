import java.util.*;
public class LongestWord{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String longest="";
String [] arr=s.split("\\s+");
for(int i=0;i<arr.length;i++){
if(longest.length()<arr[i].length()){
longest=arr[i];
}
}
System.out.println("Longest word in the string is: "+longest);
}
}