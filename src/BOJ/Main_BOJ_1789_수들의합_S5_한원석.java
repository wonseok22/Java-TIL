package BOJ;

import java.util.Scanner;

public class Main_BOJ_1789_수들의합_S5_한원석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long sum = 0;
		if (N == 1 | N == 2 ) {
			System.out.println(1);
			return;
		}
		for (int i = 0; i < N; i++) {
			sum += i;
			if (sum > N) {
				System.out.println(i-1);
				break;
			} else if (sum==N) {
				System.out.println(i);
				break;
			}
		}
	}
}
