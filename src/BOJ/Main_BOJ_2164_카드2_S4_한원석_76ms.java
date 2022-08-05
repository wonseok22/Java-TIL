package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_BOJ_2164_카드2_S4_한원석_76ms {

	public static void main(String[] args) throws Exception {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Integer.parseInt(br.readLine())-1;
		for (int j = 1; j < 16; j++) {
			int N = j;
			
					// 1이 주어졌을 경우 답은 1
					if (N == 0) {
						System.out.println(1);
						return;
					}
			
			// 주어진 수가  2이상인 경우
			// 2^ 19 = 524,288이므로 최대 19번만 확인하면 됩
			
			int sum = 0;
			int count = 1;
			while (sum + count < N) {
				sum += count;
				count <<= 1;
			}
			
			System.out.println(N + " " + ((N - sum)<<1));
		}
	}
}
 

