package pkgLibrary;

public class BookException extends Exception {
	
	private Catalog cat;
	private Book book;
	private String BookID;
	
	
	public BookException(Catalog cat, Book book) {
		super();
		this.cat = cat;
		this.book = book;
	}

	public BookException(Catalog cat, String bookID) {
		super();
		this.cat = cat;
		BookID = bookID;
	}


	public Catalog getCat() {
		return cat;
	}


	public Book getBook() {
		return book;
	}

	public String getBookID() {
		return BookID;
	}
}

