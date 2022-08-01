package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 도서리스트를 컬렉션으로 유지하며 관리하는 클래스
 */
public class MovieManagerImpl implements IMovieManager {
	List<Movie> movieList = new ArrayList<Movie>();
	private static MovieManagerImpl movieManager = new MovieManagerImpl();
	int size = 0;
	private static File target = new File("./movie.dat");
	private static void loadData() throws IOException{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(target));
		){
			Object readed = ois.readObject();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void saveData(Movie m){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(target));
		){
			oos.writeObject(m);

		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private MovieManagerImpl() {
		
	}
	public static MovieManagerImpl getInstance() {
		return movieManager;
	}
	
	
	public void add(Movie movie) {
		
		movieList.add(movie);
		size ++;
	}
	
	// 등록된 모든 영화목록 반환
	public Movie[] getList() {
		Movie[] result = new Movie[size];
		for (int i = 0; i < size; i++) {
			result[i] = movieList.get(i);
		}
		return result;
		
		
	}
	
	// 등록된 일반영화목록 반환
	public Movie[] getMovies() {
		int count = 0;
		Movie[] result = new Movie[size];
		for (int i = 0; i < size; i++) {
			if (!(movieList.get(i) instanceof SeriesMovie)){
				result[count++] = movieList.get(i);
			}
		}
		return Arrays.copyOf(result, count);
		
	}

	// 등록된 시리즈 영화목록 반환
	public SeriesMovie[] getSeriesMovies(){
		int count = 0;
		SeriesMovie[] result = new SeriesMovie[size];
		for (int i = 0; i < size; i++) {
			if (movieList.get(i) instanceof SeriesMovie){
				result[count++] = (SeriesMovie) movieList.get(i);
			}
		}
		return Arrays.copyOf(result, count);
	}
	
	// 제목으로 영화 검색 (포함)
	public Movie[] searchByTitle(String title) throws TitleNotFoundException{
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (movieList.get(i).getTitle().contains(title)) {
				count ++;
			}
		}
		if (count == 0) throw new TitleNotFoundException(title);
		Movie[] result = new Movie[count--];
		for (int i = 0; i < size; i++) {
			if (movieList.get(i).getTitle().contains(title)) {
				result[count--] = movieList.get(i);
			}
		}
		return result;
	}
	
	// 상영시간 평균 출력
	public double getRunningTimeAvg() {
		int sum = 0;
		for(int i = 0; i < size; i ++){
			sum += movieList.get(i).getRunningTime();
		}
		
		return (double) sum / size;
	}
}

