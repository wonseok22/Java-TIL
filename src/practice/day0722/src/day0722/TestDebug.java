package day0722;

import java.util.Scanner;

public class TestDebug {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] a = new int [5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
}

class Parent {
	int money = 1000000;

	public Parent() {
		
	}
	public Parent(int money) {
		this.money = money;
	}
	
}

class Child extends Parent{
	
}