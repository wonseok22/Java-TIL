package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BOJ_3109_빵집_G2_한원석_304ms {
	static int R, C, answer, ax, ay;
	static char[][] pipe;
	static String input;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		pipe = new char[R+2][C+1];
		for (int i = 1; i <= R; i++) {
			input = br.readLine();
			for (int j = 0; j < C; j++) {
				pipe[i][j] = input.charAt(j);
			}
		}
		Arrays.fill(pipe[0], 'x');
		Arrays.fill(pipe[R+1], 'x');
		for (int i = 1; i < R; i++) {
			if(dfs(i,0))answer++;			
		}
		System.out.println(answer);
	}
	
	private static boolean dfs(int x, int y) {
		if (y == C) return true;
		
		for (int i = -1; i < 2; i++) {
			ax = x + i;
			ay = y + 1;
			if (pipe[ax][ay] != 'x') {
				pipe[ax][ay] = 'x';
				if (dfs(ax,ay)) return true;
			}
		}
		
		return false;
	}
}
