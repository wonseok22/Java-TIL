package JUNGOL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_jungol_1828_냉장고_한원석 {
	static int[][] temp;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		temp = new int[N][2];
		int min,max;
		for (int i = 0; i < args.length; i++) {
			st = new StringTokenizer(br.readLine());
			min = Integer.parseInt(st.nextToken());
			max = Integer.parseInt(st.nextToken());
			temp[i][0] = min;
			temp[i][1] = max;
		}
		Arrays.sort(temp, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return 0;
			}

		});
	}
}
