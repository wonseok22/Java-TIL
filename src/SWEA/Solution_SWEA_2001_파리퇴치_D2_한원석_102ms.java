package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Solution_SWEA_2001_파리퇴치_D2_한원석_102ms {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int N;
		int M;
		int[][] fly;
		int m;
		for (int testCase = 1; testCase <= TC; testCase++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			m = 0;
			fly = new int[N+1][N+1];
			
			Arrays.fill(fly[0], 0);
			for (int i = 0; i < N; i++) {
				fly[i][0] = 0;
			}
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= N;  j++) {
					fly[i][j] = Integer.parseInt(st.nextToken()) + fly[i-1][j] + fly[i][j-1] - fly[i-1][j-1];
				}
			}

			
			for (int i = M; i < N+1; i++) {
				for (int j = M; j < N+1; j++) {
					m = Math.max(m, fly[i][j] - fly[i-M][j] - fly[i][j-M] + fly[i-M][j-M]);
				}
			}
			System.out.println("#" + testCase + " " + m);
		}
	}
}
