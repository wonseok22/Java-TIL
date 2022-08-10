package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_BOJ_1158_요세푸스문제_S4_한원석 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			arr.add(i);
		}
		int delete = M-1;
		while(true) {
			result.add(arr.get(delete));
			arr.remove(delete);
			if(--N == 0) break;
			delete = (delete + (M - 1)) % arr.size();
		}
		sb.append("<");
		for(int i = 0; i < result.size()-1; i++) {
			sb.append(result.get(i)).append(", ");
		}
		sb.append(result.get(result.size()-1)).append(">");
		System.out.println(sb);
	};
}

// 1 2 3 4 5 6 7 
// 3 6 2 7 5 1 4
