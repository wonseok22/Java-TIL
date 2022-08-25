package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.concurrent.PriorityBlockingQueue;

public class Solution_SWEA_3124_최소스패닝트리_D4_한원석 {
	static int TC, V, E, from, to, weight;
	static PriorityQueue<int[]> pq ;
	static int[] root;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			sb.append("#").append(testCase).append(" ");
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			root = new int[V+1];
			pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					
					return o1[0] >= o2[0] ? 1 : -1;
				}
			});
			
			for (int i = 1; i < V+1; i++) {
				root[i] = i;
			}
			
			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				from = Integer.parseInt(st.nextToken());
				to = Integer.parseInt(st.nextToken());
				weight = Integer.parseInt(st.nextToken());
				pq.add(new int[] {weight, from, to});
			}
			
			
			
			int cnt = 0;
			long answer = 0;
			
			while(!pq.isEmpty()) {
				int[] tmp = pq.poll();
				
				from = find(tmp[1]);
				to = find(tmp[2]);
				
				if (from == to) {
					continue;
				}
				
				union(from, to);
				answer += tmp[0];
				if (++cnt == V) break;

			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	
	private static void union(int a2, int b2) {
		
        // a와 b의 root를 찾는다.
		int aRoot = find(a2);
		int bRoot = find(b2);
		
		if(aRoot == bRoot) return ;
		
		if(aRoot > bRoot) root[aRoot] = bRoot;
		else  root[bRoot] = aRoot; // 두 집합의 root를 같게 만들어줌
	}

	private static int find(int a2) {
		//a2가 루트노드일 경우 a2 리턴
		if(root[a2] == a2) return a2;
	    
	    // 아닐경우 a2의 루트의 루트노드를 찾아서 반환
		return root[a2] = find(root[a2]);
	}
}
