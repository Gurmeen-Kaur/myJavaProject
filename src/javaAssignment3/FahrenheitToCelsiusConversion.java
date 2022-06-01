package javaAssignment3;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degree value ");
		double degreeValueEntered = sc.nextDouble();

		System.out.println("Is entered value in Fahrenheit (F) or celsius (C) ? ");
		String unitChosenByUser = sc.next();

		if (unitChosenByUser.equalsIgnoreCase("F")) {

			double convertedValue = (degreeValueEntered - 32) * 5 / 9;
			System.out.println("Value in Celsius after conversion is " + convertedValue + " C");
		} else if (unitChosenByUser.equalsIgnoreCase("C")) {
			double convertedValue = (degreeValueEntered * 9 / 5) + 32;
			System.out.println("Value in Fahrenheit after conversion is " + convertedValue + " F");
		} else {
			System.out.println("Invalid value entered. Cannot convert with entered input value ");
		}
		sc.close();
	}

}
