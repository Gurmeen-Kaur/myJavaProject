package polymorphism;

import java.util.Scanner;

public class CalculateAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea calculatearea = new CalculateArea();
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the shape for which you want to calculate area?");
		String typeOfShape = scanner.next();

		if (typeOfShape.equalsIgnoreCase("rectangle")) {
			System.out.println("enter length");
			double length = scanner.nextDouble();
			System.out.println("enter breadth");
			double breadth = scanner.nextDouble();
			System.out.println("area of rectangle is equal to " + calculatearea.calculateArea(length, breadth));
		} else if (typeOfShape.equalsIgnoreCase("circle")) {
			System.out.println("enter radius of the circle");
			double radius = scanner.nextDouble();
			System.out.println("area of circle is equal to " + calculatearea.calculateArea(radius));
		} else {
			System.out.println("Invalid input");
		}
	}

}
