package assignment2Java;

public class IssueLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		String currentLevel = "G1";

		if (age >= 16 && currentLevel.equalsIgnoreCase("G1")) {
			System.out.println("Eligible to be issued G1 license");
		} else if (age > 16 && currentLevel.equalsIgnoreCase("G2")) {
			System.out.println("Eligible to be issued G2 license");
		} else if (age >= 18 && currentLevel.equalsIgnoreCase("G")) {
			System.out.println("Eligible to be issued G license");
		} else {
			System.out.println("Invalid input");
		}

	}

}
