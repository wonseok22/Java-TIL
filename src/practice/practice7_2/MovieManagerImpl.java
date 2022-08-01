package practice7_2;

import java.util.Arrays;


/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class MovieManagerImpl implements IMovieManager {
	final int MAX_SIZE = 100;
	Movie[] movieList = new Movie[MAX_SIZE];
	private static MovieManagerImpl movieManager = new MovieManagerImpl();
	int size = 0;
	
	private MovieManagerImpl() {
		
	}
	public static MovieManagerImpl getInstance() {
		return movieManager;
	}
	
	
	public void add(Movie movie) {
		if (size < MAX_SIZE)movieList[size++] = movie;
		
	}
	
	// 등록된 모든 영화목록 반환
	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
		
		
	}
	
	// 등록된 일반영화목록 반환
	public Movie[] getMovies() {
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
	public SeriesMovie[] getSeriesMovies(){
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
	public Movie[] searchByTitle(String title){
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
	public double getRunningTimeAvg() {
		int sum = 0;
		for(int i = 0; i < size; i ++){
			sum += movieList[i].getRunningTime();
		}
		
		return (double) sum / size;
	}
}
