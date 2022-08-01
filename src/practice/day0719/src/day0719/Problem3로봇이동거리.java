package day0719;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3로봇이동거리 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC, N,type, answer;
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		char[][] board;
		StringTokenizer st = new StringTokenizer(br.readLine());
		TC= Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= TC; tc++) {
			answer = 0;
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			board = new char[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					board[i][j] = st.nextToken().charAt(0);
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					type = 0;
					if (board[i][j] == 'A')type = 1;
					if (board[i][j] == 'B')type = 2;
					if (board[i][j] == 'C')type = 4;
					for (int j2 = 0; j2 < type; j2++) {
						int ax = i;
						int ay = j;
						while(true) {
							ax += dx[j2];
							ay += dy[j2];
							if(ax < 0 || ax >= N || ay < 0 || ay >= N) break;
							if (board[ax][ay] == 'S')answer ++;
							else break;
						}
					}
					
				}
			}
			System.out.printf("#%d %d\n",tc,answer);
		}
		
		
	}
}
