import java.util.*;
public class Chocolates{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int chocolates=sc.nextInt();
int students=sc.nextInt();
int [] ans=findRemainderAndQuotient(chocolates, students);
System.out.println("Among "+students+" students, "+ans[0]+" chocolates are gives to each and "+ans[1]+" remains.");
}
public static int[] findRemainderAndQuotient(int chocolates, int students){
int ans[]=new int[2];
ans[0]=chocolates/students;
ans[1]=chocolates%students;
return ans;
}
}