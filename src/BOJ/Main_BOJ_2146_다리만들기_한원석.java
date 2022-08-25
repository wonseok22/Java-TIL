package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_BOJ_2146_다리만들기_한원석 {
	static int N, ax, ay, answer = 10000;
	static char[][] board;
	static int[][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[] temp;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new char[N][N];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0, index = 0; j < N; j++, index+=2) {
				board[i][j] = input.charAt(index);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == '1') answer = Math.min(answer, bfs(i,j));
			}
		}
		System.out.println(answer);
	}
	private static int bfs(int x,int y) {
		visited = new int[N][N];
		q = new LinkedList<int[]>();
		q.add(new int[] {x, y});
		visited[x][y] = 1;
		while(!q.isEmpty()) {
			temp = q.poll();
			for (int i = 0; i < 4; i++) {
				ax = temp[0] + dx[i];
				ay = temp[1] + dy[i];
				if (0 <= ax && ax < N && 0 <= ay && ay < N && visited[ax][ay] == 0 && board[ax][ay] == '1') {
					visited[ax][ay] = 1;
					q.add(new int[] {ax, ay});
				}
			}
		}
		q.add(new int[] {x, y});
		while(!q.isEmpty()) {
			temp = q.poll();
			for (int i = 0; i < 4; i++) {
				ax = temp[0] + dx[i];
				ay = temp[1] + dy[i];
				if (0 <= ax && ax < N && 0 <= ay && ay < N && visited[ax][ay] == 0) {
					if(board[ax][ay] == '1') return visited[temp[0]][temp[1]]-1;
					visited[ax][ay] = visited[temp[0]][temp[1]] + 1;
					q.add(new int[] {ax, ay});
				}
			}
		}
		return 10000;
		
	}
}	
