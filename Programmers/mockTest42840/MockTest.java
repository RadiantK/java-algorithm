package mockTest42840;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<Integer>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        for(int i = 0; i < answers.length; i++) {
        	if(first[i % 5] == answers[i]) {
        		score[0]++;
        	}
        	if (second[i % 8] == answers[i]) {
        		score[1]++;
        	}
        	if (third[i % 10] == answers[i]) {
        		score[2]++;
        	}
        }
        int max = Math.max(Math.max(score[0], score[1]), score[2]);
        if(score[0] == max) {
        	list.add(1);
        }
        if(score[1] == max) {
        	list.add(2);
        }
        if(score[2] == max) {
        	list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}

public class MockTest {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] answers = {1,2,3,4,5};
		int[] answers2 = {1,3,2,4,2};
		
		System.out.println(Arrays.toString(s.solution(answers)));
		System.out.println(Arrays.toString(s.solution(answers2)));
	}

}
