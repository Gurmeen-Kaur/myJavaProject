package javaAssignment3;

import java.util.Scanner;

public class FahrenheitCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degree value ");
		double degreeValueEntered = sc.nextDouble();

		System.out.println("Is entered value in Fahrenheit (F) or celsius (C) ? ");
		String unitChosenByUser = sc.next();

		if (unitChosenByUser.equalsIgnoreCase("F") && degreeValueEntered != 0) {
			double convertedValue = (degreeValueEntered - 32) * 5 / 9;
			System.out.println("Value in Celsius after conversion is " + convertedValue + " C");
		} else if (unitChosenByUser.equalsIgnoreCase("C") && degreeValueEntered != 0) {
			double convertedValue = (degreeValueEntered * 9 / 5) + 32;
			System.out.println("Value in Fahrenheit after conversion is " + convertedValue + " F");
		} else if (degreeValueEntered == 0) {
			System.out.println("Celsius    " + "Fahrenheit");
			for (int i = -20; i <= 25; i += 5) {
				System.out.println(i + "        " + (i * 1.8 + 32));
			}
		} else {
			System.out.println("Invalid value entered. Cannot convert with entered input value ");
		}
		sc.close();
	}
}
