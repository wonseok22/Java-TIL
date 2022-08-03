package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_SWEA_1940_가랏RC카_D2_한원석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine());
			int answer = 0;
			int currV = 0;
			for (int i = 0; i < N; i++) {
				String command = br.readLine();
				if (command.charAt(0) == '1') {
					currV += command.charAt(2)-'0';
				} else if (command.charAt(0) == '2'){
					currV = Math.max(currV - (command.charAt(2)-'0'), 0);
				}
				answer += currV;
			}
			System.out.println("#" + testCase + " " + answer);
		}
	}
}
