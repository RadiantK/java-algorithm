package dijkstra;

import java.util.*;

public class Dijkstra {

	static final int INF = 987654321;
	static final int MAX_N = 10;
	static int N, E;
	static int[][] graph = new int[MAX_N][MAX_N];
	static int[] Dist = new int[MAX_N];
	static int[] Prev = new int[MAX_N];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // ����� ����
		E = sc.nextInt(); // ������ ����
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j) {
					graph[i][j] = 0; // �ڱ� �ڽ��� �Ÿ��� 0
				}
				else {
					graph[i][j] = INF;// �������� �������� �ʱ�ȭ
				}
			}
		}
		for(int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int cost = sc.nextInt(); // u -> v�� ���� ���
			graph[u][v] = graph[v][u] = cost;
		}
		sc.close();
		
		dijkstra(0);
		int curr = 5;
		while(curr != -1) {
			System.out.print(curr + " ");
			curr = Prev[curr];
		}
		System.out.println();
		for(int i = 0; i < N; i++) {
			System.out.print(Dist[i] + " ");
		}
	}
	
	static void dijkstra(int src) {
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
		boolean[] visited = new boolean[MAX_N];
		for(int i = 0; i < N; i++) {
			Dist[i] = INF; // �Ÿ��� ���(��) ���Ѵ�� �ʱ�ȭ
			Prev[i] = -1; // ����� ��θ� �˰�������
		}
		Dist[src] = 0; // ���۰� 0���� �ʱ�ȭ
		pq.offer(new int[] {0, src}); // [���, ������ ��ȣ]
		
		while(!pq.isEmpty()) {
			int[] curr = pq.poll();
			int u = curr[1]; // ó�� src�� 0 ���� ����
			
			if(visited[u]) continue;
			visited[u] = true;
			
			for(int v = 0; v < N; v++) {
				if(Dist[v] > Dist[u] + graph[u][v]) {
					Prev[v] = u; // �ִܰŸ��� ��Ÿ���� ��λ��� ���� ���
					Dist[v] = Dist[u] + graph[u][v];
					pq.add(new int[] {Dist[v], v}); // �������� �̵��ϴ� ���
				}
			}
		}
	}
}