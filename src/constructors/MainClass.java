package constructors;

public class MainClass {
public static void main(String[] args) {
	//creating reference variable for class using default constructor
	Person p1= new Person();
	//creating a reference variable for class using parameterized constructor
	Person p2 = new Person("Gurmeen", "4th Sept 1992", 123456);
	
	System.out.println("Person name :"+p1.name+" Date of birth :"+p1.dob+" sin mumber :"+p1.sin);
	System.out.println("Person name :"+p2.name+" Date of birth :"+p2.dob+" sin mumber :"+p2.sin);

	Car c = new Car("Honda");
	
	Employee e = new Employee(1111);
	
	
	
}
}