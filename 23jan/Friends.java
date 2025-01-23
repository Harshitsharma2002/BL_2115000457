import java.util.*;
public class Friends{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int AnthonyHeight=sc.nextInt();
int AnthonyAge=sc.nextInt();
int AkbarHeight=sc.nextInt();
int AkbarAge=sc.nextInt();
int AmarHeight=sc.nextInt();
int AmarAge=sc.nextInt();
if(AnthonyAge>AkbarAge){
if(AkbarAge<AmarAge)
System.out.println("Youngest of all is Akbar with age "+AkbarAge);
else
System.out.println("Youngest of all is Amar with age "+AmarAge);
}
else
System.out.println("Youngest of all is Anthony with age "+AnthonyAge);

if(AnthonyHeight<AkbarHeight){
if(AkbarHeight>AmarHeight)
System.out.println("Tallest of all is Akbar with height "+AkbarHeight);
else
System.out.println("Tallest of all is Amar with height "+AmarHeight);
}
else
System.out.println("Tallest of all is Anthony with height "+AnthonyHeight);
}
}