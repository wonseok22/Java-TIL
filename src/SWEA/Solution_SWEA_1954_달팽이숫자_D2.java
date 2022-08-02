package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution_SWEA_1954_달팽이숫자_D2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int testCase = 1; testCase <= TC; testCase++) {
			int N = Integer.parseInt(br.readLine().trim());
			int cnt = 1;
			int maximum = N * N;
			int x = 0;
			int y = 0;
			int dir = 1;
			int[] dx = {-1,0,1,0};
			int[] dy = {0,1,0,-1};
			int[][] board = new int[N][N];
			for (int i = 0; i < board.length; i++) {
				Arrays.fill(board[i],0);
			}
			while (cnt <= maximum) {
				board[x][y] = cnt++;
				int ax = x + dx[dir];
				int ay = y + dy[dir];
				if ( 0 > ax || N <= ax || 0 > ay || N <= ay || board[ax][ay] != 0) dir = (dir+1)%4;
				x += dx[dir];
				y += dy[dir];
			}
			System.out.println("#" + testCase);
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
