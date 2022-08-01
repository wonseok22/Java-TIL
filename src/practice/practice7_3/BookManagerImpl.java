package practice7_3;

import java.util.Arrays;


public class BookManagerImpl implements IBookManager{
	private final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size = 0;
	private static BookManagerImpl bookManager = new BookManagerImpl();
	private BookManagerImpl() {
		
	}
	
	public static BookManagerImpl getInstance() {
		return bookManager;
	}
	
	public void add(Book book) {
		if (size < MAX_SIZE) books[size++] = book;
		
	}
	
	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				System.arraycopy(books, i+1, books, i, size-i-1);
				books[size-1] = null;
				size--;
				break;
			}
		}
	}
	

	public Book[] getList() {
		return Arrays.copyOf(books, size);
	}
	
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				return books[i];				
			}
		}
		return null;
	}
	
	public Book[] searchByTitle(String title) {
		Book[] result;
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
				count++;
			}
		}
		result = new Book[count];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (books[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
				result[index++] = books[i];
			}
		}
		return result;
	}
	
	public Book[] getBook() {
		Book[] result = new Book[size];
		int index = 0 ;
		for (int i = 0; i < size; i++) {
			if (!(books[i] instanceof Magazine)){
				result[index++] = books[i];
			}
		}
		return Arrays.copyOf(result, index);		
	}
	
	public Magazine[] getMagazine() {
		Magazine[] result = new Magazine[size];
		int index = 0 ;
		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine){
				result[index++] = (Magazine) books[i];
			}
		}
		return Arrays.copyOf(result, index);
	}
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
				sum += books[i].getPrice();
		}
		return sum;
		
	}
	
	public double getPriceAvg() {
		return (double)getTotalPrice() / size;
	}
}
