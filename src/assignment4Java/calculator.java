package assignment4Java;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		double firstNumber = scanner.nextDouble();

		System.out.println("Enter the second number");
		double secondNumber = scanner.nextDouble();

		System.out.println("Enter the operation you wish to perform");
		String operation = scanner.next();

		switch (operation) {
		case "addition": {
			double result = firstNumber + secondNumber;
			System.out.println("Result = " + result);
		}
		case "subtraction": {
			double result = firstNumber - secondNumber;
			System.out.println("Result = " + result);
		}
		case "multiplication": {
			double result = firstNumber * secondNumber;
			System.out.println("Result = " + result);
		}
		case "division": {
			double result = firstNumber / secondNumber;
			System.out.println("Result = " + result);
		}
		}
		scanner.close();
	}

}
