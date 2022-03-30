package dontLikeSameNumber12906;

import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> list = new Stack<>();
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(!list.isEmpty() && list.peek() != arr[i]) list.add(arr[i]);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class DontLikeSameNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] arr = {1,1,3,3,0,1,1};
		
		System.out.println(Arrays.toString(s.solution(arr)));
		
	}

}
