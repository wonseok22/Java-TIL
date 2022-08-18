package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BOJ_1987_알파벳_G4_한원석_776ms {
	static int R, C;
	static int answer=1;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static boolean[] visited = new boolean[26];
	static char[][] board;
	static String input;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		board = new char[R+2][C+2];
		for (int i = 1; i <= R; i++) {
			input = br.readLine();
			for (int j = 0; j < C; j++) {
				board[i][j+1] = input.charAt(j);
			}
		}
		Arrays.fill(board[0], board[1][1]);
		Arrays.fill(board[R+1], board[1][1]);
		for (int i = 0; i < R+2; i++) {
			board[i][0] = board[1][1];
			board[i][C+1] = board[1][1];
		}
		visited[board[1][1]-'A'] = true;
		
		dfs(1,1,1);
		System.out.println(answer);
	}
	private static void dfs(int x, int y, int len) {
		int ax,ay;
		
		for (int i = 0; i < 4; i++) {
			ax = x + dx[i];
			ay = y + dy[i];
			if(!visited[board[ax][ay]-'A']) {
				visited[board[ax][ay]-'A'] = true;
				answer = Math.max(answer, len+1);
				dfs(ax,ay,len+1);
				visited[board[ax][ay]-'A'] = false;
			}
		}
		
	}
	
	
	
}
