package constructors;

public class BankAccount {
String name;
int accountnumber;
int pin;
double bankbalance;
double chqaccbalance;
double savingaccbalance;


public BankAccount(String nm, int accnum, int sn) {
	name=nm;
	accountnumber=accnum;
	pin=sn;
}
//creating a method to show balance
public double showbalance(){
	return bankbalance;
}
//create method to deposit money
public void depositmoney(double bb) {
	 
bankbalance = bb;
}
public double withdrawmoney(double amount) {
	bankbalance = bankbalance- amount;
	return bankbalance;
}
}
