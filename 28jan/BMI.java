import java.util.*;
public class BMI{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
double personData[][]=new double[number][3];
System.out.println("Enter the weights and heights");
for(int i=0;i<number;i++){
for(int j=0;j<2;j++){
personData[i][j]=sc.nextInt();
}
personData[i][2]=bmi(personData,i);
System.out.print(personData[i][2]+" ");
}
String [] weightStatus=weightstatus(personData);
for(int i=0;i<weightStatus.length;i++){
System.out.println("Person with weight "+personData[i][0]+", height "+personData[i][1]+" and BMI "+personData[i][2]+" is "+weightStatus[i]);
}
}
public static double bmi(double [][] personData, int i){
return personData[i][0]/(personData[i][1]*personData[i][1]*0.01);
}
public static String[] weightstatus(double [][] personData){
String weightStatus[]=new String[personData.length];
for(int i=0;i<weightStatus.length;i++){
if(personData[i][2]<=18.4)
weightStatus[i]="Underweight";
else if(personData[i][2]>18.4 && personData[i][2]<=24.9)
weightStatus[i]="Normal";
else if(personData[i][2]>=25 &&  personData[i][2]<=39.9)
weightStatus[i]= "Overweight";
else
weightStatus[i]="Obese";
}
return weightStatus;
}
}