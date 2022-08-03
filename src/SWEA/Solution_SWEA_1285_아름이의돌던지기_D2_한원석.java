package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1285_아름이의돌던지기_D2_한원석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine());
			int m = 100001;
			int cnt = 0;
			StringTokenizer st= new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int check = Math.abs(Integer.parseInt(st.nextToken()));
				if (m > check) {
					m =check;
					cnt = 1;
				} else if(m == check) {
					cnt ++;
				}
			}
			System.out.println("#" + testCase+" " + m +" "+ cnt);
					
		}
	}
}
