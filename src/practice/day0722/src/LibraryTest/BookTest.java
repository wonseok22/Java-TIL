package LibraryTest;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("21424", "Java Pro","김하나", "jaen.kr", "Java 기본 문법", 15000);
		Book b2 = new Book("35355", "분석설계","소나무", "jaen.kr", "SW 모델링", 30000);
		
		System.out.println("***************************도서 전체 목록***************************");
		System.out.println(b1);
		System.out.println(b2.toString());
	}
}
