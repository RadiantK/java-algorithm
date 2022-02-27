package checkingDistance81302;

import java.util.*;

class Solution {
	
	static int[] _x = {-1, 1, 0, 0}; // 행의 상 하 탐색
	static int[] _y = {0, 0, -1, 1}; // 열의 좌 우 탐색
	// 개발자 면접 대기자 위치
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
        // 거리두기 지켜졌으면 1 아니면 0
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
    		
    		// 거리가 멘해튼 거리 2보다 크면 탐색할 필요가 없음
    		if(dev.dis > 2) continue;
    		// 거리가 2 이하면서 0이 아닐때 P가 있으면 거리두기가 지켜지지 않음
    		if(dev.dis != 0 && place[dev.row].charAt(dev.col) == 'P') {
    			return false;
    		}
    		// 상하좌우 탐색
    		for(int i = 0; i < 4; i++) {
    			int nx = dev.row + _x[i]; // 행 위 밑 탐색
    			int ny = dev.col + _y[i]; // 열 좌 우 탐색
    			int len = place.length;
    			// 배열의 크기를 넘어가면 스킵
    			if(nx < 0 || nx >= len || ny < 0 || ny >= len) continue;
    			if(visited[nx][ny]) continue; // true는 이미 확인한 'P'의 위치
    			if(place[nx].charAt(ny) == 'X') continue; // 파티션은 넘어감
    			
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
