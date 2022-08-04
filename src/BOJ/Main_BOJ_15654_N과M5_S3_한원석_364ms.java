package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BOJ_15654_N과M5_S3_한원석_364ms{
	static int N;
	static int M;
	static int[] nums;
	static int[] select;
	static boolean[] visited;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();
		String nm = br.readLine();
		N = nm.charAt(0) - '0';
		M = nm.charAt(2) - '0';
		select = new int[N];
		nums = new int[M];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			select[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(select);
		combination(0);
		System.out.println(sb.toString());
	}
	public static void combination(int cnt) {
		if (cnt == M) {
			for (int i : nums) {
				sb.append(i).append(" ");
			}
			sb.append(System.lineSeparator());
			return;
		}
		for (int i = 0; i < N; i++) {
			if(visited[i]) continue;
			nums[cnt] = select[i];
			visited[i] = true;
			combination(cnt+1);
			visited[i] = false;
			
		}
	}
	
}
