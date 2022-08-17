package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_BOJ_1541_잃어버린괄호_S2_한원석_80ms {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] operator = input.split("[0-9]+");
		String[] nums = input.split("[+-]+");
		int answer = Integer.parseInt(nums[0]);
		for (int i = 0; i < operator.length-1; i++) {
			if (operator[i+1].equals("-")) {
				while (i < nums.length-1) {
					answer -= Integer.parseInt(nums[i+1]);
					i++;
				}
				break;
			}
			answer += Integer.parseInt(nums[i+1]);
		}
		
		System.out.println(answer);
		
	}
}
