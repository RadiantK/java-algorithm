package phonekemon1845;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        
        // 중복을 제거 하기 위해서
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
        	set.add(num);
        }
        // set사이즈가 폰켓몬수/2보다 크면 폰켓몬/2값만큼 선택가능
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
