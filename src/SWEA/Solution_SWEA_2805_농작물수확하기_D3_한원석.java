package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_SWEA_2805_농작물수확하기_D3_한원석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine());
			int offset = 0;
			int answer = 0;
			String input;
			for (int i = 0; i < N; i++) {
				input = br.readLine();
				offset = (i > N/2) ? offset-1 : offset +1;
				for (int j = N/2-offset+1; j < N/2+offset; j++) answer += input.charAt(j) -'0';
			}
			System.out.println("#" + testCase + " " + answer);
		}
		
	}
}
