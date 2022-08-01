package practice8_3;

public interface IBookManager {
	void add(Book book);
	void remove(String isbn);
	Book[] getList();
	Book searchByIsbn(String isbn);
	Book[] searchByTitle(String title);
	Magazine[] getMagazine();
	Book[] getBook();
	int getTotalPrice();
	double getPriceAvg();
	
}
