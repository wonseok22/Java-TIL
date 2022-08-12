package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_4012_요리사_한원석_243ms {
	static int TC;
	static int N;
	static int[][] ingredents;
	static int selected;
	static int answer;
	static int tmp;
	static int Maximum;
	static int currCnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		TC = Integer.parseInt(br.readLine());
		
		// 입력받기, 어짜피 [i,j] + [j, i] 할 것이므로 [i,j]에 미리 더해놓음
		for (int testCase = 1; testCase <= TC; testCase++) {
			selected = 0;
			currCnt = 0;
			N = Integer.parseInt(br.readLine());
			answer =Integer.MAX_VALUE;
			ingredents = new int[N][N];
			Maximum = combination(N, N/2);
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					tmp = Integer.parseInt(st.nextToken());
					if (j > i) ingredents[j][i] += tmp;
					else ingredents[i][j] += tmp;
				}
			}
			
			solution(0, 0);
			sb.append("#"+testCase+" ").append(answer + "\n");
		}
		System.out.println(sb.toString());
	}
	public static void solution(int cnt, int start) {
		// N/2개를 골랐을 경우 
		if (currCnt >= Maximum) return;
		if (cnt == N/2) {
			currCnt++;
			tmp = 0;
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					
					// 둘다 상대방 요리에 들어가는 재료일 경우 
					if((selected & 1<<i) == 0&& (selected & 1<<j) == 0) {
						tmp += ingredents[j][i];
						
					}
					// 둘다 내 요리에 들어가는 재료일 경우
					else if ((selected & 1<<i) != 0 && (selected & 1<<j) != 0){
						tmp -= ingredents[j][i];
					}
				}
				
				
			}
			// 정답 최솟값으로 갱신
			answer = Math.min(answer,Math.abs(tmp));
			return;
		}
		
		// 조합 탐색
		for (int i = start; i < N; i++) {
			selected |= (1<<i);
			solution(cnt+1, i  + 1);
			selected &=~(1<<i);
		}
	}
	public static int combination(int n, int r) {
		if(n == r || r == 0) 
			return 1; 
		else 
			return combination(n - 1, r - 1) + combination(n - 1, r); 
	}
}







