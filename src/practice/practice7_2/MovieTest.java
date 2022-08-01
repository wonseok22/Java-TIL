package practice7_2;

public class MovieTest {
	public static void main(String[] args) {
		MovieManagerImpl movieManager = MovieManagerImpl.getInstance();
		movieManager.add(new Movie(3, "바람과함께사라지다", "홍길동", "액션", 100));
		movieManager.add(new Movie(2, "외계+인", "아무개", "판타지", 140));
		movieManager.add(new Movie(5, "탑건", "톰크루즈", "액션", 140));
		movieManager.add(new SeriesMovie(1, "탑건", "톰크루즈", "액션", 123, 1, "매버릭"));
		movieManager.add(new SeriesMovie(7, "반지의 제왕", "톰크루즈", "판타지", 155, 1, "모름"));
		System.out.println("모든 영화");
		for (Movie s : movieManager.getList())
		{
			System.out.println(s);
		}
		System.out.println("일반 영화");
		for (Movie s : movieManager.getMovies())
		{
			System.out.println(s);
		}
		System.out.println("시리즈 영화");
		for (Movie s : movieManager.getSeriesMovies())
		{
			System.out.println(s);
		}
		System.out.println("반지로 키워드 검색");
		for (Movie s : movieManager.searchByTitle("반지"))
		{
			System.out.println(s);
		}
		System.out.println("평균 상영시간");
		System.out.println(movieManager.getRunningTimeAvg());
		
	}
}
