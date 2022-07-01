package assignment6;

public class Atm {

	private double balance;
	double dailyCashLimit = 500;

	Atm() {
	}

	double displayBalance(double funds) {
		balance = funds;
		return balance;
	}

	double withDrawCash(double amountToBeWithdrawn, double funds) {
		balance = funds;
		if (amountToBeWithdrawn < balance && dailyCashLimit(amountToBeWithdrawn) == true) {
			balance = balance - amountToBeWithdrawn;
			System.out.println("Amount withdrawn :" + amountToBeWithdrawn);
			System.out.println("New balance :" + balance);
			return balance;
		} else {
			System.out.println("Balance is :" + balance);
			return balance;
		}
	}

	double depositCash(double cashToBeDeposited, double funds) {
		balance = funds;
		balance = cashToBeDeposited + balance;
		System.out.println("Amount deposited :" + cashToBeDeposited);
		System.out.println("Total balance :" + balance);
		return balance;
	}

	boolean dailyCashLimit(double amount) {
		if (amount <= dailyCashLimit) {
			return true;
		} else {
			System.out.println("cannot withdraw cash. Amount entered exceeds daily cash limit");
			return false;
		}
	}
}
