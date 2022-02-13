package stockprice42584;

import java.util.*;

class Solution {
	// ���� ������ ���� 
    public int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
		Stack<Integer> st = new Stack<>();
		
		int count = 0;
		for(int i = 0; i < prices.length; i++) {
			count = 0;
			// �ֽİ��� i��°���� �ϳ� ����
			st.push(prices[i]);
			// ���ؿ� ���� ���� ���������� ��
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
