package makeBigNumber42883;

import java.util.Stack;

class Solution {
	
    public String solution(String number, int k) {
    	// number�� �鸸�ڸ� �����̱⶧���� �޸𸮼Ҹ� ���̱� ���ؼ� StringBuilder ���
    	StringBuilder sb = new StringBuilder();
        int idx = 0;
        int max = 0;
        
        // number�� ���̿��� k��ŭ �� �ڸ����� ���ڸ� ���ϱ� ���� �ݺ���
        for(int i = 0; i < number.length() - k; i++) {
        	max = 0;
        	for(int j = idx; j <= i + k; j++) {
        		if(max < number.charAt(j) - '0') {
        			max = number.charAt(j) - '0';
        			idx = j + 1;
        		}
        	}
        	sb.append(max);
        }
        return sb.toString();
    }
}

class Solution2 {
	
    public String solution(String number, int k) {
    	char[] c = new char[number.length()-k];
    	Stack<Character> st = new Stack<>();
    	
    	for(int i = 0; i < number.length(); i++) {
    		char ch = number.charAt(i);
    		while(!st.isEmpty() && st.peek() < ch && k-- > 0) {
    			st.pop();
    		}
    		st.push(ch);
    	}
    	for(int i = 0; i < c.length; i++) {
    		c[i] = st.get(i);
    	}
    	return new String(c);
    }
}

public class MakeBigNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		Solution2 s2 = new Solution2();
		String number = "826127";
		int k = 3;
		
		System.out.println(s.solution(number, k));
		System.out.println(s2.solution(number, k));
	}

}