package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_16935_배열돌리기3_한원석 {
	private static int[][] arr;
	private static int H;
	private static int W;
	private static int R;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		arr = new int[H][W];
		for(int i=0; i<H; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<W; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		String command = br.readLine();
		for(int menu=0, index = 0; menu<R; index += 2, menu++) {
			switch(command.charAt(index)) {
			case '1': //상하반전
				upDown();
				break;
			case '2': //좌우반전
				leftRight();
				break;
			case '3': //오른쪽 90도
				arr = right();
				break;
			case '4': //왼쪽 90도
				arr = left();
				break;
			case '5': //4그룹 분할 후 시계방향 한 번 회전
				arr = leftRotate();
				break;
			case '6': //4그룹 분할 후 반시계방향 회전
				arr = rightRotate();
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void upDown() {
		for(int i=0; i<H/2; i++) {
			for(int j=0; j<W; j++) {
				int t = arr[i][j];
				arr[i][j] = arr[H-1-i][j];
				arr[H-1-i][j] = t;
			}
		}
	}

	public static void leftRight() {
		for(int i=0; i<H; i++) {
			for(int j=0; j<W/2; j++) {
				int t = arr[i][j];
				arr[i][j] = arr[i][W-1-j];
				arr[i][W-1-j] = t;
			}
		}
	}
	
	public static int[][] right() {
		int[][] result = new int[W][H];
		
		for(int i=0; i<W; i++) {
			int[] tmp = new int[H];
			for(int j=0; j<H; j++) {
				tmp[j] = arr[H-1-j][i];
			}
			result[i] = tmp;
		}
		int t = H;
		H = W;
		W = t;
		return result;
	}
	
	public static int[][] left() {
		int[][] result = new int[W][H];
		
		for(int i=0; i<W; i++) {
			int[] tmp = new int[H];
			for(int j=0; j<H; j++) {
				tmp[j] = arr[j][W-1-i];
			}
			result[i] = tmp;
		}
		int t = H;
		H = W;
		W = t;
		return result;
	}
	
	public static int[][] leftRotate() {
		int halfW = W/2;
		int halfH = H/2;
		int[][] newArr = new int[H][W];
		for (int i = halfH; i < H; i++) {
			for (int j = 0; j < halfW; j++) {
				newArr[i-halfH][j]=arr[i][j];
			}
		}
		for (int i = 0; i < halfH; i++) {
			for (int j = 0; j < halfW; j++) {
				newArr[i][j+halfW]=arr[i][j];
			}
		}
		for (int i = 0; i < halfH; i++) {
			for (int j = halfW; j < W; j++) {
				newArr[i+halfH][j]=arr[i][j];
			}
		}
		for (int i = halfH; i < H; i++) {
			for (int j = halfW; j <W; j++) {
				newArr[i][j-halfW]=arr[i][j];
			}
		}
		return newArr;									
	}
	
	
	public static int[][] rightRotate() {
		int halfW = W/2;
		int halfH = H/2;
		int[][] newArr = new int[H][W];
		for (int i = 0; i < halfH; i++) {
			for (int j = 0; j < halfW; j++) {
				newArr[i+halfH][j]=arr[i][j];
			}
		}
		for (int i = halfH; i < H; i++) {
			for (int j = 0; j < halfW; j++) {
				newArr[i][j+halfW]=arr[i][j];
			}
		}

		for (int i = halfH; i < H; i++) {
			for (int j =halfW; j <W; j++) {
				newArr[i-halfH][j]=arr[i][j];
			}
		}

		for (int i = 0; i < halfH; i++) {
			for (int j = halfW; j < W; j++) {
				newArr[i][j-halfW]=arr[i][j];
			}
		}
		return newArr;
		
	}
}