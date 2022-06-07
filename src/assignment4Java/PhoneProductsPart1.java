package assignment4Java;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneProductsPart1 {

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

		samsung[0] = "Samsung S20";
		samsung[1] = "Samsung S20";
		samsung[2] = "Samsung S20";
		samsung[3] = "Samsung S20";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the product");
		String phoneBrandEnteredByUser = scanner.next();

		switch (phoneBrandEnteredByUser) {
		case "apple": {
			System.out.println("List of apple products are " + Arrays.toString(apple));
			break;
		}
		case "samsung": {
			System.out.println("List of samsung products are " + Arrays.toString(samsung));
			break;
		}
		case "google": {
			System.out.println("List of google products are " + Arrays.toString(google));
			break;
		}
		default: {
			System.out.println("Please select a product from the list");
		}
		}
		scanner.close();
	}

}
