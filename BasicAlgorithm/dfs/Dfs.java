package dfs;

import java.util.Scanner;

public class Dfs {

	static int n, e;
	static int[][] Graph = new int[10][10];
	static boolean[] visited = new boolean[10];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		e = sc. nextInt();
		
		for(int i = 0; i < n; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			Graph[r][c] = Graph[c][r] = 1;
		}
		sc.close();
		dfs(0);
	}
	static void dfs(int node) {
		visited[node] = true;
		System.out.print(node + " ");
		
		for(int i = 0; i < n; i++) {
			if(!visited[i] && Graph[node][i] != 0) {
				dfs(i);
			}
		}
	}
}
