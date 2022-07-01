package assignment6;

public class Person {

	int accountNumber;
	String name;
	double totalFunds;
//	String chequingAccount;
//	String savingsAccount;
	private int pinNumber;

	public Person(String name, int accountNumber, double totalFunds, int pinNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.totalFunds = totalFunds;
		this.pinNumber = pinNumber;
	}

	boolean isPinCorrect(int pinInput) {
		if (pinNumber == pinInput) {
			return true;
		} else {
			return false;
		}
	}

}
