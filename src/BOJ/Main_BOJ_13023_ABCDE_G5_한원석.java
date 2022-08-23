package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_BOJ_13023_ABCDE_G5_한원석 {
	static int N, M, a, b;
	static int[] visited;
	static boolean end = false;
	static Queue<Integer> q;
	static ArrayList<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new ArrayList[N];
		visited = new int[N];
		for (int i = 0; i < N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		for (int i = 0; i < N; i++) {
			visited[i] = 1;
			dfs(i, 0);
			visited[i] = 0;
			
		}
		if(!end) System.out.println(0);
		
	}
	private static void dfs(int start, int cnt) {
		if (end) return ;
		if (cnt == 4) {
			end = true;
			System.out.println(1);
			return ;
		}
		for (int i : graph[start]) {
			if(visited[i] == 0) {
				visited[i] = 1;
				dfs(i, cnt+1);
				visited[i] = 0;
			}
		}
	}
}
