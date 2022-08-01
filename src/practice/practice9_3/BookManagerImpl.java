package practice9_3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BookManagerImpl implements IBookManager{
	List<Book> books = new ArrayList<Book>();
	private int size = 0;
	private static BookManagerImpl bookManager = new BookManagerImpl();
	private BookManagerImpl() {
		
	}
	
	public static BookManagerImpl getInstance() {
		return bookManager;
	}
	
	public void add(Book book) {
		books.add(book);
		size ++;
		
	}
	
	public void remove(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books.get(i).getIsbn().equals(isbn)) {
				books.remove(i);
				size--;
				break;
			}
		}
	}
	

	public Book[] getList() {
		Book[] result = new Book[size];
		for (int i = 0; i < size; i++) {
			result[i] = books.get(i);
		}
		return result;
	}
	
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; i++) {
			if (books.get(i).getIsbn().equals(isbn)) {
				return books.get(i);				
			}
		}
		return null;
	}
	
	public Book[] searchByTitle(String title) {
		Book[] result;
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (books.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
				count++;
			}
		}
		result = new Book[count];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (books.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
				result[index++] = books.get(i);
			}
		}
		return result;
	}
	
	public Book[] getBook() {
		Book[] result = new Book[size];
		int index = 0 ;
		for (int i = 0; i < size; i++) {
			if (!(books.get(i) instanceof Magazine)){
				result[index++] = books.get(i);
			}
		}
		return Arrays.copyOf(result, index);		
	}
	
	public Magazine[] getMagazine() {
		Magazine[] result = new Magazine[size];
		int index = 0 ;
		for (int i = 0; i < size; i++) {
			if (books.get(i) instanceof Magazine){
				result[index++] = (Magazine) books.get(i);
			}
		}
		return Arrays.copyOf(result, index);
	}
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
				sum += books.get(i).getPrice();
		}
		return sum;
		
	}
	
	public double getPriceAvg() {
		return (double)getTotalPrice() / size;
	}

	@Override
	public void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException {
		Book target = searchByIsbn(isbn);
		if (target == null) throw new ISBNNotFoundException(isbn);
		if (quantity > target.getQuantity()) throw new QuantityException();
		else {
			target.setQuantity(target.getQuantity() - quantity);
		}
		
	}

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		Book target = searchByIsbn(isbn);
		if (target == null) throw new ISBNNotFoundException(isbn);
		else target.setQuantity(target.getQuantity() + quantity); 
		
	}
}
