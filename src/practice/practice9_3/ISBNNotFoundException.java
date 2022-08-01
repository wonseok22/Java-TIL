package practice9_3;

public class ISBNNotFoundException extends Exception {
	private String isbn;
	
	public ISBNNotFoundException(String isbn) {
		super(isbn + "인 책이 존재하지 않습니다.");
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
}
