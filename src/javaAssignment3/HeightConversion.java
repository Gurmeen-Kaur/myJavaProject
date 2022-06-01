package javaAssignment3;

import java.util.Scanner;

public class HeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you height in feet");
		double heightInFoot = sc.nextDouble();

		System.out.println("Enter you height in inches");
		double heightInInches = sc.nextDouble();

		double heightInCentimetres = (30.48 * heightInFoot) + (2.54 * heightInInches);

		System.out.println("Height in cemtimetres is : " + heightInCentimetres);
		sc.close();
	}

}
