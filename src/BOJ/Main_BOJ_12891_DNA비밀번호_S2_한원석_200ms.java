package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_BOJ_12891_DNA비밀번호_S2_한원석_200ms {
	static int S;
	static int P;
	static int answer;
	static String DNA;
	static HashMap<Character,int[]> hm = new HashMap<Character, int[]>();
	static char[] dna = {'A','C','G','T'};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		S = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		DNA = br.readLine();
		st = new StringTokenizer(br.readLine());
		for (char c : dna) {
			hm.put(c, new int[] {0, Integer.parseInt(st.nextToken())});
		}
		for (int i = 0; i < P; i++) {
			hm.get(DNA.charAt(i))[0]++;
		}
		if(isFull()) answer ++;		
		for (int i = 0; i < S-P; i++) {
			hm.get(DNA.charAt(i))[0] -= 1;
			hm.get(DNA.charAt(i + P))[0] += 1;
			if(isFull()) answer ++;
		}
		System.out.println(answer);
		
	}
	public static boolean isFull() {
		for (char c : dna) {
			if (hm.get(c)[0] < hm.get(c)[1]) return false;
		}
		return true;

	}
}
