package dfs;

import java.util.ArrayList;

public class DfsArrayList {

	public static boolean[] visited = new boolean[10];
    public static ArrayList<ArrayList<Integer>> graph;

    // DFS �Լ� ����
    public static void dfs(int node) {
        // ���� ��带 �湮 ó��
    	visited[node] = true;
    	System.out.print(node+ " ");
        
        // ���� ���� ����� �ٸ� ��带 ��������� �湮
        for(int i = 0; i < graph.get(node).size(); i++) {
        	int y = graph.get(node).get(i);
        	if(!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) {
    	graph = new ArrayList<>();
        // �׷��� �ʱ�ȭ
    	for(int i = 0; i < 10; i++) {
    		graph.add(new ArrayList<>());
    	}
       
    	// �׷����� ��� ���� ����
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