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
		
		// 배열 사이즈
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); // nextint 뒤로 공백문자가 자동입력될 수 있기 때문에 버퍼를 비워줌
		
		int[][] arr = new int[n][m];
		
		// 배열 입력
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < m ; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		sc.close();
		
		// bfs의 리턴된 미로탈출 최단거리값
		int dis = bfs(arr, 0, 0);
		System.out.println(dis);
	}

	public static int bfs(int[][] arr, int x, int y) {
		// 행 열의 길이를 변수로 받음
		int rows = arr.length;
		int cols = arr[0].length;
		boolean[][] visited = new boolean[rows][cols];
		Queue<Point> q = new LinkedList<>();
		visited[x][y] = true; // 초기 위치 방문했다고 true값
		q.offer(new Point(x, y, 1)); // 초기값을 넣어줌 (0,0)거리는 1부터 시작
		
		while(!q.isEmpty()) {
			Point curr = q.poll();
			// 현재 위치와 도착 위치가 같아지면 거리의 길이를 반환
			if(curr.row == rows -1 && curr.col == cols -1) {
				return curr.dist;
			}
			for(int i = 0; i < 4; i++) {
				int nx = curr.row + _x[i];
				int ny = curr.col + _y[i];
				
				// 배열의 길이를 넘어가면 스킵
				if(nx < 0 || nx >= rows || ny < 0 || ny >= cols) continue;
				// 이미 방문한 곳이면 스킵
				if(visited[nx][ny]) continue;
				// 벽이면 스킵
				if(arr[nx][ny] == 0) continue;
				
				// 방문한 곳이 아니면 방문했다고 표시하고 현재거리 +1을 큐에 넣어줌
				visited[nx][ny] = true;
				q.offer(new Point(nx, ny, curr.dist + 1));
			}
		}
		return -1;
	}
}
