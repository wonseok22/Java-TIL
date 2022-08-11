package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_17406_배열돌리기4_G4_한원석_316ms {
	private static int[][] arr;
	private static int[][] rotate;
	private static int[][] newArr;
	private static int[] nums;
	private static int[] dx = {1,0,-1,0};
	private static int[] dy = {0,1,0,-1};
	private static boolean[] visited;
	private static int H;
	private static int W;
	private static int K;
	private static int answer = Integer.MAX_VALUE;
	private static int sum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[H][W];
		newArr = new int[H][W];
		rotate =  new int [K][3];
		visited = new boolean[K];
		nums = new int[K];
		
		for(int i=0; i<H; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<W; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				rotate[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		solution(0);
		System.out.println(answer);
				
		
		
		
		
	}
	private static void solution(int cnt) {
		if (cnt == K) {
			for (int i = 0; i < H; i++) {
				System.arraycopy(arr[i], 0, newArr[i], 0, W);
			}
			for (int i : nums) {
				rot(i);
			}
			for (int i = 0; i < H; i++) {
				sum = 0;
				for (int j = 0; j < W; j++) {
					sum += newArr[i][j];
				}
				answer = Math.min(sum, answer);
			}
		}
		for (int i = 0; i < K; i++) {
			if (!visited[i]) {
				nums[cnt] = i;
				visited[i] = true;
				solution(cnt+1);
				visited[i] = false;
			}
			
		}
		return;
	}
	
	private static void rot(int type) {
		int r = rotate[type][0]-1;
		int c = rotate[type][1]-1;
		int s = rotate[type][2];
		for (int i = 1; i <= s; i++) {
			int x = r-i;
			int y = c-i;
			int tmp = newArr[x][y];
			int dir = 0;
			while(true) {
				if(x+dx[dir] < r-i || x+dx[dir] > r + i || y+dy[dir] < c-i || y+dy[dir] > c+i) dir ++;
				if (dir == 4) break;
				newArr[x][y] = newArr[x+dx[dir]][y+dy[dir]];
				x += dx[dir];
				y += dy[dir];
			}
			newArr[r-i][c-i+1] = tmp;
		}
	}


}