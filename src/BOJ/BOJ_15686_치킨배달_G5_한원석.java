package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_15686_치킨배달_G5_한원석 {
	static int N;
	static int M;
	static int m;
	static int nums;
	static int sum;
	static int numsOfChicken;
	static int answer = Integer.MAX_VALUE;
	static ArrayList<int[]> chicken = new ArrayList<int[]>();
	static ArrayList<int[]> house = new ArrayList<int[]>();
	static String input;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			input = br.readLine();
			for (int j = 0, index = 0; j < N;index +=2, j++) {
				
				if (input.charAt(index) == '1') house.add(new int[] {i,j});
				if (input.charAt(index) == '2') {
					chicken.add(new int[] {i,j});
					numsOfChicken ++;
				}
			}
		}
		solution(0,0);
		System.out.println(answer);
		
	}
	
	public static void solution(int count, int start) {
		if (count == M) {
			sum = 0;
			for (int[] h : house) {
				m = Integer.MAX_VALUE;
				for (int i = 0; i < numsOfChicken; i++) {
					if ((nums & (1<<i)) != 0){
						m = Math.min(Math.abs(chicken.get(i)[0] - h[0])+ Math.abs((chicken.get(i)[1])-h[1]),m);
					}
				}
				sum += m;
			}
			answer = Math.min(sum, answer);
			return;
		}
		
		for (int i = start; i < numsOfChicken; i++) {
			nums |= (1<<i);
			solution(count +1, i+1);
			nums &= ~(1<<i);
		}
	}
}