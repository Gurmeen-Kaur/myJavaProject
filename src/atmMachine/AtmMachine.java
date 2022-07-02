package atmMachine;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		Person customer1 = new Person("Hank", 123456, 10000.86, 15000.50, 1234);
		Atm atm = new Atm();

		int pinInput;
		int accNoEnteredByUser;
		String wantToContinue = "";
		int accountSelection;

		do {

			System.out.println("Please enter the transaction you wish to perform? " + '\n' + "Select 1 to see balance"
					+ '\n' + "Select 2 to deposit cash " + '\n' + "Select 3 to withdraw cash");
			int userInput = scanner.nextInt();

			switch (userInput) {
			case 1: {
				System.out.println("Please enter the account number");
				accNoEnteredByUser = scanner.nextInt();
				System.out.println("Please enter your pin");
				pinInput = scanner.nextInt();
				if (customer1.isPinCorrect(pinInput) == true && customer1.isAccNumberCorrect(accNoEnteredByUser)) {
					System.out.println("Welcome to ABC Bank " + customer1.nameDisplay());
					System.out.println("Select 1 for chequing and 2 for saving");
					accountSelection = scanner.nextInt();
					if ((accountSelection == 1) || (accountSelection == 2)) {
						System.out.println(
								"Total balance : " + atm.displayBalance(customer1.accountSelected(accountSelection)));
					} else {
						System.out.println("invalid option.Select 1 for chequing and 2 for savings");
					}
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				} else {
					System.out.println("Information entered is incorrect.Please enter correct information");
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				}
			}
			case 2: {
				System.out.println("Please enter the account number");
				accNoEnteredByUser = scanner.nextInt();
				System.out.println("Please enter your pin");
				pinInput = scanner.nextInt();
				if (customer1.isPinCorrect(pinInput) == true && customer1.isAccNumberCorrect(accNoEnteredByUser)) {
					System.out.println("Welcome to ABC Bank " + customer1.nameDisplay());
					System.out.println("Select 1 for chequing and 2 for saving");
					accountSelection = scanner.nextInt();
					if (accountSelection == 1 || accountSelection == 2) {
						System.out.println("Enter amount you wish to deposit");
						double cashToBeDeposited = scanner.nextDouble();
						atm.depositCash(cashToBeDeposited, customer1.accountSelected(accountSelection));
					} else {
						System.out.println("invalid option.Select 1 for chequing and 2 for savings");
					}
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				} else {
					System.out.println("Information entered is incorrect.Please enter correct information");
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				}
			}
			case 3: {
				System.out.println("Please enter the account number");
				accNoEnteredByUser = scanner.nextInt();
				System.out.println("Please enter your pin");
				pinInput = scanner.nextInt();
				if (customer1.isPinCorrect(pinInput) == true && customer1.isAccNumberCorrect(accNoEnteredByUser)) {
					System.out.println("Welcome to ABC Bank " + customer1.nameDisplay());
					System.out.println("Select 1 for chequing and 2 for saving");
					accountSelection = scanner.nextInt();
					if (accountSelection == 1 || accountSelection == 2) {
						System.out.println("Enter amount you wish to withdraw");
						double amountToBeWithdrawn = scanner.nextDouble();
						atm.withDrawCash(amountToBeWithdrawn, customer1.accountSelected(accountSelection));
					} else {
						System.out.println("invalid option.Select 1 for chequing and 2 for savings");
					}
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				} else {
					System.out.println("Information entered is incorrect.Please enter correct information");
					System.out.println("Do you wish to perform another transaction? yes or no");
					wantToContinue = scanner.next();
					break;
				}
			}
			}
		} while (wantToContinue.equals("yes"));

	}

}
