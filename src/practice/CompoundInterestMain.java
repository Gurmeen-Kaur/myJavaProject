package practice;

import java.text.DecimalFormat;

public class CompoundInterestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundInterest cInterest1 = new CompoundInterest();
		double calculatedInterestCustomer1 = cInterest1.calculateCompoundInterest(5000, 0.05, 12, 10);

		DecimalFormat df1 = new DecimalFormat("#.00");
		System.out.println(df1.format(calculatedInterestCustomer1));

	}

}
