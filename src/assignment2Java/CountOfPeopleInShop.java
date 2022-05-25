package assignment2Java;

public class CountOfPeopleInShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxPeopleAllowed = 50;
		int peopleInsideShop = 41;
		int numOfPeopleWaiting = 5;

		int vacancy = maxPeopleAllowed - peopleInsideShop;

		if (numOfPeopleWaiting <= vacancy) {
			peopleInsideShop = peopleInsideShop + numOfPeopleWaiting;
			System.out.println("Allow waiting people inside shop. New count is " + peopleInsideShop);

		} else {

			System.out.println("Maximum capacity Reached");
		}

	}

}
