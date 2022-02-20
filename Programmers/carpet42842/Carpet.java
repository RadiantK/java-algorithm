package carpet42842;

import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
		int sum = brown + yellow;
		// 노란 격자를 들어가기 위해서는 최소 가로 3 세로 3이 되어야함
		for(int i = 3; i <= Math.sqrt(sum); i++) {
			int j = sum / i;
			
			if(sum % i == 0) {
				// 임의 값의 약수중 3보다 크며 12의 약수면 3,4 에서 큰값이 열 작은값이 행이 됨
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
