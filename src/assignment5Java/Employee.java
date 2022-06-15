package assignment5Java;

public class Employee {
	String firstName = "Gurmeen";
	String lastName = "Kaur";
	double hourlyRate = 26;
	double salary;

	void printing() {
		System.out.println("Hourly Rate of employee" + firstName + " " + lastName + " is " + hourlyRate);
	}

	double weeklySalary(double numberOfHours) {
		salary = numberOfHours * hourlyRate;
		System.out.println("Salary of employee " + firstName + " " + lastName + " is " + salary);
		return salary;

	}
}
