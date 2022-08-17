package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_1074_Z_S1_한원석_80ms {
	static int N;
	static int R;
	static int C;
	static int answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		z(0,0,1 << N);
	}
	
	public static void z(int x, int y, int len) {
		if (len == 1) {
			if (x == R && y == C) System.out.println(answer);
			answer ++;
			return;
		}
		
		if (R < x || R >= x + len || C < y || C >= y + len ) {
			answer += len * len;
			return;
		}
		z(x,y,len/2);
		z(x,y + len/2,len/2);
		z(x+ len/2,y,len/2);
		z(x+ len/2,y+ len/2,len/2);
	}
}
