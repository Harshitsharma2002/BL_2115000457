import java.util.*;
public class NumberGuessingGame{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int l=1,h=100,guess=0;
System.out.println("Think of a Number between 1 and 100");
while(true){
guess=generateNumber(l,h);
System.out.println("Is it "+guess+" ? Enter 'h' for high, 'l' for low and 'c' for correct.");
char ch=sc.next().charAt(0);
if(ch=='h')
h=guess-1;
else if(ch=='l')
l=guess+1;
else if(ch=='c'){
System.out.println("Guessed it correct");
break;
else
System.out.println("Invalid character");
}
}
}
public static int generateNumber(int l, int h){
return (int) (Math.random()*(h-l+1)+l);
}
}