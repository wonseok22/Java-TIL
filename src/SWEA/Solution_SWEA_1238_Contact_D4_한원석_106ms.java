package src;

import java.awt.GradientPaint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_SWEA_1238_Contact_D4_한원석_106ms {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static int len, start, answer, max;
	static Queue<Integer> q;
	static ArrayList<Integer>[] graph;
	static int[] visited;
	
	public static void main(String[] args) throws IOException {
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			
			st = new StringTokenizer(br.readLine());
			len = Integer.parseInt(st.nextToken()) / 2;
			start = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			visited = new int[101];
			graph = new ArrayList[101];
			answer = 0;
			max = 0;
			for (int i = 0; i < 101; i++) {
				graph[i] = new ArrayList<Integer>();
			}
			for (int i = 0; i < len; i++) {
				graph[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
			} 
			q = new LinkedList<Integer>();
			q.add(start);
			visited[start] = 1;
			while(!q.isEmpty()) {
				int x = q.poll();
				for (int i : graph[x]) {
					if (visited[i] == 0 ) {
						visited[i] = visited[x] + 1;
						q.add(i);
					}
				}
			}
			for (int i = 0; i < visited.length; i++) {
				if (visited[i] >= max) {
					max = visited[i];
					answer = answer < i ? i : answer;
				}
			}
			sb.append("#").append(testCase).append(" ").append(answer).append("\n");
			
		}
		
		System.out.print(sb.toString());
		
	}
	

}
