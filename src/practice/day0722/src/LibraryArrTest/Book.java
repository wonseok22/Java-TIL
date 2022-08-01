package LibraryArrTest;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String desc;
	private int price;
	
	public Book( ) {
		
	}
	public Book(String isbn, String title, String author, String publisher, String desc, int price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.desc = desc;
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return isbn + "|" +  title + "|" + author + "|" +  publisher + "|" + price + "|" +  desc ;
	}	

	
	
}
