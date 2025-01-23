import java.util.*;
public class VotingRights{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
boolean decision=age>18;
if(decision)
System.out.println("The person's age is "+age+" and can vote.");
else
System.out.println("The person's age is "+age+" and cannot vote.");
}
}