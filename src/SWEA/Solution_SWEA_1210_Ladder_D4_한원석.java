package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Solution_SWEA_1210_Ladder_D4_한원석 {
	static int[] dx = {0,0,-1};
	static int[] dy = {-1,1,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int startX = 0;
		int startY = 0;
		for (int testCase = 1; testCase <= 10; testCase++) {
			int TC = Integer.parseInt(br.readLine());
			char[][] ladder = new char[100][102];
			for (int i = 0; i < 100; i++) {
				String l = br.readLine();
				for (int j = 1,index = 0; j < ladder.length+1; index += 2,j++) {
					ladder[i][j] = l.charAt(index);
					if (l.charAt(index)== '2') {
						startX = i;
						startY = j;
					}
				}
			}
			sb.append("#").append(TC).append(" ").append(search(ladder, startX, startY)).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static int search(char[][] ladder,int x, int y) {
		if (x==0) {
			return y-1;
		}
		for (int i = 0; i < 3; i++) {
			int ax = x + dx[i];
			int ay = y + dy[i];
			if (ladder[ax][ay] != '1') continue;
			ladder[ax][ay]= '0';
			return search(ladder, ax, ay);
		}
		return 0;
	}
}
