package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chequing chqAccount = new Chequing(1234, 10000);

		Savings svngAccount = new Savings(3456, 5000);

		TFSA tfsa = new TFSA(6666, 5000);
//		tfsa.depositMoney(5000);

		System.out.println("Balance in chequing : " + chqAccount.balance);

		System.out.println("Balance in Saving : " + svngAccount.balance);

		System.out.println("Balance in TFSA : " + tfsa.balance);

//		System.out.println(chqAccount.authorization(1234, "Chequing"));
//
//		System.out.println(svngAccount.authorization(3456, "Savings"));
//
//		System.out.println(tfsa.authorization(6666, "TFSA"));

		System.out.println("New balance in chequing :" + chqAccount.depositMoney(1000, 1234, "Chequing"));
	}

}
