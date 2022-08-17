package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_BOJ_1992_쿼드트리_S1_한원석 {
	static int N;
	static String[] board;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new String[N];
		for (int i = 0; i < N; i++) {
			board[i] = br.readLine();
		}
		System.out.println(qt(0,0,N));
		System.out.println(sb.toString());
		
	}
	private static String qt(int x, int y, int len) {
		char check = board[x].charAt(y);
		for (int i = x; i < x+len; i++) {
			for (int j = y; j < y+len; j++) {
				if ( check != board[i].charAt(j)) {
					return "(" + qt(x,y,len/2) + qt(x, y+ len/2, len/2) + qt(x+len/2,y ,len/2) + qt(x+len/2, y+len/2 ,len/2) + ")";
					
				}
			}
		}
		return String.valueOf(check);
	}
}
