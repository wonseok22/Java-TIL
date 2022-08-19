package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class main {
	static int TC;
	static int N;
	static boolean[] visited;
	static int answer;
	static int sumOfWeights;
	static int[] weights;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			sb.append("#").append(testCase).append(" ");
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			answer = 0;
			weights = new int[N];
			visited = new boolean[N];
			for (int i = 0; i < N; i++) {
				weights[i] = Integer.parseInt(st.nextToken());
				sumOfWeights += weights[i];
			}
			solution(0,0,0);
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void solution(int leftsum, int rightsum, int cnt) {
		if(cnt==N) {
			if (leftsum >= rightsum) {
				answer ++;
			}
		}
		if(leftsum < rightsum) return;
		
		
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				solution(leftsum + weights[i], rightsum, cnt+1);
				solution(leftsum, rightsum + weights[i], cnt+1);
				visited[i] = false;
			}

		}
	}


}
