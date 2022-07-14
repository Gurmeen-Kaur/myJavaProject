package gameProject;

public class UserInputCheck {

	public boolean checkCharacter(char charEntered, char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == charEntered) {
				return true;
			}
		}
		return false;
	}

	public static boolean contains(StringBuffer sb, String findString) {
		return sb.indexOf(findString) > -1;
	}

}
