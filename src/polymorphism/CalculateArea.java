package polymorphism;

public class CalculateArea {

	double area;

	public double calculateArea(double length, double breadth) {
		area = length * breadth;
		return area;
	}

	public double calculateArea(double radius) {
		area = (radius * radius) * 3.14;
		return area;
	}
}
