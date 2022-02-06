package kakaoColoringBook1829;

import java.util.Arrays;

class Solution {
	static int[] _x = {-1,1,0,0}; // 좌표에서 상, 하를 탐색할 때
	static int[] _y = {0,0,-1,1}; // 좌표에서 좌, 우를 탐색할 때
	static int temp_cnt; // 가장 큰 영역의 수를 저장할 임시 변수

	public static void dfs(int[][] picture, boolean[][] visited, int x, int y) {
		// 이미 방문한 적이 있으면 리턴
		if(visited[x][y])
			return;
		// 처음 확인하는 좌표
		visited[x][y] = true;
		// 가장 큰 영역의 수를 카운트(임시)
		temp_cnt++;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + _x[i]; // 위,아래 탐색
			int ny = y + _y[i]; // 좌,우 탐색
			
			// 배열의 길이를 넘어가면 넘어감
			if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length)
				continue;
			// 현재 좌표와 상하좌우를 검사한 좌표와 같으면서 방문한적이 없는 좌표면 재귀
			if(picture[x][y] == picture[nx][ny] && !visited[nx][ny]) {
				dfs(picture, visited, nx, ny);
			}
		}
	}
	
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        
        // dfs매서드 방문 여부 체크
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		// 배열의 값이 0이 아니면서 방문한적이없으면
        		if(picture[i][j] != 0 && !visited[i][j]) {
        			// 영역의 종류를 카운트
        			numberOfArea++;
        			dfs(picture, visited, i, j);
        		}
        		// 같은 수의 영역을 모두 탐색하면 최대 카운트를 업데이트
        		if(temp_cnt > maxSizeOfOneArea) {
        			maxSizeOfOneArea = temp_cnt;
        		}
        		// 최대영역을 담는 변수 초기화
        		temp_cnt = 0;
        	}
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}

public class KakaoColoringBook {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] picture = {
				{1, 1, 1, 0},
				{1, 2, 2, 0},
				{1, 0, 0, 1},
				{0, 0, 0, 1},
				{0, 0, 0, 3},
				{0, 0, 0, 3}
				};
		
		System.out.println(Arrays.toString(s.solution(6, 4, picture)));
		
	}
}

