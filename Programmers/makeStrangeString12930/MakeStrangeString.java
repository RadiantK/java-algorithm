package makeStrangeString12930;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 모든 문자를 한단어씩 쪼개서 배열에 넣음
        String[] temp = s.split("");
        
        int cnt = 0;
        for(int i = 0; i < temp.length; i++) {
        	// 공백이면 카운트를 0으로 초기화
        	if(temp[i].equals(" ")) cnt = 0;
        	// 홀수번째는 대문자로 변경
        	else if(cnt % 2 == 0) {
        		temp[i] = temp[i].toUpperCase();
        		cnt++;
        	}
        	// 짝수번째는 소문자로 변경
        	else if(cnt % 2 != 0) {
        		temp[i] = temp[i].toLowerCase();
        		cnt++;
        	}
        	// 변경한 문자를 문자열에 합침
        	answer += temp[i];
        }
        return answer;
    }
}

public class MakeStrangeString {

	public static void main(String[] args) {

		Solution s = new Solution();
		String str = "try hello world";
		System.out.println(s.solution(str));
		
		System.out.print((char)('A'+ 1));
	}

}
