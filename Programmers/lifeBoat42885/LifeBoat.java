package lifeBoat42885;

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0; 
        // ����Ʈ�� �ּҰ����� ���ϱ� ���� ����
        // ù��°�� �������� ���ؼ� limit���� ������ �ּҰ� ��
        Arrays.sort(people);
        // �ִ� 50000���̱� ������ �ִ�ũ���� +1�� ũ������
        Deque<Integer> dq = new ArrayDeque<>(50001);
        for(int peo : people) {
        	dq.add(peo);
        }
        
        while(!dq.isEmpty()) {
        	int last = dq.pollLast();
        	// ���� ó���� ������ �ε����� ���� �����԰� ����Ʈ���� ������ �ΰ��� ������ �� answer++;
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
