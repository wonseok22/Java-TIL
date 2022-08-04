package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_BOJ_15650_N과M2_S3_한원석_128ms {
	static int N;
	static int M;
	static int[] nums;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		String nm = br.readLine();
		N = nm.charAt(0) - '0';
		M = nm.charAt(2) - '0';
		nums = new int[M];
		combination(1, 0);
		System.out.println(sb.toString());
	}
	public static void combination(int start, int cnt) {
		if (cnt == M) {
			for (int i : nums) {
				sb.append(i).append(" ");
			}
			sb.append(System.lineSeparator());
			return;
		}
		for (int i = start; i <= N; i++) {
			nums[cnt] = i;
			combination(i+1, cnt+1);
		}
	}
	
}
