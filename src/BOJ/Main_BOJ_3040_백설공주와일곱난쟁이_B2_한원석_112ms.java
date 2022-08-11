package BOJ;

import java.util.Scanner;

public class Main_BOJ_3040_백설공주와일곱난쟁이_B2_한원석_112ms{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (sum - (arr[i] + arr[j]) == 100) {
					for (int j2 = 0; j2 < arr.length; j2++) {
						if (j2 != i && j2 != j) System.out.println(arr[j2]);
						
					}
					return;
				}
			}
		}
		
	}
}
