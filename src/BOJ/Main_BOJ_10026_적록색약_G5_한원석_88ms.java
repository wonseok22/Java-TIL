package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_10026_적록색약_G5_한원석_88ms {
	static int N;
	static int[] answer;
	static char c;
	static char[][][] board;
	static boolean[][][] visited;
	static String input;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		answer = new int[2];
		board = new char[N+2][N+2][2];
		visited = new boolean[N+2][N+2][2];
		for(int i = 1; i <= N; i++) {
			input = br.readLine();
			for(int j = 0; j < N; j++) {
				c = input.charAt(j);
				board[i][j+1][0] = c;
				if (c == 'G') c = 'R';
				board[i][j+1][1] = c;
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int k = 0; k < 2; k++) {
					if (!visited[i][j][k]) {
						dfs(i,j,k);
						answer[k]++;
					}
				}
			}
		}

		System.out.println(answer[0] + " " + answer[1]);
	}
	private static void dfs(int i, int j, int k) {
		visited[i][j][k] = true;
		for (int k2 = 0; k2 < 4; k2++) {
			int ax = i + dx[k2];
			int ay = j + dy[k2];
			if(board[i][j][k] != board[ax][ay][k] ||visited[ax][ay][k]) continue;
			dfs(ax,ay,k);
		}
	}
}
