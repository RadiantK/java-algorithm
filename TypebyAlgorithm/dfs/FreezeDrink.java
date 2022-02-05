package dfs;

import java.util.Scanner;

public class FreezeDrink {

	static int[] _x = {-1,1,0,0};
	static int[] _y = {0,0,-1,1};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �迭 ����
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		// �迭 �Է�
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// �湮�Ѱ��� üŷ�� �迭
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
			// �迭�� ������ �Ѿ�� ��ŵ
			if(nx < 0 || nx >= arr.length || ny < 0 || ny >= arr[0].length) continue;
			// �̹� �湮�Ѱ� ��ŵ
			if(check[nx][ny]) continue;
			// ĭ���̴� ��ŵ
			if(arr[nx][ny] == 1) continue;
			dfs(arr, check, nx, ny);
		}
	}

}
