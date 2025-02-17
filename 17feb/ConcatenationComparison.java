import java.util.*;
public class ConcatenationComparison{
public static void main(String [] args){
Concatenation c=new Concatenation();
int size1=1000;
int size2=10000;
int size3=1000000;
System.out.println("String Concatenation with size: "+size1+" is "+c.StringC(size1));
System.out.println("StringBuilder Concatenation with size: "+size1+" is "+c.BuilderC(size1));
System.out.println("StringBuffer Concatenation with size: "+size1+" is "+c.BufferC(size1));
System.out.println("String Concatenation with size: "+size2+" is "+c.StringC(size2));
System.out.println("StringBuilder Concatenation with size: "+size2+" is "+c.BuilderC(size2));
System.out.println("StringBuffer Concatenation with size: "+size2+" is "+c.BufferC(size2));;
System.out.println("String Concatenation with size: "+size3+" is "+c.StringC(size3));
System.out.println("StringBuilder Concatenation with size: "+size3+" is "+c.BuilderC(size3));
System.out.println("StringBuffer Concatenation with size: "+size3+" is "+c.BufferC(size3));
}
}
class Concatenation{
public long StringC(int size){
String s="";
long start=System.nanoTime();
for(int i=0;i<size;i++){
s+='a';
}
long end=System.nanoTime();
return end-start;
}
public long BuilderC(int size){
StringBuilder sb=new StringBuilder(size);
long start=System.nanoTime();
for(int i=0;i<size;i++){
sb.append('s');
}
long end=System.nanoTime();
return end-start;
}
public long BufferC(int size){
StringBuffer sb=new StringBuffer(size);
long start=System.nanoTime();
for(int i=0;i<size;i++){
sb.append('s');
}
long end=System.nanoTime();
return end-start;
}
}