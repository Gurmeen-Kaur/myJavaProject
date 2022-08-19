package enumExample;

import java.util.Arrays;

public class CompassEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compass direction1 = Compass.WEST;
		System.out.println(direction1);

		// gives an array consisting of all enum values
		System.out.println(Arrays.toString(Compass.values()));
		// gives an index of enum constant
		System.out.println(Compass.valueOf("WEST").ordinal());

		// compares two enum constants based on their ordinal values
		System.out.println(Compass.SOUTH.compareTo(direction1));

		// converts enum to String
		System.out.println(Compass.EAST.toString());
		// converts enum to String
		System.out.println(Compass.NORTH.name());
	}

}
