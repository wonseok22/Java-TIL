package day0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_3289_서로소집합_D4_한원석_476ms {
	static int TC, N, M, a, b, type;
	static int[] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		TC = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= TC; testCase++) {
			sb.append("#").append(testCase).append(" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
            
			graph = new int[N+1];
            // 초기에 자기 자신의 parent는 자신이다.
			for (int i = 0; i < N+1; i++) {
				graph[i] = i;
			}
    
            // 입력을 받으며 두 node를 union한다.
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				type = Integer.parseInt(st.nextToken());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				if (type == 0) {
					union(a,b);				
				}				
				else {
					sb.append((find(a) == find(b))? 1 : 0);
				}
					
			}
			sb.append("\n");
            
		}
		System.out.println(sb.toString());
	}

	private static void union(int a2, int b2) {
	
        // a와 b의 root를 찾는다.
		int aRoot = find(a2);
		int bRoot = find(b2);
		
		if(aRoot == bRoot) return ;
		
		if(aRoot > bRoot) graph[aRoot] = bRoot;
		else  graph[bRoot] = aRoot; // 두 집합의 root를 같게 만들어줌
	}

	private static int find(int a2) {
		//a2가 루트노드일 경우 a2 리턴
		if(graph[a2] == a2) return a2;
	    
	    // 아닐경우 a2의 루트의 루트노드를 찾아서 반환
		return graph[a2] = find(graph[a2]);
	}
}
