package cizerCode12926;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				answer += ch[i];
				continue;
			}
			if(ch[i] >= 'a' && ch[i] <= 'z'){
				if(ch[i] + n > 'z') {
					// z의 크기를 넘어가면 알파벳 개수를 빼줌
					answer += (char)(ch[i] - 26 + n);
				} else {
					answer += (char)(ch[i] + n);
				}
			}
			else if(ch[i] >= 'A' && ch[i] <= 'Z') {
				if(ch[i] + n > 'Z') {
					// Z의 크기를 넘어가면 알파벳 개수를 빼줌
					answer += (char)(ch[i] - 26 + n);
				} else {
					answer += (char)(ch[i] + n);
				}
			}
		}
        
        return answer;
    }
}

public class CizerCode {

	public static void main(String[] args) {

		Solution s = new Solution();
		int n = 4;
		String str = "a B z";
		System.out.println(s.solution(str, n));
		
	}

}
