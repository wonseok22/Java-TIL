package day0719;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Problem2 {
	public static void main(String[] args)throws Exception{
		int N, R, TC,D;
		char X,Y;
		int[][] d = {{-6,0},{-3,}}
		String input;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));    
		StringTokenizer st = new StringTokenizer(br.readLine());
		TC = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<String>(R);
		for (int i = 0; i < R; i++) {
			input = br.readLine();
			X = input.charAt(0);
			Y = input.charAt(2);
			D = input.charAt(4) - '0';	
		}
		System.out.println(hs.size());
		
	}
}
