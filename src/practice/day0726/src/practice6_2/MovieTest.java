package practice6_2;

public class MovieTest {
	public static void main(String[] args) {
		MovieManager movieManager = MovieManager.getInstance();
		movieManager.add(new Movie(3, "바람과함께사라지다", "홍길동", "액션", 100));
		movieManager.add(new Movie(2, "외계+인", "아무개", "판타지", 140));
		movieManager.add(new Movie(5, "탑건", "톰크루즈", "액션", 140));
		movieManager.add(new SeriesMovie(1, "탑건", "톰크루즈", "액션", 123, 1, "매버릭"));
		movieManager.add(new SeriesMovie(7, "반지의 제왕", "톰크루즈", "판타지", 155, 1, "모름"));
		for (Movie s : movieManager.getList())
		{
			System.out.println(s);
		}
	
		System.out.println(movieManager.getMovies());
		System.out.println(movieManager.getSeriesMovies());
		System.out.println(movieManager.searchByTitle("반지"));
		System.out.println(movieManager.getRunningTimeAvg()
				);
		
	}
}
