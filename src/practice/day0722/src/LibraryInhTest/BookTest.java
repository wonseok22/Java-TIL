package LibraryInhTest;


public class BookTest {
	public static void main(String[] args) {
		BookManager bookManager = BookManager.getInstance();
		bookManager.add(new Book("21424", "Java Pro","김하나", "jaen.kr", "Java 기본 문법", 15000));
		bookManager.add(new Book("21425", "Java Pro2","김하나", "jaen.kr", "Java 기본", 19000));
		bookManager.add(new Book("35355", "분석설계","소나무", "jaen.kr", "SW 모델링", 30000));
		bookManager.add(new Magazine("35335", "월간 알고리즘","홍길동", "jaen.kr", "알고리즘 분류", 34505,2021,1));
		Book[] books = bookManager.getList();
		System.out.println("***************************도서 전체 목록***************************");
		for (Book book : bookManager.getList()) System.out.println(book);
		System.out.println("***************************일반 도서 목록***************************");
		for (Book book : bookManager.getBook()) System.out.println(book);
		System.out.println("***************************잡지 목록***************************");
		for (Book book : bookManager.getMagazine()) System.out.println(book);
		System.out.println("***************************도서 제목 포함검색 : Java ***************************");
		for (Book book : bookManager.searchByTitle("java")) System.out.println(book);
		
		System.out.println(bookManager.getTotalPrice());
		System.out.println(bookManager.getPriceAvg());
	}
}