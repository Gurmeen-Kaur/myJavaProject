package constructors;

public class Person {

	String name;
	String dob;
	int sin;
	
	//constructors are used to initialize variables= assigning values to variables
	//this is default constructor
	//constructor name should have same as class name and doesn't have a return type
	public Person(){
	}
	//this is a parameterized constructor
	public Person(String n, String date, int sn) {
		
		name=n;
		dob=date;
		sin= sn;
		
}
}