package encapsulation;

public class Employee {
	private int sinNumber;

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int sinNumber) {
		this.sinNumber = sinNumber;
	}

	public int getSinNumber() {
		return sinNumber;
	}

	// Change to public void setSinNumber(int sinNumber, CRA cra, int pin)

//	public void setSinNumber(int sinNumber, boolean isCRA, int pin) {
//
//		if (isCRA && sinNumber != 0 && pin == 1234) {
//			this.sinNumber = sinNumber;
//		} else {
//			System.out.println("You don't have authority to change Sin number ");
//		}

	public void setSinNumber(int sinNumber, CRA cra, int pin) {
		if (cra.pinNumber == pin && sinNumber != 0) {
			this.sinNumber = sinNumber;
		} else {
			System.out.println("You don't have authority to change sin number");
		}
	}

}
