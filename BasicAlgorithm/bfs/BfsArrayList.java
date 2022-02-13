package bfs;

import java.util.*;

public class BfsArrayList {
	static List<List<Integer>> graph ;

	public static void main(String[] args) {

		graph = new ArrayList<>();
		// 그래프 초기화
		for(int i = 0; i < 10; i++) {
			graph.add(new ArrayList<>());
		}
		
		// 그래프에 노드 정보 저장
    	graph.get(0).add(1);
    	graph.get(0).add(2);
    	graph.get(0).add(3);
    	
    	graph.get(1).add(2);
    	graph.get(1).add(4);
    	
    	graph.get(2).add(0);
    	graph.get(2).add(1);
    	graph.get(2).add(5);
    	graph.get(2).add(6);
    	
    	graph.get(3).add(0);
    	graph.get(3).add(5);
    	
    	graph.get(4).add(1);
    	graph.get(4).add(6);
    	
    	graph.get(5).add(2);
    	graph.get(5).add(3);
    	graph.get(5).add(7);
    	graph.get(5).add(8);
    	
    	graph.get(6).add(2);
    	graph.get(6).add(4);
    	graph.get(6).add(7);
    	
    	graph.get(7).add(5);
    	graph.get(7).add(6);
    	graph.get(7).add(9);
    	
    	graph.get(8).add(5);
    	graph.get(8).add(9);
    	
    	graph.get(9).add(7);
    	graph.get(9).add(8);
    	
    	bfs(0);
	}
	
	static void bfs(int node) {
		boolean[] visited = new boolean[10];
		Queue<Integer> q = new LinkedList<>();
		// 현재 노드 방문 처리
		visited[node] = true;
		q.add(node);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");
			
//			// 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
//			for(int i = 0; i < graph.get(curr).size(); i++) {
//				int y = graph.get(curr).get(i);
//				// 방문한적이 있으면 넘어감
//				if(visited[y]) continue;
//
//				visited[y] = true;
//				q.add(y);
//			}
			// 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
			for(int next : graph.get(curr)) {
				// 방문한적이 있으면 넘어감
				if(visited[next]) continue;
				visited[next] = true;
				q.add(next);
			}
		}
	}

}
