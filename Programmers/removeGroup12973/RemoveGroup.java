package removeGroup12973;

import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(!st.isEmpty() && st.peek() == ch) {
        		st.pop();
        	} else {
        		st.push(ch);
        	}
        }
        int answer = st.isEmpty() ? 1 : 0;
        return answer;
    }
}

public class RemoveGroup {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("baabaa"));
		System.out.println(s.solution("cdcd"));
	}

}
