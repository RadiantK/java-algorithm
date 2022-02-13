package dfs;

import java.util.ArrayList;

public class DfsArrayList {

	public static boolean[] visited = new boolean[10];
    public static ArrayList<ArrayList<Integer>> graph;

    // DFS 함수 정의
    public static void dfs(int node) {
        // 현재 노드를 방문 처리
    	visited[node] = true;
    	System.out.print(node+ " ");
        
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int i = 0; i < graph.get(node).size(); i++) {
        	int y = graph.get(node).get(i);
        	if(!visited[y]) dfs(y);
        }
    }

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

    	dfs(0);
    }

}