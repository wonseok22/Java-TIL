package LibraryArrTest;

import java.util.Arrays;

import LibraryInhTest.Magazine;

public class BookManager {
	private final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size = 0;
	private static BookManager bookManager = new BookManager();
	private BookManager() {
		
	}
	
	public static BookManager getInstance() {
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
//		Book[] newBooks = new Book[size];
//		System.arraycopy(books, 0, newBooks, 0, size);
//		return newBooks;
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



}
