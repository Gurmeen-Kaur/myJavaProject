package assignment7;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee employee = new Employee("", "", 0);

		PermanentEmployees pEmployee1 = new PermanentEmployees("Guneet", "Kaur", 6789);
		pEmployee1.setSalary(6000);

		PermanentEmployees pEmployee2 = new PermanentEmployees("Dennis", "Tonderau", 9876);
		pEmployee2.setSalary(4000);

		PermanentEmployees pEmployee3 = new PermanentEmployees("Avneet", "Kaur", 6543);
		pEmployee3.setSalary(8000);

		ContractualEmployees contractEmployee1 = new ContractualEmployees("Kiran", "Kaur", 334455, 45, 30);
		contractEmployee1.setSalary(contractEmployee1.calculatePay());

		ContractualEmployees contractEmployee2 = new ContractualEmployees("Harris", "Cavanaugh", 112233, 40, 30);
		contractEmployee2.setSalary(contractEmployee2.calculatePay());

		ContractualEmployees contractEmployee3 = new ContractualEmployees("Kyle", "Steven", 669933, 30, 20);
		contractEmployee3.setSalary(contractEmployee3.calculatePay());

		CommissionBasedEmployees comEmployee1 = new CommissionBasedEmployees("Erika", "Singh", 556677, 4000, 2000);
		comEmployee1.setSalary(comEmployee1.calculatePay());

		CommissionBasedEmployees comEmployee2 = new CommissionBasedEmployees("Dave", "Camp", 202020, 5000, 1000);
		comEmployee2.setSalary(comEmployee2.calculatePay());

		CommissionBasedEmployees comEmployee3 = new CommissionBasedEmployees("Steve", "Bell", 101010, 6000, 1500);
		comEmployee3.setSalary(comEmployee3.calculatePay());

		double[] salaryArray = { pEmployee1.getSalary(), pEmployee2.getSalary(), pEmployee3.getSalary(),
				contractEmployee1.getSalary(), contractEmployee2.getSalary(), contractEmployee3.getSalary(),
				comEmployee1.getSalary(), comEmployee2.getSalary(), comEmployee3.getSalary() };

		double max = salaryArray[0];
		for (int i = 0; i < salaryArray.length; i++) {
			if (salaryArray[i] > max) {
				max = salaryArray[i];
			}
		}
		System.out.println("Maximum salary is " + max);

		double min = salaryArray[0];
		for (int i = 0; i < salaryArray.length; i++) {
			if (salaryArray[i] < min) {
				min = salaryArray[i];

			}
		}
		System.out.println("Minimum salary is " + min);
	}
}
