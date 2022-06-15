package assignment5Java;

import java.util.Scanner;

public class CalculatingWeeklySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Employee salaryCalculator = new Employee();

		System.out.println("Enter the number of hours the employee has worked in a week");
		double noOfHours = scanner.nextDouble();

		double salaryOfEmployee = salaryCalculator.weeklySalary(noOfHours);

	}

}
