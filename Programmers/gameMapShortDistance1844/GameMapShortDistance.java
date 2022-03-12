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
    			// �� �� �� �� Ž��
    			int nx = curr.row + _x[i];
    			int ny = curr.col + _y[i];
    			// �迭�� ũ�⸦ �Ѿ�� ��ŵ
    			if(nx < 0 || nx >= eRow || ny < 0 || ny >= eCol)
    				continue;
    			// �̹� �Դ� ���̸� ��ŵ
    			if(visited[nx][ny]) continue;
    			// ���̸� ��ŵ
    			if(maps[nx][ny] == 0) continue;
    			// ó�����°��̸� true�� ���ְ� �Ÿ��� 1�÷���
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
