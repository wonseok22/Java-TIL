package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_16926_배열돌리기1_S1_한원석_724ms {
	static int[][] board;
	static int N;
	static int M;
	static int R;
	static int edge;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		board = new int[N][M];
		for (int i = 0; i <N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		edge = Math.min(N, M) /2 ;
		for (int i = 0; i < R; i++) {
			rotate();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(board[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void rotate() {
		
		for (int i = 0; i < edge; i++) {
			int x = i;
			int y = i;
			int tmp = board[x][y];
			int dir = 0;
			while(true) {
				if(x+dx[dir]  < i || x+dx[dir] >= N-i || y+dy[dir] < i || y+ dy[dir] >= M-i ) dir++;
				if(dir == 4) break;
				board[x][y] = board[x+dx[dir]][y + dy[dir]];
				x += dx[dir];
				y += dy[dir];
			}
			board[i+1][i] = tmp;
		}
		
	}
}
