package javaAssignment3;

import java.util.Scanner;

public class NumberLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an initial number from where you want the count to start");
		int initialNumber = sc.nextInt();

		System.out.println("Enter the number where you want to stop the count ");
		int endNumber = sc.nextInt();

		int count = 0;

		for (int num = initialNumber; num <= endNumber; num++) {
			System.out.println(num);
			count++;

		}
		System.out.println("Total count of numbers is : " + count);
		sc.close();
	}

}
