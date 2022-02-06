package kakaoColoringBook1829;

import java.util.Arrays;

class Solution {
	static int[] _x = {-1,1,0,0}; // ��ǥ���� ��, �ϸ� Ž���� ��
	static int[] _y = {0,0,-1,1}; // ��ǥ���� ��, �츦 Ž���� ��
	static int temp_cnt; // ���� ū ������ ���� ������ �ӽ� ����

	public static void dfs(int[][] picture, boolean[][] visited, int x, int y) {
		// �̹� �湮�� ���� ������ ����
		if(visited[x][y])
			return;
		// ó�� Ȯ���ϴ� ��ǥ
		visited[x][y] = true;
		// ���� ū ������ ���� ī��Ʈ(�ӽ�)
		temp_cnt++;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + _x[i]; // ��,�Ʒ� Ž��
			int ny = y + _y[i]; // ��,�� Ž��
			
			// �迭�� ���̸� �Ѿ�� �Ѿ
			if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length)
				continue;
			// ���� ��ǥ�� �����¿츦 �˻��� ��ǥ�� �����鼭 �湮������ ���� ��ǥ�� ���
			if(picture[x][y] == picture[nx][ny] && !visited[nx][ny]) {
				dfs(picture, visited, nx, ny);
			}
		}
	}
	
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        
        // dfs�ż��� �湮 ���� üũ
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		// �迭�� ���� 0�� �ƴϸ鼭 �湮�����̾�����
        		if(picture[i][j] != 0 && !visited[i][j]) {
        			// ������ ������ ī��Ʈ
        			numberOfArea++;
        			dfs(picture, visited, i, j);
        		}
        		// ���� ���� ������ ��� Ž���ϸ� �ִ� ī��Ʈ�� ������Ʈ
        		if(temp_cnt > maxSizeOfOneArea) {
        			maxSizeOfOneArea = temp_cnt;
        		}
        		// �ִ뿵���� ��� ���� �ʱ�ȭ
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

