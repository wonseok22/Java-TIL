package practice8_3;

public class Magazine extends Book{
	private int year;
	private int month;
	
	//생성자
	Magazine(){
		
	}

	Magazine(String isbn, String title, String author, String publisher, String desc, int price, int year, int month) {
		super(isbn, title, author, publisher, desc, price);
		this.year = year;
		this.month = month;
	}

	//getter & setter
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

	// toString
	@Override
	public String toString() {
		return super.toString() + year + "|" +  month;
	}
	
	
	
	
}
