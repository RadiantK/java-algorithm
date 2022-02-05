package dfs;

import java.util.Scanner;

public class FreezeDrink {

	static int[] _x = {-1,1,0,0};
	static int[] _y = {0,0,-1,1};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 배열 범위
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		// 배열 입력
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// 방문한곳을 체킹할 배열
		boolean[][] check = new boolean[n][m];
		int count = 0;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] != 1 && !check[i][j]) {
					dfs(arr, check, i, j);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void dfs(int[][] arr, boolean[][] check, int x, int y) {
		
		check[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + _x[i];
			int ny = y + _y[i];
			// 배열의 범위를 넘어가면 스킵
			if(nx < 0 || nx >= arr.length || ny < 0 || ny >= arr[0].length) continue;
			// 이미 방문한곳 스킵
			if(check[nx][ny]) continue;
			// 칸막이는 스킵
			if(arr[nx][ny] == 1) continue;
			dfs(arr, check, nx, ny);
		}
	}

}
