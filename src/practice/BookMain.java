package practice;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Paulo Coelho", "The Winner Stands Alone", 390);
		System.out.println(book1.getAuthor());
		System.out.println(book1.getname());
		System.out.println(book1.getPages());

		Book book2 = new Book("Dan Brown", "Angels and Demons", 460);
		System.out.println(book2.getAuthor());
		System.out.println(book2.getname());
		System.out.println(book2.getPages());

	}

}
