package practice;

public class Book {

	String author;
	String title;
	int pageCount;

	public Book(String authorName, String bookTitle, int noOfPages) {
		author = authorName;
		title = bookTitle;
		pageCount = noOfPages;

	}

	String getAuthor() {
		return author;
	}

	String getname() {
		return title;
	}

	int getPages() {
		return pageCount;
	}

}
