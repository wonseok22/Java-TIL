package practice7_3;

public class BookTest {
	public static void main(String[] args){	
		BookManagerImpl bookManager = BookManagerImpl.getInstance(); //  new BookManager();
		bookManager.add(new Book("21424", "Java Pro","김하나", "jaen.kr", "Java 기본 문법", 15000));
		bookManager.add(new Book("21425", "Java Pro2","김하나", "jaen.kr", "Java 기본", 19000));
		bookManager.add(new Book("35355", "분석설계","소나무", "jaen.kr", "SW 모델링", 30000));
		Book[] books = bookManager.getList();
		System.out.println("***************************도서 전체 목록***************************");
		for (Book book : bookManager.getList()) System.out.println(book);
		System.out.println("***************************도서 조회 : 21424 ***************************");
		System.out.println(bookManager.searchByIsbn("21424"));
		System.out.println("***************************도서 삭제 : 21424 ***************************");
		bookManager.remove("21424");
		System.out.println("***************************도서 조회 : 21424 ***************************");
		for (Book book : bookManager.getList()) System.out.println(book);
		
	}
}
