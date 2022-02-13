package bfs;

import java.util.*;

public class Bfs {
	static int cnt;
	static int n, e; // n = 노드의 수, e 간선의 개수
	static final int MAX_N = 10;
	static int[][] graph = new int[MAX_N][MAX_N];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		e = sc.nextInt();
		
		for(int i = 0; i < e; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph[u][v] = 1;
			graph[v][u] = 1;
		}
		sc.close();
		
		bfs(0);
		System.out.println("{" + cnt + "}");
	}
	
	static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[MAX_N];
		
		visited[node] = true;
		q.add(node);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			cnt++;
			System.out.print(curr + " ");
			
			for(int i = 0; i < n; i++) {
				if(visited[i]) continue;
				if(graph[curr][i] == 0) continue;
					visited[i] = true;
					q.add(i);
				
			}
		}
	}
}