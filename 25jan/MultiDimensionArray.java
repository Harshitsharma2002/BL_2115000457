import java.util.*;
public class MultiDimensionArray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
int [] array=new int[row*col];
int k=0;
int [][] matrix=new int[row][col];
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
matrix[i][j]=sc.nextInt();
array[k]=matrix[i][j];
k++;
}
}
System.out.println("Array elements are");
for(int i=0;i<array.length;i++)
{
System.out.print(array[i]+" ");
}
}
}