import java.util.*;
public class Largest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int original=number;
int digit=0;
while(number>0){
digit++;
number/=10;
}
int [] digits=new int[digit];
int max=-1, secmax=-1;
for(int i=0;i<digit;i++){
digits[i]=original%10;
original/=10;
if(digits[i]>max){
secmax=max;
max=digits[i];
}
else if(digits[i] > secmax && digits[i] != max){
secmax=digits[i];
}
}
System.out.println("Maximum Digit is "+max+" Second max is "+secmax);
}
}