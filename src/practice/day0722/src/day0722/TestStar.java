package day0722;

public class TestStar {
	public static void main(String[] args) {
		final int starSize = 5;
		for (int i = 0; i < starSize; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= starSize-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = starSize-1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= starSize-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		final int diaSize = 7;
		System.out.println();
		int b = (diaSize-1/2);
		int s = 1;
		for (int i = 0; i < diaSize; i++) {
			System.out.println();
		}
	}
}
