package assignment5Java;

import java.util.Scanner;

public class AmusementRidePark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the height of the person");
		int enteredHeight = scanner.nextInt();

		System.out.println("Enter weight of the person");
		double enteredWeight = scanner.nextDouble();

		Person person1 = new Person();
		person1.check(enteredHeight, enteredWeight);

	}

}
