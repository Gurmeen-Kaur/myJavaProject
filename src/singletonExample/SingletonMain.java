package singletonExample;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

		x.s = (x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);

		x.s = "I am new string";
		System.out.println(y.s);
		System.out.println(z.s);
	}

}
