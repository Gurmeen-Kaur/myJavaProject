package assignment5Java;

public class Person {

	int height;
	double weight;

	// height <90 and >200 not allowed
	// weight<15 and more than 95 not allowed

	boolean check(int enteredHeight, double enteredWeight) {
		height = enteredHeight;
		weight = enteredWeight;
		if (height < 90 || height > 200 && weight < 15 || weight > 95) {
			System.out.println("Person cannot go on ride");
			return false;

		} else {
			System.out.println("person can go on ride");
			return true;
		}
	}
}
