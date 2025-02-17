import java.util.*;
public class SortComparison{
public static void main(String [] args){
Sort s=new Sort();
int size1=1000;
int size2=10000;
int size3=1000000;
System.out.println("Bubble Sort with size "+size1+" is "+s.bubble(size1));
System.out.println("Merge Sort with size "+size1+" is "+s.merge(size1));
System.out.println("Quick Sort with size "+size1+" is "+s.quick(size1));
System.out.println("Bubble Sort with size "+size2+" is "+s.bubble(size2));
System.out.println("Merge Sort with size "+size2+" is "+s.merge(size2));
System.out.println("Quick Sort with size "+size2+" is "+s.quick(size2));
System.out.println("Bubble Sort with size "+size3+" is "+s.bubble(size3)+" Way Too Long");
System.out.println("Merge Sort with size "+size3+" is "+s.merge(size3));
System.out.println("Quick Sort with size "+size3+" is "+s.quick(size3));
}
}
class Sort{
int [] arr;
public long bubble(int size){
arr=new int[size];
long start=System.nanoTime();
for(int i=0;i<size-1;i++){
for(int j=0;j<size-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
long end=System.nanoTime();
return end-start;
}
public long merge(int size){
arr=new int[size];
long start=System.nanoTime();
sort(arr,0,size-1);
long end=System.nanoTime();
return end-start;
}
public static int[] sortm(int [] arr, int start, int end){
if(start==end){
int bs[]=new int[1];
bs[0]=arr[start];
return bs;
}
int mid=(start+end)/2;
int [] firstSort=sortm(arr,start,mid);
int [] secondSort=sortm(arr,mid+1,end);
return merge(firstSort,secondSort);
}
public static int[] merge(int [] a, int [] b){
int ans[]=new int[a.length+b.length];
int i=0,j=0,k=0;
while(i<a.length && j<b.length){
if(a[i]>b[j]){
ans[k]=b[j];
j++;
}
else{
ans[k]=a[i];
i++;
}
k++;
}
while(i<a.length){
ans[k]=a[i];
k++;i++;
}
while(j<b.length){
ans[k]=b[j];
k++;j++;
}
return ans;
}
public long quick(int size){
arr=new int[size];
long start=System.nanoTime();
sort(arr,0,size-1);
long end=System.nanoTime();
return end-start;
}
public void sort(int [] arr,int si,int ei){
if(si>=ei)
{
return;
}
int pi=CorrectPosition(arr,si,ei);
sort(arr,si,pi-1);
sort(arr,pi+1,ei);
}
public static int CorrectPosition(int [] arr,int si,int ei){
int item=arr[ei];
int ci=si;
for(int i=si;i<ei;i++)
{
if(arr[i]<=item)
{
int temp=arr[i];
arr[i]=arr[ci];
arr[ci]=temp;
ci++;
}
}
int temp=arr[ci];
arr[ci]=arr[ei];
arr[ei]=temp;
return ci;
}
}