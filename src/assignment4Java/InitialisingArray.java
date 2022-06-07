package assignment4Java;

import java.util.Arrays;
import java.util.Scanner;

public class InitialisingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayMonthCount = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		System.out.println("Number of months in a year are " + Arrays.toString(arrayMonthCount));

		double[] employeeSalary = new double[5];

		employeeSalary[0] = 56000;
		employeeSalary[1] = 44000;
		employeeSalary[2] = 76000;
		employeeSalary[3] = 80000;
		employeeSalary[4] = 90000;

		System.out.println("Salaries of employees number 1 to 5 are " + Arrays.toString(employeeSalary));

		Scanner scanner = new Scanner(System.in);
		String[] arrayStudents = new String[10];

		for (int i = 0; i < arrayStudents.length; i++) {
			System.out.println("Enter roll number " + (i + 1) + " student name");
			arrayStudents[i] = scanner.next();

		}
		System.out.println("Names of students enrolled in class are " + Arrays.toString(arrayStudents));
		scanner.close();
	}
}
