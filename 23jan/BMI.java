import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextInt();
	double height = scanner.nextInt();
        double bmi=weight/((height*height)/100);
	if(bmi<=18.4)
	System.out.println("Underweight");
	else if(bmi>18.4 && bmi<=24.9) 
	System.out.println("Normal");
	else if(bmi>=25 &&  bmi<=39.9)
	System.out.println("Overweight");
	else
	System.out.println("Obese");
    }
}