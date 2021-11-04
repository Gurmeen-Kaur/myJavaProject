package BanquetHall;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter Base Cost");
		double baseCost = scan.nextDouble();

		System.out.println("Please enter Food Cost");
		double foodCost = scan.nextDouble();

		System.out.println(" Please enter beverage cost");
		double beverageCost = scan.nextDouble();

		System.out.println("Please enter tip amount");
		double tip = scan.nextDouble();

		// creating object of the class Banquet
		Banquet banquet = new Banquet();
		double totalBaseCost = banquet.calculateBaseCost(baseCost, foodCost, beverageCost, tip);

		// enter the number of guests visiting
		System.out.println("Please enter the number of guests");
		int noOfGuests = scan.nextInt();

		double tax = banquet.calculateTax(totalBaseCost);
		double cess = banquet.calculateCess(noOfGuests, totalBaseCost);

		// System.out.println("Value of cess is "+banq1.calculateCess(nOfGuests));
		double totalCost = banquet.calculateTheTotalCost(totalBaseCost, tax, cess);
		System.out.println("total cost is " + totalCost);

		scan.close();
	}

}
