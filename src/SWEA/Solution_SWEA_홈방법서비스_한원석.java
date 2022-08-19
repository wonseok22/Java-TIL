package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_SWEA_홈방법서비스_한원석 {
	static int TC, N, M, sum, answer, hCount;
	static int[] price;
	static ArrayList<int[]> house;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		TC = Integer.parseInt(br.readLine());
		price = new int[22];
		for (int i = 0; i < 22; i++) {
			price[i] = i * i + (i-1) * (i-1);
		}
		for (int testCase = 1; testCase <= TC; testCase++) {
			sb.append("#").append(testCase).append(" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			answer = 0;
			house = new ArrayList<int[]>();
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					if (st.nextToken().equals("1"))house.add(new int[] {i,j}); 
				}
			}
			for (int k = 1; k < 22; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						sum = 0;
						hCount = 0;
						for (int[] h : house) {
							if(distance(h, i, j) < k) {
								hCount ++;
								sum += M;
							}
						}
						if (hCount > answer && sum- price[k] >= 0) {
							answer = hCount;
						}
					}
				}				
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}

	private static int distance(int[] h, int i, int j) {
		return Math.abs(h[0] - i) + Math.abs(h[1] - j);
	}
}
