package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_BOJ_11286_절댓값힙_S1_한원석_408ms {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->{
			int tmp = Math.abs(a)- Math.abs(b);
			return tmp == 0? a-b : tmp;
		} );
		int N = Integer.parseInt(br.readLine());
		int input;
		while(N-->0) {
			input = Integer.parseInt(br.readLine());
			if (input==0) sb.append((pq.isEmpty()?0:pq.poll())).append("\n");
			else pq.add(input);
		}
		System.out.println(sb.toString());
	}
}
