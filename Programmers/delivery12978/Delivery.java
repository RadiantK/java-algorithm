package delivery12978;

import java.util.*;

class Solution {
	static final int INF = 500001;
	static int[][] graph;
	static int[] dist;
	static int cnt;
	
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        cnt = 0;
        // ������ N=5 �̸� 1~5�̹Ƿ� �迭�� ũ�⸦ �ϳ� Ű���� ����
        graph = new int[N+1][N+1];
        dist = new int[N];
        
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < N; j++) {
        		// �ڱ� �ڽ����� ���� �Ÿ��� ����� 0
        		if(i == j) continue;
        		// ������ ���Ѵ�� �ʱ�ȭ
        		graph[i][j] = INF;
        	}
        }
        
        // ������ ���� ����
        for(int i = 0; i < road.length; i++) {
        	// ������ 1���� �����ϴ°��� 0���� ��� ex) 1~5 �� 0~4�� ���
        	int x = road[i][0]-1;
        	int y = road[i][1]-1;
        	int cost = road[i][2];
        	
        	if(cost < graph[x][y]) {
	        	graph[x][y] = cost;
	        	graph[y][x] = cost;
        	}
        }
        
        dijkstra(0, N, K);
        answer = cnt;
        return answer;
    }
    static void dijkstra(int src, int N, int K) {
    	PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
    	boolean[] visited = new boolean[N+1];
    	
    	for(int i = 0; i < N; i++) dist[i] = INF;
    	// ó�� ��ġ�� �Ÿ� ��� 0
    	dist[src] = 0;
    	pq.offer(new int[] {0, src});
    	
    	while(!pq.isEmpty()) {
    		int[] curr = pq.poll();
    		// ���� �ִ� ����(����)
    		int u = curr[1];
    		// �̹� �湮������ ��ŵ
    		if(visited[u]) continue;
    		
    		visited[u] = true;
    		// v = ����� ��ȣ
    		for (int v = 0; v < N; v++){
    			// dist[u] + graph[u][v] ���� ���Ѵ밡�ƴ϶� ������ ���̸� ���ǹ� ����
    			if(dist[v] > dist[u] + graph[u][v]) {
    				dist[v] = dist[u] + graph[u][v];
    				// �̵��� ��ġ�� ��Ƽ� �ٽ� �ݺ�
    				pq.offer(new int[] {dist[v], v});	
    			}
    		}	
    	} 
    	System.out.println(Arrays.toString(dist));
    	for (int a : dist) {
			if( a <= K) cnt++;
		}
    }
}

class Solution3 {
    static int INF = 500000*50;
    static class Pair implements Comparable<Pair>{
        int idx;
        int dist;
        public Pair(int idx, int dist){
            this.idx = idx;
            this.dist = dist;
        }

        public int compareTo(Pair target){
            if(this.dist < target.dist)
                return -1;
            else if(this.dist > target.dist)
                return 1;
            else
                return 0;
        }
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        ArrayList<ArrayList<Pair>> arrlist = new ArrayList<>();
        for(int i=0; i<=N; i++)
            arrlist.add(new ArrayList<Pair>());

        for(int i=0; i<road.length; i++){
            int a = road[i][0];
            int b = road[i][1];
            int c = road[i][2];
            arrlist.get(a).add(new Pair(b,c));
            arrlist.get(b).add(new Pair(a,c));
        }

        int[] result = new int[N+1];
        Arrays.fill(result,INF);
        result[1] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(1,result[1]));

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            if(current.dist > result[current.idx])
                continue;
            for(Pair p : arrlist.get(current.idx)){
                if(result[p.idx] > result[current.idx] + p.dist){
                    result[p.idx] = result[current.idx] + p.dist;
                    pq.offer(new Pair(p.idx, result[p.idx]));
                }
            }
        }

        for(int i=1; i<=N; i++){
            if(result[i] <= K)
                answer++;
        }

        return answer;
    }
}

public class Delivery {

	public static void main(String[] args) {

		Solution s = new Solution();
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
