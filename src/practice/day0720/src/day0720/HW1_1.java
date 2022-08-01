package day0720;

import java.util.Scanner;

public class HW1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == 0) break;
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
			System.out.print("다음숫자 입력 : ");
		}
		System.out.println("프로그램 종료");
		
	}
}
