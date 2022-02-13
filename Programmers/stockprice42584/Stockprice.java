package stockprice42584;

import java.util.*;

class Solution {
	// 정말 별로인 문제 
    public int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
		Stack<Integer> st = new Stack<>();
		
		int count = 0;
		for(int i = 0; i < prices.length; i++) {
			count = 0;
			// 주식가격 i번째것을 하나 담음
			st.push(prices[i]);
			// 스텍에 담은 값을 다음값부터 비교
			for(int j = i+1; j < prices.length; j++) {
				
				if(st.peek() <= prices[j]) count++;
				else {
					count++;
					break;
				}
			}
			st.pop();
			answer[i] = count;
		}
        return answer;
    }
}

public class Stockprice {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] prices = {1, 2, 3, 2, 3};
		
		System.out.println(Arrays.toString(s.solution(prices)));
	}
	
}
