package gameMapShortDistance1844;

import java.util.*;

class Solution {
	
	static int[] _x = {-1,1,0,0};
	static int[] _y = {0,0,-1,1};
	
	class Point{
		int row = 0;
		int col = 0;
		int dist = 0;
		private Point(int row, int col, int dist) {
			this.row = row;
			this.col = col;
			this.dist = dist;
		}
	}
    public int solution(int[][] maps) {
        int answer = 0;
        answer = bfs(0, 0, maps.length, maps[0].length, maps);
        return answer;
    }
    
    int bfs(int sRow, int sCol, int eRow, int eCol, int[][] maps) {
    	boolean[][] visited = new boolean[eRow][eCol];
    	Queue<Point> q = new LinkedList<>();
    	visited[sRow][sCol] = true;
    	q.add(new Point(sRow, sCol, 1));
    	
    	while(!q.isEmpty()) {
    		Point curr = q.poll();
    		if(curr.row == eRow-1 && curr.col == eCol-1) {
    			return curr.dist;
    		}
    		
    		for(int i = 0; i < 4; i++) {
    			// 상 하 좌 우 탐색
    			int nx = curr.row + _x[i];
    			int ny = curr.col + _y[i];
    			// 배열의 크기를 넘어가면 스킵
    			if(nx < 0 || nx >= eRow || ny < 0 || ny >= eCol)
    				continue;
    			// 이미 왔던 곳이면 스킵
    			if(visited[nx][ny]) continue;
    			// 벽이면 스킵
    			if(maps[nx][ny] == 0) continue;
    			// 처음오는곳이면 true를 해주고 거리를 1늘려줌
    			visited[nx][ny] = true;
    			q.add(new Point(nx, ny, curr.dist + 1));    			
    		}
    	}
    	return -1;
    }
}

public class GameMapShortDistance {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] maps = {
			{1,0,1,1,1},
			{1,0,1,0,1},
			{1,0,1,1,1},
			{1,1,1,0,1},
			{0,0,0,0,1}
		};
		System.out.print(s.solution(maps));
	}
}
