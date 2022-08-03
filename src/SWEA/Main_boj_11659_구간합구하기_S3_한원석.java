package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_boj_11659_구간합구하기_S3_한원석 {
	static int N;
	static int M;
	static int i;
	static int j;
	static int[] nums;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		nums = new int[N+1];
		nums[0] =  0;
		for (int i = 1; i <= N; i++) {
			nums[i] = nums[i-1] + Integer.parseInt(st.nextToken());
		}
		for (int x = 0; x < M; x++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			sb.append(nums[j]-nums[i-1]).append(System.lineSeparator());
		}
		System.out.println(sb);
	}
}

