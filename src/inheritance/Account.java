package inheritance;

public class Account {

	String name;

	String address;

	String sinNumber;

	String phoneNumber;

	double balance;

	int pin;

	public double depositMoney(double amount, int pinNo, String accName) {
		if (authorization(pinNo, accName) == true) {
			balance = balance + amount;
			return balance;
		} else {
			System.out.println("Cannot deposit money");
			return balance;
		}
	}

	public boolean authorization(int pin, String account) {

		switch (account) {

		case "Chequing":
			if (pin == 1234) {
				return true;
			}
			break;

		case "Savings":
			if (pin == 3456) {
				return true;
			}
			break;

		case "TFSA":
			if (pin == 6666) {
				return true;
			}
			break;

		}

		return false;

	}

}
