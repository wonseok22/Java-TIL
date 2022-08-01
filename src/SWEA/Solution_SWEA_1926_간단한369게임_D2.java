package algorithm;

import java.util.Scanner;

public class Solution_SWEA_1926_간단한369게임_D2 {
	private static int count369(String s) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			if (n == 3 || n == 6 || n == 9) {
				cnt ++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int count = count369(Integer.toString(i)); 
			if (count == 0) {
				System.out.print( i + " ");
				continue;
			}
			for (int j = 0; j < count; j++) {
				System.out.print("-");
			}
			System.out.print(" ");
			
		}
	}
}