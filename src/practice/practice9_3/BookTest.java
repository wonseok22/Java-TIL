package practice9_3;

public class BookTest {
	public static void main(String[] args){	
		BookManagerImpl bookManager = BookManagerImpl.getInstance(); //  new BookManager();
		bookManager.add(new Book("21424", "Java Pro","김하나", "jaen.kr", "Java 기본 문법", 15000,10));
		bookManager.add(new Book("21425", "Java Pro2","김하나", "jaen.kr", "Java 기본", 19000,20));
		bookManager.add(new Book("35355", "분석설계","소나무", "jaen.kr", "SW 모델링", 30000,30));
		bookManager.add(new Magazine("35355", "분석설계","소나무", "jaen.kr", "SW 모델링",10000,40, 2021,1));
		Book[] books = bookManager.getList();
		System.out.println("***************************도서 전체 목록***************************");
		for (Book book : bookManager.getList()) System.out.println(book);
		System.out.println("***************************일반도서목록 ***************************");
		for (Book book : bookManager.getBook()) System.out.println(book);
		System.out.println("***************************잡지 목록 ***************************");
		for (Book book : bookManager.getMagazine()) System.out.println(book);
		System.out.println("***************************도서 제목 포함검색 ***************************");
		System.out.println("도서 가격 총합" + bookManager.getTotalPrice());
		System.out.println("도서 가격 평균" + bookManager.getPriceAvg());
		System.out.println("***************************도서판매 : 21424,11개 ***************************");
		try {
			bookManager.sell("21424", 11);
			System.out.println(bookManager.searchByIsbn("21424").toString());
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (QuantityException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("***************************도서구매 : 21424,10개 ***************************");
		try {
			bookManager.buy("21424", 10);
			System.out.println(bookManager.searchByIsbn("21424").toString());
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("존재하지 않는 책 번호입니다.");
		}
		System.out.println("***************************도서판매 : 21424,11개 ***************************");
		try {
			bookManager.sell("21424", 11);
			System.out.println(bookManager.searchByIsbn("21424").toString());
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("존재하지 않는 책 번호입니다.");
		} catch (QuantityException e) {
			System.out.println(e);
		}
		
	}
}
