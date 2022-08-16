package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	static int N;
	static int selected;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		permutation(0);
	}
	private static void permutation(int cnt) {
		if (cnt == 10) {
			
		}
		for (int i = 0; i < 10; i++) {
			selected |= selected
			permutation(cnt+1);
		}
		
		
	}
}
