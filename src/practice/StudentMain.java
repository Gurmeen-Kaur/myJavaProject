package practice;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student gurmeen = new Student("gurmeen", 72.0, 85.5, 92.0, 79.0, 88.0);
		System.out.println(gurmeen.calculatePercentage());

		Student parneet = new Student("parneet", 98.0, 82.0, 70.5, 87.5, 90.0);
		System.out.println(parneet.calculatePercentage());

	}

}
