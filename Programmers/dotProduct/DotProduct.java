package dotProduct;

class Solution {
    public int solution(int[] a, int[] b) {
    	
    	// 내적 구하기
    	int dotProduct = 0;
    	for (int i = 0; i < a.length; i++) {
    		dotProduct += (a[i]*b[i]);
    	}
    	
        return dotProduct;
    }
}

public class DotProduct {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[] a1 = {1,2,3,4};
		int[] b1 = {-3,-1,0,2};
		
		int[] a2 = {-1,0,1};
		int[] b2 = {1,0,-1};
		
		System.out.println(s.solution(a1, b1));
		System.out.println(s.solution(a2, b2));
	}

}
