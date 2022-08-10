package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_2563_색종이_B1_한원석 {
	static int[][] board = new int[101][101];
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			for (int a = X; a < X+10  ;a++) {
				for (int b = Y; b < Y+10; b++) {
					if (board[a][b] == 0) {
						board[a][b] = 1;
						count ++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
