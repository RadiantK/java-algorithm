package carpet42842;

import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
		int sum = brown + yellow;
		// ��� ���ڸ� ���� ���ؼ��� �ּ� ���� 3 ���� 3�� �Ǿ����
		for(int i = 3; i <= Math.sqrt(sum); i++) {
			int j = sum / i;
			
			if(sum % i == 0) {
				// ���� ���� ����� 3���� ũ�� 12�� ����� 3,4 ���� ū���� �� �������� ���� ��
				int row = Math.min(j, i);
				int col = Math.max(j, i);
				
				int yellowResult = (col-2) * (row-2);
				if(yellowResult == yellow) {
					answer[0] = col;
					answer[1] = row;
				}
			}
		}
		return answer;
    }
}

public class Carpet {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(10, 2)));
	}

}
