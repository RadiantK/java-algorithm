package budget12982;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int cnt = 0;
        // 오름차순정렬로 테스트
        Arrays.sort(d);

        // 예산이 상품가격보다 크거나 같을때까지 조건문 수행
        for(int i = 0; i < d.length; i++) {
        	if(budget >= d[i]) {
        		budget -= d[i];
        		cnt++;
        	} else {
        		break;
        	}
        }
        return cnt;
    }
}

public class Budget {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] d = {1,3,2,5,4};
		int[] d2 = {2,2,3,3};
		System.out.println(s.solution(d, 9));
		System.out.println(s.solution(d2, 10));
	}

}
