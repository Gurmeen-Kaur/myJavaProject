package TestPackage;
import java.util.Scanner;

public class StaticMultiplicationMethod {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		float n1 = sc.nextFloat();
		System.out.println("Please enter second number");
		float n2 = sc.nextFloat();
		
		TwoNumbersToMultiply output = new TwoNumbersToMultiply();
		output.multiply(n1, n2);
		
		sc.close();

}

}
