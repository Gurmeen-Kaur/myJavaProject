package BanquetHall;

public class Employee {

	public String name;
	public String email;
	private int employeeId;
	private double salary;
	private int sinNumber;
	String designation;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary(String designation, int employeeId) {
		if (designation.equals("HR") || designation.equals("Finance") || designation.equals("manager")
				|| employeeId == this.employeeId) {
			return salary;
		} else {
			return 0;
		}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(int sinNumber) {
		this.sinNumber = sinNumber;
	}

}
