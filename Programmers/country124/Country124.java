package country124;

class Solution {
    public String solution(int n) {
    	StringBuilder sb = new StringBuilder();
    	// 1,2,4로만 수를 표현
    	while(n != 0) {
    		/// 3으로 나눈 나머지
    		int rules = n % 3;
    		
    		if(rules == 0) {
    			sb.append(4);
    		} else if (rules == 1) {
    			sb.append(1);
    		} else if (rules == 2) {
    			sb.append(2);
    		}
    		// 0으로 나누어 떨어지면 n값을 하나 빼줌
    		if(rules == 0) {
    			n--;
    		}
    		n = n/3;
    	}
        return sb.reverse().toString();
    }
}

public class Country124 {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(10));
	}

}
