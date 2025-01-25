import java.util.Scanner;
public class FizzBuzz {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
String [] array=new String[number+1];
for(int i=0;i<=number;i++){
if(i%3==0 && i%5==0)
array[i]="FizzBuzz";
else if(i%3==0)
array[i]="Fizz";
else if (i%5==0)
array[i]="Buzz";
else
array[i]=String.valueOf(i);
}
for(int i=0;i<=number;i++){
System.out.println(array[i]);
}
}
}