package assignment7;

public class CommissionBasedEmployees extends Employee {

	double baseSalary;
	double completedSales;
	double percentCommision = 0.15;

	CommissionBasedEmployees(String firstName, String lastName, int sinNumber, double baseSalary,
			double completedSales) {
		super(firstName, lastName, sinNumber);
		this.baseSalary = baseSalary;
		this.completedSales = completedSales;

	}

	public double calculatePay() {
		calculatedPay = baseSalary + (percentCommision * completedSales);
		return calculatedPay;
	}

}
