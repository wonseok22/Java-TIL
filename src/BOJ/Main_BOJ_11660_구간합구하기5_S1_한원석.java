package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BOJ_11660_구간합구하기5_S1_한원석 {
	static int[][] nums;
	static int N;
	static int M;
	static int x1,x2,y1,y2;
	public static void main(String[] args) throws Exception{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		nums = new int[N+1][N+1];
		
		// 테두리
		Arrays.fill(nums[0], 0);
		for (int i = 0; i < N; i++) {
			nums[i][0] = 0;
		}
		
		// 누적합 게산
		for (int i = 1; i < N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < N+1; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken()) +nums[i-1][j] + nums[i][j-1] - nums[i-1][j-1];
			}
		}
		
		// 구간합 계산
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			sb.append(nums[x2][y2] - nums[x2][y1-1] - nums[x1-1][y2] + nums[x1-1][y1-1]).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
