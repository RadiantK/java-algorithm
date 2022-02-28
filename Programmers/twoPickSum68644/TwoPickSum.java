package twoPickSum68644;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 자동 정렬
        Set<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

public class TwoPickSum {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] numbers = {2,1,3,4,1};
	
		System.out.println(Arrays.toString(s.solution(numbers)));
	}

}
