package dijkstra;

import java.util.*;

public class Dijkstra2 {

	static final int INF = 987654321;
	static final int MAX_N = 10;
	static int N, E;
	static int[][] graph = new int[MAX_N][MAX_N];
	static int[] Dist = new int[MAX_N];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 노드의 개수
		E = sc.nextInt(); // 간선의 개수
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					graph[i][j] = 0; // 자기 자신의 거리는 0
				}
				else {
					graph[i][j] = INF;// 나머지는 무한으로 초기화
				}
			}
		}
		for(int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int cost = sc.nextInt(); // u -> v로 가는 비용
			graph[u][v] = graph[v][u] = cost;
		}
		sc.close();
		
		System.out.println(dijkstra(2, 4));
	}
	
	static int dijkstra(int src, int dist) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
		boolean[] visited = new boolean[MAX_N];
		for(int i = 0; i < N; i++) {
			Dist[i] = INF; // 거리의 비용(값) 무한대로 초기화
		}
		Dist[src] = 0; // 시작값 0으로 초기화
		pq.offer(new int[] {0, src}); // [비용, 정점의 번호]
		
		while(!pq.isEmpty()) {
			int[] curr = pq.poll();
			int u = curr[1]; // 처음 src값 0 부터 시작
			
			if(u == dist) return curr[0]; // dist 까지 가는데 드는 비용
			if(visited[u]) continue;
			visited[u] = true;
			
			for(int v = 0; v < N; v++) {
				if(Dist[v] > Dist[u] + graph[u][v]) {
					Dist[v] = Dist[u] + graph[u][v];
					pq.add(new int[] {Dist[v], v}); // 누적비용과 이동하는 노드
				}
			}
		}
		return -1;
	}

}
