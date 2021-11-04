package constructors;
import java.util.Scanner;
public class Mainclass2 {
	
	public static void main(String[] args) {
	
	BankAccount b1 = new BankAccount("Gurmeen", 1234, 456789);
 System.out.println(b1.showbalance());
  b1.bankbalance = 25000;
  System.out.println(b1.showbalance());
  b1.depositmoney(2600);
  System.out.println(b1.bankbalance);
  //withdraw money
  
  double moneywithdrawn =b1.withdrawmoney(200);
  System.out.println("amount withdrawn "+moneywithdrawn);
  
  Scanner scan = new Scanner(System.in);
  System.out.println("In which account do you want to deposit? ");
  System.out.println("Enter 1 for chequing and 2 for savings");
  
  
}
}