import java.util.*;
public class CountVowelsAndConsonants{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
s=s.toLowerCase();
int vowels=0,consonants=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
vowels++;
else
consonants++;
}
System.out.println("Number of vowels: "+vowels+" and consonants: "+consonants);
}
}