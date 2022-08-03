package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1946_간단한압축풀기_D2_한원석 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
	
		StringTokenizer st;
		for (int testCase = 1; testCase <= TC; testCase++) {
			StringBuilder sb = new StringBuilder();
			int N = Integer.parseInt(br.readLine());
			int cnt = 1;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String alphabet = st.nextToken();
				int repeat = Integer.parseInt(st.nextToken());
				for (int j = 0; j < repeat; j++) {
					sb.append(alphabet);
					if (cnt++ % 10 == 0) sb.append("\n");
				}
			}
			System.out.println("#" + testCase);
			System.out.println(sb.toString());
			
		}
	}
}
