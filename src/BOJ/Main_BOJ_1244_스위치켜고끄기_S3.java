package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_BOJ_1244_스위치켜고끄기_S3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] s = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		int StudentNum = Integer.parseInt(br.readLine());
		for (int i = 0; i < StudentNum; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken()); 
			if (gender == 1) { // 남자
				for (int index = num; index <= N; index += num) s[index-1] = s[index-1] == 1 ? 0 : 1; // num의 배수칸 토글
			} else { // 여자
				num -= 1; // 인덱스는 0부터 시작하므로 1을 빼줌
				s[num] = s[num] == 1 ? 0 : 1; // 현재 칸 토글
				for(int index = 1; index < Math.min(num+1, N-num); index ++) {
					if (s[num-index] != s[num+index])break; // 대칭이 아닌 경우 종료
					s[num-index] = s[num-index] == 1 ? 0 : 1;	 // 토글
					s[num+index] = s[num-index]; // 토글
				}
			}	
		}
		for (int j = 0; j < N; j++) {
			System.out.print(s[j] + " ");
			if ((j+1) % 20 == 0) System.out.println();
		}

		
	}
}
