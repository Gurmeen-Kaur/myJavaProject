package assignment5Java;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of first rectangle");
		double length = scanner.nextDouble();

		System.out.println("Enter breadth of first rectangle");
		double breadth = scanner.nextDouble();

		Rectangle area = new Rectangle();

		System.out.println("Area of first rectangle is " + length + " * " + breadth);
		double areaOfRectangle = area.calculatingArea(length, breadth);
		System.out.println("Area of first rectangle is " + areaOfRectangle);

		System.out.println("Enter length of second rectangle");
		length = scanner.nextDouble();

		System.out.println("Enter breadth of first rectangle");
		breadth = scanner.nextDouble();

		System.out.println("Area of second rectangle is " + length + " * " + breadth);
		areaOfRectangle = area.calculatingArea(length, breadth);

		System.out.println("Area of second rectangle is " + areaOfRectangle);
		scanner.close();
	}

}
