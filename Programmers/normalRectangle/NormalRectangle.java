package normalRectangle;

class Solution {
    public long solution(int w, int h) {
    	long _w = w;
    	long _h = h;

        long answer = (_w * _h) - ((_w + _h) - gcd(_w, _h));
        return answer;
    }
    
    // 최대 공약수 구하는법(유클리드 호제법)
    public static long gcd(long a, long b) {
    	
    	long max = a > b ? a : b;
    	long min = a > b ? b : a;
    	
    	long n = 0;
    	
    	while(min != 0) {
    		n = max % min;
    		max = min;
    		min = n;
    	}
    	return max;
    }
}

public class NormalRectangle {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(8, 12));
	}

}
