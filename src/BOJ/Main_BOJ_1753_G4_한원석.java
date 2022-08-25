package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_BOJ_1753_G4_한원석 {
	static int V, E, K, from, to, weight; 
	static ArrayList<int[]>[] graph;
	static int[] distance ;
	static PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1[0], o2[0]);
		}
	});
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		graph = new ArrayList[V+1];
		distance = new int[V+1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		for (int i = 1; i < V+1; i++) {
			graph[i] = new ArrayList<int[]>();
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			weight = Integer.parseInt(st.nextToken());
			graph[from].add(new int[] {to, weight});
		}
		
		dijkstra();
		for (int i = 1; i < V+1; i++) {
			sb.append(distance[i] == Integer.MAX_VALUE ? "INF" : distance[i]).append("\n");
		}
		System.out.println(sb);
	}

	private static void dijkstra() {
		distance[K] = 0;
		pq.add(new int[] {0, K});
		while(!pq.isEmpty()) {
			int [] tmp = pq.poll();
			
			if (distance[tmp[1]] < tmp[0]) continue;
			
			for (int[] next : graph[tmp[1]]) {
				int totalCost = next[1] + tmp[0];
				if(totalCost < distance[next[0]]) {
					distance[next[0]] = totalCost;
					pq.offer(new int[] {totalCost,next[0]});
				}
			}
		}
		
	}
}
