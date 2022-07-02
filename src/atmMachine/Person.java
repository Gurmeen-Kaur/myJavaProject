package atmMachine;

public class Person {
	private int accountNumber;
	private String name;
	private double chequingAccountFunds;
	private double savingsAccountFunds;
	private int pinNumber;

	public Person(String name, int accountNumber, double cheqFunds, double savingsFunds, int pinNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.chequingAccountFunds = cheqFunds;
		this.savingsAccountFunds = savingsFunds;
		this.pinNumber = pinNumber;
	}

	String nameDisplay() {
		return name;
	}

	boolean isPinCorrect(int pinInput) {
		if (pinNumber == pinInput) {
			return true;
		} else {
			return false;
		}
	}

	boolean isAccNumberCorrect(int accNoEnteredByUser) {
		if (accountNumber == accNoEnteredByUser) {
			return true;
		} else {
			return false;
		}
	}

	double accountSelected(int accountSelected) {
		if (accountSelected == 1) {
			return chequingAccountFunds;
		}

		else {
			return savingsAccountFunds;
		}
	}

}
