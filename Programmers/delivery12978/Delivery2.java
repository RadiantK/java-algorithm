package delivery12978;

import java.util.*;

class Solution2 {
	static final int INF = 500001;
	static int[][] map;
	static int[] dist;

	static class Node implements Comparable<Node>{
		private int node; // ���
		private int dis; // �Ÿ��� ����(���)
		private Node(int n, int d){
			this.node = n;
			this.dis = d;
		}
		
		public int getNode() {
			return node;
		}

		public int getDist() {
			return dis;
		}

		@Override
		public int compareTo(Node other){
			// �Ÿ��� �� ª������ �켱���� �ϰ� ����
			return this.dis - other.dis;
		}
	}
	
    public int solution(int N, int[][] road, int K) {
    	int answer = 0;
        map = new int[N+1][N+1];
        dist = new int[N];   
        // �迭 �ʱ�ȭ �ڱ� �ڽ��� ������ ������ ���Ѵ�� �ʱ�ȭ
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < N; j++) {
        		if(i == j) continue;
        		
        		map[i][j] = INF;
        	}
        }
        
        for(int i = 0; i < road.length; i++) {
        	int x = road[i][0]-1;
        	int y = road[i][1]-1;
        	int cost = road[i][2];
        	
        	if(cost < map[x][y]) {
        		map[x][y] = cost;
        		map[y][x] = cost;
        	}
        }
       
        answer = dijkstra(0 ,N, K, answer);
        
        return answer;
    }
	private int dijkstra(int start , int N, int K, int answer) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		boolean[] visited = new boolean[N+1];
		for(int i = 0; i < N; i++) dist[i] = INF;
		// ó�� ���� ��ġ�� �Ÿ�
		dist[start] = 0;
		q.offer(new Node(start, 0));
		
		while(!q.isEmpty()) {
			Node curr = q.poll();
			// ���� ����� ��ġ(�ε���)
			int u = curr.getNode();
			if(visited[u]) continue;
			// �̹� ó������ �ִ� ���� ����
			visited[u] = true;
			// v = ����� ����
			for(int v = 0; v < N; v++) {

				if(dist[v] > dist[u] + map[u][v]) {
					dist[v] = dist[u] + map[u][v];
					q.offer(new Node(v, dist[v]));
				}
			}
		}
//		System.out.println(Arrays.toString(dist));
		for(int dis : dist) {
			if(dis <= K) answer++;
		}
		return answer;
	}
}

class Solution5 {
	static final int INF = 987654321;
	static List<List<Node>> graph;
	static int[] dist;
	
	static class Node implements Comparable<Node>{
		int idx, dist;
		public Node(int idx, int c) {
			this.idx = idx;
			this.dist = c;
		}
		
		@Override
		public int compareTo(Node n) {
			return this.dist - n.dist;
		}
	}
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        graph = new ArrayList<>();
        dist = new int[N];
        for(int i = 0; i <= N; i++) {
        	graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < road.length; i++) {
        	int x = road[i][0]-1;
        	int y = road[i][1]-1;
        	int dCost = road[i][2];
        	
        	graph.get(x).add(new Node(y, dCost));
        	graph.get(y).add(new Node(x, dCost));
        }
        
        answer = dijkstra(0, N, K, answer);
        return answer;
    }
    
    static int dijkstra(int start, int N, int K, int answer) {
    	PriorityQueue<Node> q = new PriorityQueue<>();
    	for(int i = 0; i < N; i++) dist[i] = INF;
    	
    	dist[start] = 0;
    	q.offer(new Node(start, 0));
    	
    	while(!q.isEmpty()) {
    		Node curr = q.poll();
    		int u = curr.idx;
    		// ���� ��尡 �̹� ó���� ���� �ִ� ����� ����
    		if(dist[u] < curr.dist) continue;
    		
    		for(Node n : graph.get(u)) {
    			if(dist[n.idx] > dist[u] + n.dist) {
    				dist[n.idx] = dist[u] + n.dist;
    				q.offer(new Node(n.idx, dist[n.idx]));
    			}
    		}
    	}
    	for(int d : dist) {
    		if(d <= K) answer++;
    	}
    	return answer;
    }
}

public class Delivery2 {

	public static void main(String[] args) {

		Solution5 s = new Solution5();
		int n = 5;
		int[][] road = {
				{1,2,1},
				{2,3,3},
				{5,2,2},
				{1,4,2},
				{5,3,1},
				{5,4,2}
		};
		int[][] road2 = {
				{1,2,1},
				{1,3,2},
				{2,3,2},
				{3,4,3},
				{3,5,2},
				{3,5,3},
				{5,6,1}
				};
		int [][] road3 = {
				{1, 2, 4},
				{1, 3, 1},
				{3, 4, 1},
				{4, 2, 1},
				{2, 5, 1}
		};
		int k = 3;
		System.out.println(s.solution(n, road, k));
		System.out.println(s.solution(6, road2, 4));
		System.out.println(s.solution(5, road3, 4));
	}

}