import java.util.*;
public class CircleArea{
public static void main(String [] args){
Circle c1=new Circle();
c1.circumference();
Circle c2=new Circle(23);
c2.circumference();
}
}
class Circle{
private int radius;
public Circle(){
radius=0;
}
public Circle(int radius){
this.radius=radius;
}
public void circumference(){
double circumference=radius*3.14*2;
System.out.println("Circumference of circle: "+circumference);
}
}