package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Solution_SWEA_1873_상호의배틀필드_D3_한원석 {
	// 상 하 좌 우 -> 0, 1, 2, 3 (U, D, L, R)
	static char[] direction = {'^', 'v', '<', '>'};
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static char[][] board;
	static int TC;
	static int[] tank = new int[2];
	static int dir;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		TC = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= TC; testCase++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			// 바라보는 방향의 알파벳과 숫자를 매핑
			HashMap<Character,Integer> changeDir = new HashMap<>();
			changeDir.put('U',0);
			changeDir.put('D',1);
			changeDir.put('L',2);
			changeDir.put('R',3);
			
			//보드 입력받기
			board = new char[H+2][W+2];
			for (int i = 1; i <= H; i++) {
				String input = br.readLine();
				
				for (int j = 1, index= 0; j <= W; index++, j++) {
					board[i][j] = input.charAt(index);
					// 탱크의 초기 위치, 방향 탐색
					for (int j2 = 0; j2 < 4; j2++) {
						if(input.charAt(index) == direction[j2]) {
							tank[0] =i;
							tank[1] =j;
							dir = j2;
						}
					}
				}
			}
			
			// 테두리를 강철벽으로 두름
			Arrays.fill(board[H+1], '#');
			Arrays.fill(board[0], '#');
			for (int i = 0; i < H+2; i++) {
				board[i][0] = '#';
				board[i][W+1] = '#';
			}
			
			//주어진 명령어 실행
			int commandLine = Integer.parseInt(br.readLine());
			String command = br.readLine();
			for (int i = 0; i < commandLine; i++) {
				// 주어진 명령이 발사일경우
				if (command.charAt(i) == 'S') {
					int shellX = tank[0];
					int shellY = tank[1];
					while(true) {
						shellX += dx[dir];
						shellY += dy[dir];
						if(board[shellX][shellY] == '#' || board[shellX][shellY] == '*') break;
					}
					if (board[shellX][shellY] == '*') board[shellX][shellY] = '.';
					continue;
				}
				
				//아닐경우 매핑해놓은 방향으로 전환 후 전진 가능한지 판단한다.
				dir = changeDir.get(command.charAt(i));
				int ax = tank[0]+ dx[dir];
				int ay = tank[1]+ dy[dir];
				board[tank[0]][tank[1]] = '.';
				if (board[ax][ay] == '.') {
					tank[0] = ax;
					tank[1] = ay;
				}
				board[tank[0]][tank[1]] = direction[dir];
			}
			
			// 출력
			sb.append("#").append(testCase).append(" ");
			for (int i = 1; i < H+1; i++) {
				sb.append(Arrays.copyOfRange(board[i], 1, W+1));
				sb.append(System.lineSeparator());
			}	
		}
		System.out.println(sb);
	}
}
