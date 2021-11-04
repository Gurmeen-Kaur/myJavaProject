package TestPackage;
import java.util.Scanner;

public class classAverageInput {
	
	
	
public static void main(String[] args)
		{
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Please enter num1");
	double num1= scan.nextDouble();
	
	System.out.println("Please enter num2");
	double num2= scan.nextDouble();
	
	System.out.println("Please enter num3");
	double num3= scan.nextDouble();
	
	average output = new average();
	output.calculateAverage(num1, num2, num3);
	
	scan.close();
	
	
		}
}