package assignment6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Person customer1 = new Person("Hank", 123456, 45000.86, 1234);
		Atm atm = new Atm();

		int pinInput;
		String wantToContinue = "";

//		System.out.println("Enter the account.Select 1 for chequing and 2 for savings");
//		int accountSelected = scanner.nextInt();

		do {

			System.out.println("Please enter the transaction you wish to perform? " + '\n' + "Select 1 to see balance"
					+ '\n' + "Select 2 to deposit cash " + '\n' + "Select 3 to withdraw cash");
			int userInput = scanner.nextInt();

			switch (userInput) {
			case 1: {

				System.out.println("Please enter your pin");
				pinInput = scanner.nextInt();
				if (customer1.isPinCorrect(pinInput) == true) {
					System.out.println("Total balance : " + atm.displayBalance(customer1.totalFunds));
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				} else {
					System.out.println("Pin entered is incorrect.Please enter a correct pin");
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				}
			}
			case 2: {
				System.out.println("Please enter your pin");
				pinInput = scanner.nextInt();
				if (customer1.isPinCorrect(pinInput) == true) {
					System.out.println("Enter amount you wish to deposit");
					double cashToBeDeposited = scanner.nextDouble();
					atm.depositCash(cashToBeDeposited, customer1.totalFunds);
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				} else {
					System.out.println("Pin entered is incorrect.Please enter a correct pin");
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				}
			}
			case 3: {
				System.out.println("Please enter your pin");
				pinInput = scanner.nextInt();
				if (customer1.isPinCorrect(pinInput) == true) {
					System.out.println("Enter amount you wish to withdraw");
					double amountToBeWithdrawn = scanner.nextDouble();
					atm.withDrawCash(amountToBeWithdrawn, customer1.totalFunds);
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				} else {
					System.out.println("Pin entered is incorrect.Please enter a correct pin");
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				}
			}
			}
		} while (wantToContinue.equals("yes"));
	}
}
