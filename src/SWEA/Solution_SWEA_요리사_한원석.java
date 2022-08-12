package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_요리사_한원석 {
	static int TC;
	static int N;
	static int[][] ingredents;
	static boolean[] selected;
	static int answer;
	static int tmp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		TC = Integer.parseInt(br.readLine());
		
		
		for (int testCase = 1; testCase <= TC; testCase++) {
			N = Integer.parseInt(br.readLine());
			answer =Integer.MAX_VALUE;
			ingredents = new int[N][N];
			selected = new boolean[N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					tmp = Integer.parseInt(st.nextToken());
					if (j > i) ingredents[j][i] += tmp;
					else ingredents[i][j] += tmp;
				}
			}
			solution(0, 0);
			sb.append("#"+testCase+" ").append(answer + "\n");
		}
		System.out.println(sb.toString());
	}
	public static void solution(int cnt, int start) {
		if (cnt == N/2) {
			tmp = 0;
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					if(!selected[i]&& !selected[j]) {
						tmp += ingredents[j][i];
					} else if (selected[i] && selected[j]){
						tmp -= ingredents[j][i];
					}
				}
			}
			answer = Math.min(answer,Math.abs(tmp));
			return;
		}
		
		for (int i = start; i < N; i++) {
			selected[i] = true;
			solution(cnt+1, i  + 1);
			selected[i] = false;
		}
	}

}


