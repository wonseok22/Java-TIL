package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_BOJ_2023_신기한소수_G5_한원석_116ms {
	static int N;
	static StringBuilder sb = new StringBuilder();
	static Queue<Integer> q = new LinkedList<Integer>(); 
	
	// 반복문으로 해결
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int check;
		q.add(0);
		while(!q.isEmpty()) {
			check = q.poll();
			if ((int)Math.log10(check)+1 == N) {
				if (isPrime(check))sb.append(check).append("\n");
				continue;
			}
			for (int j = 1; j < 10; j++) {
				if (isPrime(check*10 + j)) {
					q.add(check*10 + j);
				}
			}	
		}
		System.out.println(sb.toString());
	}
	
	
//  백트래킹으로 해결
//	static int N;
//	static StringBuilder sb = new StringBuilder();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		Solution(0, 0);
//		System.out.println(sb.toString());
//	}
//
//	public static void Solution(int n, int cnt) {
//		if (cnt == N) {
//			if (isPrime(n)) sb.append(n).append("\n");
//			return;
//		}
//		if(!isPrime(n)) return;
//		for (int i = 1; i < 10; i++) {
//			Solution(n*10 + i, cnt+1);
//		}
//		
//	}
	
	public static boolean isPrime(int x) {
		if (x == 1) return false;
		for (int i = 2; i <= Math.pow(x,0.5); i++) {
			if (x % i == 0) return false;
		}
		return true;
	}
}
