package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_SWEA_1288_새로운불면증치료법_D2_한원석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine());
			int check = 0B1111111111;
			int answer = 0;
			while (check > 0) {
				String n = String.valueOf(N);
				answer ++;
				for (int i = 0; i < n.length(); i++) {
					
					check &= (1 << n.charAt(i) - '0');
					
				}
				System.out.println(check);
				N*=2;
			}
			System.out.println("#" + testCase + " " + answer);
		}
	}
}
