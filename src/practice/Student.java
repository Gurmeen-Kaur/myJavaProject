package practice;

public class Student {

	String name;
	double maths;
	double physics;
	double chemistry;
	double biology;
	double moralScience;
	double total;
	double grandTotal = 500;
	double percent;

	public Student(String studentName, double mathsMarks, double physicsMarks, double chemistryMarks,
			double biologyMarks, double moralScienceMarks) {
		name = studentName;
		maths = mathsMarks;
		physics = physicsMarks;
		chemistry = chemistryMarks;
		biology = biologyMarks;
		moralScience = moralScienceMarks;
	}

	double calculatePercentage() {
		System.out.println("Percentage of " + name);
		total = maths + physics + chemistry + biology + moralScience;
		percent = (total / grandTotal) * 100;
		return percent;
	}
}
