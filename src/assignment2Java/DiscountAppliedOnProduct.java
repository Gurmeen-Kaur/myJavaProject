package assignment2Java;

public class DiscountAppliedOnProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costOfProduct = 500;

		String couponApplied = "Promo5";

		if (couponApplied.equalsIgnoreCase("Promo5")) {
			double costAfterDiscount = costOfProduct - 0.05 * costOfProduct;
			System.out.println("Cost of product after applying discount is " + costAfterDiscount);
		} else if (couponApplied.equalsIgnoreCase("Promo10")) {
			double costAfterDiscount = costOfProduct - 0.10 * costOfProduct;
			System.out.println("Cost of product after applying discount is " + costAfterDiscount);
		} else if (couponApplied.equalsIgnoreCase("Promo20")) {
			double costAfterDiscount = costOfProduct - 0.20 * costOfProduct;
			System.out.println("Cost of product after applying discount is " + costAfterDiscount);
		} else {
			System.out.println("Invalid promo code");
		}

	}

}
