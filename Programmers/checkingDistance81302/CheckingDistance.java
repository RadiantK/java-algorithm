package checkingDistance81302;

import java.util.*;

class Solution {
	
	static int[] _x = {-1, 1, 0, 0}; // ���� �� �� Ž��
	static int[] _y = {0, 0, -1, 1}; // ���� �� �� Ž��
	// ������ ���� ����� ��ġ
	private class Dev{
		int row;
		int col;
		int dis;
		Dev(int row, int col, int dis){
			this.row = row;
			this.col = col;
			this.dis = dis;
		}
	}
	
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        // �Ÿ��α� ���������� 1 �ƴϸ� 0
        for(int i = 0; i < places.length; i++) {
        	if(find(places[i])) {
        		answer[i] = 1;
        	} else {
        		answer[i] = 0;
        	}
        }
        return answer;
    }
    
    boolean find(String[] place) {
    	
    	for(int i = 0; i < place.length; i++){
    		for(int j = 0; j < place.length; j++) {
    			
    			if(place[i].charAt(j) == 'P') {
    				if(bfs(i, j, place) == false) {
    					return false;
    				}
    			}
    		}
    	}
		return true;
	}
    boolean bfs(int row, int col, String[] place) {
    	boolean[][] visited = new boolean[5][5];
    	Queue<Dev> q = new LinkedList<>();
    	
    	visited[row][col] = true;
    	q.offer(new Dev(row, col, 0));
    	
    	while(!q.isEmpty()) {
    		Dev dev = q.poll();
    		
    		// �Ÿ��� ����ư �Ÿ� 2���� ũ�� Ž���� �ʿ䰡 ����
    		if(dev.dis > 2) continue;
    		// �Ÿ��� 2 ���ϸ鼭 0�� �ƴҶ� P�� ������ �Ÿ��αⰡ �������� ����
    		if(dev.dis != 0 && place[dev.row].charAt(dev.col) == 'P') {
    			return false;
    		}
    		// �����¿� Ž��
    		for(int i = 0; i < 4; i++) {
    			int nx = dev.row + _x[i]; // �� �� �� Ž��
    			int ny = dev.col + _y[i]; // �� �� �� Ž��
    			int len = place.length;
    			// �迭�� ũ�⸦ �Ѿ�� ��ŵ
    			if(nx < 0 || nx >= len || ny < 0 || ny >= len) continue;
    			if(visited[nx][ny]) continue; // true�� �̹� Ȯ���� 'P'�� ��ġ
    			if(place[nx].charAt(ny) == 'X') continue; // ��Ƽ���� �Ѿ
    			
    			visited[nx][ny] = true;
    			q.offer(new Dev(nx, ny, dev.dis+1));    			
    		}
    	}
    	return true;
    }
}

public class CheckingDistance {

	public static void main(String[] args) {

		Solution s = new Solution();
		String[][] str = {
				{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
				{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
		};
		System.out.println(Arrays.toString(s.solution(str)));
	}

}
