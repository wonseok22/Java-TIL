package practice6_2;

import java.util.Arrays;

public class MovieManager {
	final int MAX_SIZE = 100;
	Movie[] movieList = new Movie[MAX_SIZE];
	private static MovieManager movieManager = new MovieManager();
	int size = 0;
	
	private MovieManager() {
		
	}
	public static MovieManager getInstance() {
		return movieManager;
	}
	
	
	void add(Movie movie) {
		if (size < MAX_SIZE)movieList[size++] = movie;
		
	}
	
	// 등록된 모든 영화목록 반환
	Movie[] getList() {
		return Arrays.copyOf(movieList, size);
		
		
	}
	
	// 등록된 일반영화목록 반환
	Movie[] getMovies() {
		int count = 0;
		Movie[] result = new Movie[size];
		for (int i = 0; i < size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)){
				result[count++] = movieList[i];
			}
		}
		return Arrays.copyOf(result, count);
		
	}

	// 등록된 시리즈 영화목록 반환
	SeriesMovie[] getSeriesMovies(){
		int count = 0;
		SeriesMovie[] result = new SeriesMovie[size];
		for (int i = 0; i < size; i++) {
			if (movieList[i] instanceof SeriesMovie){
				result[count++] = (SeriesMovie) movieList[i];
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	// 제목으로 영화 검색 (포함)
	Movie[] searchByTitle(String title){
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				count ++;
			}
		}
		Movie[] result = new Movie[count--];
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				result[count--] = movieList[i];
			}
		}
		return result;
	}
	
	// 상영시간 평균 출력
	double getRunningTimeAvg() {
		return 0.0d;
	}
}
