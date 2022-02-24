package moreSpicy42626;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
        	q.add(scoville[i]);
        }
        int count = 0;
        while(q.peek() < K) {
        	if(q.size() < 2) {
        		return -1;
        	}
        	int first = q.poll();
        	int second = q.poll();
        	
        	int spicy = first + (second * 2);
        	q.offer(spicy);
        	count++;
        }
        return count;
    }
}

public class MoreSpicy {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] a = {1, 2, 3, 9, 10, 12};
		
		System.out.println(s.solution(a, 7));

	}

}
