package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_SWEA_5644_무선충전_한원석_133ms{
	static int TC, M, A, sum, answer;
	static int[] moveA, moveB, currA, currB;
	static int[][] BC;
	static int[] dx = {0,-1,0,1,0};
	static int[] dy = {0,0,1,0,-1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		StringTokenizer st2;
		TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			sb.append("#").append(testCase).append(" ");
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			A = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			st2 = new StringTokenizer(br.readLine());
			moveA = new int[M];
			moveB = new int[M];
			currA = new int[2];
			currB = new int[2];
			currA[0] = currA[1] = 1;
			currB[0] = currB[1] = 10;
			BC = new int[A][4];
			answer = 0;
			for (int i = 0; i < M; i++) {
				moveA[i] = Integer.parseInt(st.nextToken());
				moveB[i] = Integer.parseInt(st2.nextToken());
			}
			for (int i = 0; i < A; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 4; j++) {
					BC[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			Arrays.sort(BC, new Comparator<int[]>(){
				@Override
				public int compare(int[] o1, int[] o2) {
					return o2[3] - o1[3];
				}
			});
			
			
			charge();
			for (int i = 0; i < M; i++) {
				/*
				 * 1. 한 칸 이동
				 * 2. 이동한 방향에서 충전할 수 있는 BC 찾음
				 * 3. 해당 BC로 충전
				 * */
				move(i);
				charge();
				System.out.println(answer);
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}
	private static void charge() {
		int cnt = 2;
		int distanceA;
		int distanceB;
		boolean usingA = false;
		boolean usingB = false;
		
		for (int i = 0; i < BC.length; i++) {
			distanceA = calc(i,'A');
			distanceB = calc(i,'B');
			if (distanceA <= BC[i][2] && distanceB <= BC[i][2]) {
				answer += BC[i][3];
				cnt--;
			} else if (distanceA <= BC[i][2]){
				if(!usingA) {
					usingA = true;
					answer += BC[i][3];
					cnt--;
				}
			} else if (distanceB <= BC[i][2]){
				if (!usingB) {
					usingB = true;
					answer += BC[i][3];
					cnt--;
				}
			}
			if (cnt == 0) {
				break;
			}
		}
	}
	
	private static int calc(int i, char type) {
		switch (type) {
		case 'A':
			return Math.abs((BC[i][0] - currA[0])) + Math.abs((BC[i][1] - currA[1]));
		case 'B':
			return Math.abs((BC[i][0] - currB[0])) + Math.abs((BC[i][1] - currB[1]));
		}
		return 0;
	}
	
	
	
	private static void move(int i) {
		currA[1] += dx[moveA[i]];
		currA[0] += dy[moveA[i]];
		currB[1] += dx[moveB[i]];
		currB[0] += dy[moveB[i]];
		return;
	}
	

}
