package day0719;

public class TestArray {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7 ,8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int j = arr.length-1; j >= 0; j--) {
			for (int i = arr.length-1; i >= 0 ; i--) {
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int[] row : arr) {
			for ( int num : row) {
				System.out.printf("%2d ", num );
			}
			System.out.println();
		}
		System.out.println();
		
		int [] dx = {-1,1,0,0};
		int [] dy = {0,0,-1,1};
		
		int[][] brr = new int[arr.length+2][arr[0].length+2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				brr[i+1][j+1] = arr[i][j];
				
				
			}
		}
		System.out.println(brr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					int ax = i + dx[j2];
					int ay = j + dy[j2];
					if (0 <= ax && ax < 4 && 0 <= ay && ay < 4) System.out.printf("%2d ", arr[ax][ay]);
				}
			}
			System.out.println();
		}
		
		
		
	} // end of main
}
