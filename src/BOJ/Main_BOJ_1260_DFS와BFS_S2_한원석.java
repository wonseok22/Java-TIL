package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_BOJ_1260_DFS와BFS_S2_한원석 {
	static Queue<Integer> q = new LinkedList<>();
	static int N, M, V, x, y;
	static StringBuilder sb;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		graph =  new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		for (int i = 0; i < N+1; i++) {
			Collections.sort(graph.get(i));
		}
		visited = new boolean[N+1];
		visited[V] = true;
		dfs(V);
		sb.append("\n");
		visited = new boolean[N+1];
		visited[V] = true;
		bfs(V);
		System.out.println(sb);
	}
	private static void bfs(int i) {
		int x;
		q.add(i);
		while(!q.isEmpty()) {
			x = q.poll();
			sb.append(x).append(" ");
			for (Integer ax : graph.get(x)) {
				if(!visited[ax]) {
					visited[ax] = true;
					q.add(ax);
				}
			}
		}
	}
	private static void dfs(int i) {
		sb.append(i).append(" ");
		for (int x : graph.get(i)) {
			if(!visited[x]) {
				visited[x] = true;
				dfs(x);
			}
		}
	}
}
