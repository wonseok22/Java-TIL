package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_SEWA_1289_원재의메모리복구하기_D3_한원석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int i = 0; i < TC; i++) {
			char t = '0';
			int answer = 0;
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != t) {
					answer ++;
					t = t =='0' ? '1' : '0';
				}
			}
			System.out.println("#" + (i+1) + " " + answer);
		}
		
	}
}
