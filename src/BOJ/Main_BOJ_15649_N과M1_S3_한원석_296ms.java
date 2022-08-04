package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_BOJ_15649_N과M1_S3_한원석_296ms{
	static int N;
	static int M;
	static int[] nums;
	static boolean[] visited;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		String nm = br.readLine();
		N = nm.charAt(0) - '0';
		M = nm.charAt(2) - '0';
		nums = new int[M];
		visited = new boolean[N+1];
		permutation(0);
		System.out.println(sb.toString());
	}
	public static void permutation(int cnt) {
		if (cnt == M) {
			for (int i : nums) {
				sb.append(i).append(" ");
			}
			sb.append(System.lineSeparator());
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				nums[cnt] = i;
				visited[i] = true;
				permutation(cnt+1);
				visited[i] = false;
			}
			
		}
	}
	
}
