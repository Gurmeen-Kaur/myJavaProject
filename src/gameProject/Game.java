package gameProject;

import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\user1\\Desktop\\movies.txt");
		Scanner sc = new Scanner(file);

		String[] array = new String[25];

		while (sc.hasNextLine()) {
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextLine();
			}
			System.out.println(Arrays.toString(array));
		}

		Random random = new Random();
		int index = random.nextInt(array.length);
		String movieSelected = array[index];
		System.out.println(movieSelected);

		String blankSpaces = movieSelected.replaceAll("[a-z]", "_");
		System.out.println(blankSpaces);

		char[] charArray = movieSelected.toCharArray();
//		int length=charArray.length;
//		System.out.println("length of array is"+length);
		UserInputCheck method1 = new UserInputCheck();
		StringBuffer string = new StringBuffer(blankSpaces);
		int count = 0;
		int maxChances = 5;

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter an alphabet");
			char charEntered = scanner.next().charAt(0);
			// System.out.println(charEntered);

			if (method1.checkCharacter(charEntered, charArray) == true) {
				for (int j = 0; j < charArray.length; j++) {
					char chr = movieSelected.charAt(j);
					if (chr == charEntered) {
						System.out.println("character found at position " + j);
						string.setCharAt(j, charEntered);
					}
				}
				System.out.println(string);
			} else if (method1.checkCharacter(charEntered, charArray) == false && count < maxChances) {
				count++;
				System.out.println("Character user guessed is wrong");

			} else if (count == maxChances) {
				System.out.println("Number of attempts exceeds");
				break;
			}
		} while (UserInputCheck.contains(string, "_"));
	}
}