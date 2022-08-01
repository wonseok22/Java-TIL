package LibraryInhTest;

public class Magazine extends Book {
	private int year;
	private int month;
	
	Magazine(){
		
	}
	Magazine (String isbn, String title, String author, String publisher, String desc, int price, int year, int month){
		super(isbn,title,author,publisher,desc,price);
		this.year = year;
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return super.toString() + " | " + year + " | " + month;
	}
	

	

}
