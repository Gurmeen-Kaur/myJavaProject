package assignment7;

public class ContractualEmployees extends Employee {

	int hoursWorked;
	int standardHours = 20;
	int overTimeHours;
	double hourlyWage;

	ContractualEmployees(String firstName, String lastName, int sinNumber, int hoursWorked, double hourlyWage) {
		super(firstName, lastName, sinNumber);

		this.hoursWorked = hoursWorked;
		this.hourlyWage = hourlyWage;
	}

	public double calculatePay() {

		if (hoursWorked <= standardHours) {
			calculatedPay = hoursWorked * hourlyWage;
			return calculatedPay;
		} else if (hoursWorked > standardHours) {
			double overTimePay = (hoursWorked - standardHours) * (1.5 * hourlyWage);
			calculatedPay = (standardHours * hourlyWage) + overTimePay;
			return calculatedPay;
		} else {
			return calculatedPay;
		}
	}

}
