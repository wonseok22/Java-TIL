package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_1859_백만장자프로젝트_D2{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC;
		TC = Integer.parseInt(br.readLine());
		for (int testCase = 0; testCase < TC; testCase++) {
			int N = Integer.parseInt(br.readLine());
			long answer = 0 ;
			int[] nums = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			int max = nums[N-1];
			for (int i = N-2; i > -1; i--) {
				
				if (nums[i]> max) {
					max = nums[i];
				} else {
					answer += max - nums[i];
				}
			}
			System.out.println("#" + (testCase+1) + " " + answer);
			
		}
	}
}
