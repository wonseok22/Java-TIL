package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_BOJ_2164_카드2_S4_한원석_76ms {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine())-1;
		
		// 1이 주어졌을 경우 답은 1
		if (N == 0) {
			System.out.println(1);
			return;
		}
		
		// 주어진 수가  2이상인 경우
		/*		
		 *  2의 제곱수들(등비수열) 의 등비합을 구한다.
		 *  2^ 19 = 524,288이므로  0 ~ 19 이분탐색 실시
		 *  2의 i승이 N보다 작고 2의 i+1승이 N보다 크거나 같다면 
		 *  2 * (N-( 2^i - 1)) 출력
		 * */
		
		int i = 0;
		while (!((Math.pow(2, i)-1) < N && (Math.pow(2, i+1)-1) >= N)) {
			i++;
		}

		System.out.println((int)(N - (Math.pow(2,i)-1))*2);
	}
}
 

