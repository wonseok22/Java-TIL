package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_SWEA_1208_Flatten_한원석 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int testCase = 1; testCase <= 10;testCase++) {
			int dump = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int MIN = 100;
			int MAX = 0;
			int[] box = new int[101];
			Arrays.fill(box, 0);
			for (int i = 0; i < 100; i++) {
				int height = Integer.parseInt(st.nextToken());
				box[height] ++;
				MIN = Math.min(MIN, height);
				MAX = Math.max(MAX, height);
			}

			while (MAX > MIN) {
				if (box[MAX] >= box[MIN]) {
					if (dump >= box[MIN]) {
						dump -= box[MIN];
						box[MIN+1] += box[MIN];
						box[MAX] -= box[MIN];
						box[MAX-1] += box[MIN]; 
						MIN++;
					} else {
						break;
					}
				} else {
					if (dump >= box[MAX]) {
						dump -= box[MAX];
						box[MAX-1] += box[MAX];
						box[MIN] -= box[MAX];
						box[MIN+1] += box[MAX];
						MAX--;
					} else {
						break;
					}
				}
			}
			sb.append("#").append(testCase).append(" ").append(MAX-MIN).append("\n");
		}
		System.out.println(sb.toString());
	}
}
