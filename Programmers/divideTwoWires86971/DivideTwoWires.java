package divideTwoWires86971;

import java.util.*;
// ���¸��� �ѷ� ������
class Solution {
	List<List<Integer>> graph;
	
    public int solution(int n, int[][] wires) {
    	// N�� 100�����̱� ������ 101�� ���Ұ��� �ʱ�ȭ
        int answer = 101;
        // List���� �� �ʱ�ȭ
        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
        	graph.add(new ArrayList<>());
        }
        // list�� wire ���� �־���
        for(int[] wire : wires) {
        	graph.get(wire[0]).add(wire[1]);
        	graph.get(wire[1]).add(wire[0]);
        }
        // bfs ��ȸ, �� ������ �߶� ������ �߸� ��带 �������� �ΰ��� ���� ���밪�� ���� ���� ã��
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
    	// ������ ������ �� �̵��ϴ� ����� �� ī��Ʈ
    	int cnt = 0;
    	visited[node1] = true;
    	q.add(node1);
    	
    	while(!q.isEmpty()) {
    		int curr = q.poll();
    		cnt++;
    		
    		for(int next : graph.get(curr)) {
    			// ������ ������ �κ��� ��ŵ
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

	// ���¸��� �ѷ� ������
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
