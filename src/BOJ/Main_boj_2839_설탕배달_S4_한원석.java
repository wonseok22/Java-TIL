package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_boj_2839_설탕배달_S4_한원석 {
	static int N;
	static int answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		while (N % 5 != 0) {
			N -= 3;
			answer ++;
			if(N < 3) break;
		}
		if (N%5 == 0 ) System.out.println(answer + N/5);
		else System.out.println(-1);
	}
}

