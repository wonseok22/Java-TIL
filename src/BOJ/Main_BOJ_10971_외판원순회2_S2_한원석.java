package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_10971_외판원순회2_S2_한원석 {
	static int N, min = Integer.MAX_VALUE;
	static int[][] weight;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		weight = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				weight[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		visited[1] = true;
		dfs(1, 1, 0);
		System.out.println(min);

	}

	public static void dfs(int now, int cnt, int cost) {
		if (cnt == N && weight[now][1] != 0) {
			min = Math.min(min, cost+weight[now][1]);
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (weight[now][i] > 0) {
				 if (!visited[i]) {
		                visited[i] = true;
		                dfs( i,cnt +1 ,cost + weight[now][i]);
		                visited[i] = false;
		            }
			}
		}
	}

}
