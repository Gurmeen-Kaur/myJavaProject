package assignment4Java;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneProductsPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] apple = new String[4];
		String[] google = new String[4];
		String[] samsung = new String[4];

		apple[0] = "iPhone 12";
		apple[1] = "iPhone 12 mini";
		apple[2] = "iPhone 11 Pro";
		apple[3] = "iPhone 11";

		google[0] = "Google Pixel 6";
		google[1] = "Google Pixel 6 Pro";
		google[2] = "Google Pixel Pro";
		google[3] = "Google Pixel 5";

		samsung[0] = "S20";
		samsung[1] = "S21";
		samsung[2] = "Flip3";
		samsung[3] = "Fold3";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the phone brand");
		String phoneBrandEnteredByUser = scanner.nextLine();

		switch (phoneBrandEnteredByUser) {
		case "apple": {
			System.out.println("List of apple products are " + Arrays.toString(apple));
			System.out.println("Enter the name of a product");
			break;
		}
		case "samsung": {
			System.out.println("List of samsung products are " + Arrays.toString(samsung));
			System.out.println("Enter the name of a product");
			break;
		}
		case "google": {
			System.out.println("List of google products are " + Arrays.toString(google));
			System.out.println("Enter the name of a product");
			break;
		}
		default: {
			System.out.println("Please select a brand name from the list");
		}
		}

//		System.out.println("Enter the name of a product");
		String productEnteredByUser = scanner.nextLine();

		boolean isAMatch = false;

		if (phoneBrandEnteredByUser.equals("apple")) {
			for (int j = 0; j < apple.length; j++) {
				if (apple[j].equals(productEnteredByUser)) {
					isAMatch = true;
					System.out.println("Product Selected is " + productEnteredByUser);
					break;
				}
			}
		}

		else if (phoneBrandEnteredByUser.equals("samsung")) {
			for (int i = 0; i < samsung.length; i++) {
				if (samsung[i].equals(productEnteredByUser)) {
					isAMatch = true;
					System.out.println("Product selected is " + productEnteredByUser);
					break;
				}
			}
		}

		else if (phoneBrandEnteredByUser.equals("google")) {
			for (int k = 0; k < google.length; k++) {
				if (google[k].equals(productEnteredByUser)) {
					isAMatch = true;
					System.out.println("Product selected is " + productEnteredByUser);
					break;
				}
			}
		}
		if (isAMatch == false) {
			System.out.println("Please select a product from the selected brand list");
		}
		scanner.close();
	}

}