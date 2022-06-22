package practice;

public class CompoundInterest {

	double compoundInterest;

	double calculateCompoundInterest(double pAmount, double iRate, int noOfCompounds, int totalTime) {
		compoundInterest = pAmount * Math.pow(1 + (iRate / noOfCompounds), noOfCompounds * totalTime);
		return compoundInterest;
	}
}
