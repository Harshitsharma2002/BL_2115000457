import java.util.*;
public class Prime{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println("Is "+number+" prime?"+prime(number));
}
public static boolean prime(int number){
for(int i=2;i<=number/2;i++){
if(number%i==0)
return false;
}
return true;
}
}