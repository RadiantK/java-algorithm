package bfs;

import java.util.*;

public class EscapeMaze {

	static int[] _x = {-1,1,0,0};
	static int[] _y = {0,0,-1,1};
	
	static class Point {
		int row, col, dist;
		private Point(int row, int col, int dist) {
			this.row = row;
			this.col = col;
			this.dist = dist;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �迭 ������
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); // nextint �ڷ� ���鹮�ڰ� �ڵ��Էµ� �� �ֱ� ������ ���۸� �����
		
		int[][] arr = new int[n][m];
		
		// �迭 �Է�
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < m ; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		sc.close();
		
		// bfs�� ���ϵ� �̷�Ż�� �ִܰŸ���
		int dis = bfs(arr, 0, 0);
		System.out.println(dis);
	}

	public static int bfs(int[][] arr, int x, int y) {
		// �� ���� ���̸� ������ ����
		int rows = arr.length;
		int cols = arr[0].length;
		boolean[][] visited = new boolean[rows][cols];
		Queue<Point> q = new LinkedList<>();
		visited[x][y] = true; // �ʱ� ��ġ �湮�ߴٰ� true��
		q.offer(new Point(x, y, 1)); // �ʱⰪ�� �־��� (0,0)�Ÿ��� 1���� ����
		
		while(!q.isEmpty()) {
			Point curr = q.poll();
			// ���� ��ġ�� ���� ��ġ�� �������� �Ÿ��� ���̸� ��ȯ
			if(curr.row == rows -1 && curr.col == cols -1) {
				return curr.dist;
			}
			for(int i = 0; i < 4; i++) {
				int nx = curr.row + _x[i];
				int ny = curr.col + _y[i];
				
				// �迭�� ���̸� �Ѿ�� ��ŵ
				if(nx < 0 || nx >= rows || ny < 0 || ny >= cols) continue;
				// �̹� �湮�� ���̸� ��ŵ
				if(visited[nx][ny]) continue;
				// ���̸� ��ŵ
				if(arr[nx][ny] == 0) continue;
				
				// �湮�� ���� �ƴϸ� �湮�ߴٰ� ǥ���ϰ� ����Ÿ� +1�� ť�� �־���
				visited[nx][ny] = true;
				q.offer(new Point(nx, ny, curr.dist + 1));
			}
		}
		return -1;
	}
}
