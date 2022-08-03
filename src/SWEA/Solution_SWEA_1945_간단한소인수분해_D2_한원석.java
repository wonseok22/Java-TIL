package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_SWEA_1945_간단한소인수분해_D2_한원석 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC= Integer.parseInt(br.readLine().trim());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine().trim());
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			while(N % 2 == 0 && N != 1) {
				N /= 2;
				a++;
			}
			while(N % 3 == 0&& N != 1) {
				N /= 3;
				b++;
			}
			while(N % 5 == 0&& N != 1) {
				N /= 5;
				c++;
			}
			while(N % 7 == 0&& N != 1) {
				N /= 7;
				d++;
			}
			while(N % 11 == 0&& N != 1) {
				N /= 11;
				e++;
			}
			System.out.println("#" + testCase+ " " + a + " " + b + " " + c + " " + d + " " + e);
		}
	}
}
