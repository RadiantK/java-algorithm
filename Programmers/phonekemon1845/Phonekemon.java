package phonekemon1845;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        
        // �ߺ��� ���� �ϱ� ���ؼ�
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
        	set.add(num);
        }
        // set����� ���ϸ��/2���� ũ�� ���ϸ�/2����ŭ ���ð���
        int result = set.size() >= answer ? answer : set.size();
        return result;
    }
}

public class Phonekemon {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[] nums = {3,1,2,3};
		int[] nums2 = {3,3,3,2,2,4};
		int[] nums3 = {3,3,3,2,2,2};
		
		System.out.println(s.solution(nums));
		System.out.println(s.solution(nums2));
		System.out.println(s.solution(nums3));
	}

}
