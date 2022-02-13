package minRactangle86491;

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int firstMax = 0;
        int secondMax = 0;
        
        for(int[] size : sizes) {
			Arrays.sort(size);
			firstMax = Math.max(firstMax, size[0]);
			secondMax = Math.max(secondMax, size[1]);
		}

        return firstMax * secondMax;
    }
}

public class MinRactangle {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] sizes = {
				{60, 50},
				{30, 70},
				{60, 30},
				{80, 40}
				};
		
		System.out.println(s.solution(sizes));			
	}

}
