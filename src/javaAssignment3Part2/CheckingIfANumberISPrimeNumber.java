package javaAssignment3Part2;

import java.util.Scanner;

public class CheckingIfANumberISPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();

		for (int num = number; num >= 2; num++) {
			if (num % num == 0 && num % 1 == 0) {
				System.out.println("it is a prime number");
				break;
			} else {
				System.out.println("it is not a prime number");
			}
		}

	}

}
