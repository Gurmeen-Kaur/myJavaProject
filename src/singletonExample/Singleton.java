package singletonExample;

public class Singleton {

	private static Singleton singletonInstance = null;

	public String s;

	private Singleton() {
		s = "Hello I am String A of Singleton Class";
	}

	/* This is called lazy instantiation */
	public static Singleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

}
