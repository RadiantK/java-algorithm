package divideTwoWires86971;

import java.util.*;
// 전력망을 둘로 나누기
class Solution {
	List<List<Integer>> graph;
	
    public int solution(int n, int[][] wires) {
    	// N은 100이하이기 때문에 101로 비교할값을 초기화
        int answer = 101;
        // List생성 및 초기화
        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
        	graph.add(new ArrayList<>());
        }
        // list에 wire 값을 넣어줌
        for(int[] wire : wires) {
        	graph.get(wire[0]).add(wire[1]);
        	graph.get(wire[1]).add(wire[0]);
        }
        // bfs 순회, 각 간선을 잘라서 간선이 잘린 노드를 기준으로 두개의 차의 절대값이 작은 것을 찾음
        for(int[] wire : wires) {
        	int a = bfs(wire[0], wire[1], n);
        	int b = bfs(wire[1], wire[0], n);
        	
        	answer = Math.min(answer, Math.abs(a - b));
        }

        return answer;
    }
    public int bfs(int node1, int node2, int n) {
    	Queue<Integer> q = new LinkedList<>();
    	boolean[] visited = new boolean[n+1];
    	// 간선을 끊었을 때 이동하는 노드의 수 카운트
    	int cnt = 0;
    	visited[node1] = true;
    	q.add(node1);
    	
    	while(!q.isEmpty()) {
    		int curr = q.poll();
    		cnt++;
    		
    		for(int next : graph.get(curr)) {
    			// 간선을 제거한 부분은 스킵
    			if(next == node2) continue;
    			if(visited[next]) continue;
    			
    			visited[next] = true;
    			q.add(next);
    		}
    	}
    	return cnt;
    }
}

public class DivideTwoWires {

	// 전력망을 둘로 나누기
	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] wires = {{1,3},
				{2,3},
				{3,4},
				{4,5},
				{4,6},
				{4,7},
				{7,8},
				{7,9}};
		int n = 9;
		
		System.out.println(s.solution(n, wires));
	}

}
