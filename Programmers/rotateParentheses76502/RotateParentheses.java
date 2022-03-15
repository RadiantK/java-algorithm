package rotateParentheses76502;

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(check(s)) {
        		answer++;
        	}
        	s = s.substring(1, s.length()) + s.substring(0, 1);
        }
        return answer;
    }
    boolean check(String s) {
    	Stack<Character> st = new Stack<>();
    	
    	for(int i = 0; i < s.length(); i++) {

    		if (st.isEmpty()) {
    			st.push(s.charAt(i));
    			continue;
    		} 
    		
    		if(s.charAt(i) == ']' && st.peek() == '[') st.pop();
    		else if(s.charAt(i) == '}' && st.peek() == '{')	st.pop();
    		else if(s.charAt(i) == ')' && st.peek() == '(') st.pop();
    		else st.push(s.charAt(i));
    	}
    	return st.isEmpty() ? true : false;
    }
}

public class RotateParentheses {

	public static void main(String[] args) {

		Solution s = new Solution();
		String s1 = "[](){}";
		String s2 = "}]()[{";
		
		System.out.println(s.solution(s1));
		System.out.println(s.solution(s2));
	}

}
