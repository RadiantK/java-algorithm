package gcdAndLcm12940;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
    	// 최대 공약수
        int g = gcd(n, m);
        // 최소 공배수
        int l = (n * m) / g;
        return new int[] {g, l};
    }
    int gcd(int n, int m){
        int max = n > m ? n : m;
        int min = n > m ? m : n;
        
        int temp = 0;
        while(min != 0){
        	temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }
}

public class GcdAndLcm {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(3, 12)));
	}

}
