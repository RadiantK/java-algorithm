package lifeBoat42885;

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0; 
        // 구명보트의 최소개수를 구하기 위해 정렬
        // 첫번째와 마지막을 더해서 limit보다 작으면 최소가 됨
        Arrays.sort(people);
        // 최대 50000명이기 때문에 최대크기의 +1로 크기지정
        Deque<Integer> dq = new ArrayDeque<>(50001);
        for(int peo : people) {
        	dq.add(peo);
        }
        
        while(!dq.isEmpty()) {
        	int last = dq.pollLast();
        	// 덱의 처음과 마지막 인덱스를 더한 몸무게가 리미트보다 작으면 두개를 제거한 뒤 answer++;
        	if(!(dq.isEmpty()) && last + dq.peekFirst() <= limit) {
        		dq.pollFirst();
        	}
        	answer++;
        }
        return answer;
    }
}

public class LifeBoat {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[] people = {70, 80, 50};
		int limit = 100;
		System.out.println(s.solution(people, limit));
		
	}

}
