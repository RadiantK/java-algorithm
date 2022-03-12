package nSquareArrayCutting87390;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        // �Ϲ� 2���� �迭�� long�� string, int ���� ����� �� ���⶧���� �ð��ʰ��� ������ ��
        // ��� ���� ������ �� �� �� �� �ִ밪�� ������� ��
        for(int i = 0; i < answer.length; i++) {
        	int row = (int)((i + left) / n) + 1;
        	int col = (int)((i + left) % n) + 1;
        	
        	answer[i] = row > col ? row : col;
        }
        return answer;
    }
}

class Solution2 {
	// �ð��ʰ� ....
    public int[] solution(int n, long left, long right) {
    	// n*n 2���� �迭 ����
		int[][] a = new int[n][n];
		String temp = "";
		// �� �ʱ�ȭ
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				a[i][j] = i+1;
			}
			for(int j = 0; j <= i; j++) {
				a[j][i] = i+1;
			}
		}
		
		// temp�� 2�����迭�� ���� �־���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				temp += a[i][j];
			}
		}
		int l = (int) left;
		int r = (int) right;
		temp = temp.substring(l, r+1);
		int[] answer = new int[temp.length()];
		
		for(int i = 0; i < temp.length(); i++) {
			answer[i] = temp.charAt(i) - '0';
		}
        return answer;
    }
}

public class NSquareArrayCutting {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(4, 7, 14)));
		System.out.print(0%2);
	}

}
