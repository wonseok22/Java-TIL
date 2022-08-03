package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main_BOJ_2477_참외밭_S3_한원석 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int km = Integer.parseInt(br.readLine());
		int d;
		int l;
		int maxCol = 0;
		int maxColIndex = 0;
		int maxRow = 0;
		int maxRowIndex = 0;
		int[][] field = new int[6][2];
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			field[i][0] = d;
			field[i][1] = l;
			
			if (d < 3) {
				if (l > maxRow) {
					maxRow = l;
					maxRowIndex = i;
				}
			} else if( d < 5 ) {
				if (l > maxCol) {
					maxCol = l;
					maxColIndex = i;
				}
			}
		}
		int leftCol = maxColIndex-1 < 0 ? 5 : maxColIndex-1;
		int leftRow = maxRowIndex-1 < 0 ? 5 : maxRowIndex-1;
		System.out.println(((maxCol * maxRow) - 
				Math.abs(field[leftCol][1] -field[(maxColIndex+1)%6][1]) * Math.abs(field[leftRow][1] -field[(maxRowIndex+1)%6][1] )) * km);
	}
}
