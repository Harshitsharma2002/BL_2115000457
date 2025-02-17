import java.util.*;
public class SearchComparison{
public static void main(String [] args){
Search s=new Search();
int size1=1000;
int size2=10000;
int size3=1000000;
System.out.println("Time taken by Linear Search for size "+size1+" is "+s.linear(size1,9));
System.out.println("Time taken by Binary Search for size "+size1+" is "+s.binary(size1,9));
System.out.println("Time taken by Linear Search for size "+size2+" is "+s.linear(size2,9));
System.out.println("Time taken by Binary Search for size "+size2+" is "+s.binary(size2,9));
System.out.println("Time taken by Linear Search for size "+size3+" is "+s.linear(size3,9));
System.out.println("Time taken by Binary Search for size "+size3+" is "+s.binary(size3,9));
}
}
class Search{
int [] arr;
public long linear(int size, int target){
arr=new int[size];
long start=System.nanoTime();
for(int i=0;i<size;i++){
if(arr[i]==target)
break;
}
long end=System.nanoTime();
return end-start;
}
public long binary(int size, int target){
arr=new int[size];
int low=0,high=size-1;
long start=System.nanoTime();
while(low<=high){
int mid=(low+high)/2;
if(arr[mid]==target)
break;
else if(arr[mid]>target)
high=mid-1;
else
low=mid+1;
}
long end=System.nanoTime();
return end-start;
}
}