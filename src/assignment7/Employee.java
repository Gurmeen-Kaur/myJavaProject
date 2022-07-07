package assignment7;

public class Employee {

	String firstName;
	String lastName;
	private int sinNimber;
	private double salary;
	double calculatedPay;

	public Employee(String firstName, String lastName, int sinNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNimber = sinNumber;

	}

	public int getSinNimber() {
		return sinNimber;
	}

	public void setSinNimber(int sinNimber) {
		this.sinNimber = sinNimber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculatePay() {
		return calculatedPay;
	}
}
