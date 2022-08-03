package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Solution_SWEA_1288_새로운불면증치료법_D2_한원석 {
	static int[] c;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine());
			c = new int[10];
			int n = N;
			int answer = 1;
			while(!check()) {
				String S = Integer.toString(n);
				for (int i = 0; i < S.length(); i++) {	
					c[S.charAt(i)-'0'] = 1;
				}
				answer ++;
				n +=N;
			}
			System.out.println("#" + testCase + " " + (answer-1)*N);
		}
	}
	private static boolean check() {
		for (int i : c) {
			if (i==0) return false;
		}
		return true;
	}
}
