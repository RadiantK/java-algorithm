package algorithm5;

import java.util.*;

class UndirectedGraph{
	
	int count; // 노드의 개수
	private int[][] vertexMatrix;
	
	public UndirectedGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	// 간선의 연결유무
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}

public class DfsSearch {
	
	int count;
	boolean[] visited;
	Stack<Integer> st;
	int[][] matrix;
	
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		st = new Stack<>();
	}
	
	public void dfs() {
		
		st.push(0);
		visited[0] = true;
		
		while(!st.isEmpty()) {
			int node = st.pop();
			
			System.out.print(node + " ");
			
			for(int j = 0; j < count; j++) {
				if(matrix[node][j] != 0 && !visited[j]) {
					
					st.push(j);
					visited[j] = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		int count = 8;
		UndirectedGraph g = new UndirectedGraph(count);
		
		g.addEdges(0, 1, 1);
		g.addEdges(0, 2, 1);
		g.addEdges(1, 3, 1);
		g.addEdges(1, 4, 1);
		g.addEdges(2, 5, 1);
		g.addEdges(2, 6, 1);
		g.addEdges(4, 5, 1);
		g.addEdges(3, 7, 1);
		
		DfsSearch dfs = new DfsSearch(count);
		dfs.matrix = g.getMatrix();
		dfs.dfs();
	}

}
