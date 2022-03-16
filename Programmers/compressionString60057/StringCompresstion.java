package compressionString60057;

class Solution {
	
	public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 1; i <= (s.length()/2)+1; i++) {
        	String temp = s.substring(0, i); // 처음 몇글자씩 자를건지
        	String lastText = ""; // 압축한 뒤 남은 짜투리 문자를 담는 용도
        	String curr = ""; // 현재까지 압축된 문자를 담는 용도
        	int count = 1; // 중첩된 문자열 카운트
        	
        	for (int j = i; j < s.length(); j += i) {
        		
        		// 2 이상의 단어를 압축 후 뒤에 남는 문자열을 넣어줌
        		if(j + i > s.length()) {	
        			lastText = s.substring(j);
        			continue;
        		}
        		
        		// 두 문자열을 비교해서 같으면 카운트를 올림
        		if(temp.equals(s.substring(j, j + i))) {
        			count++;
        		}
        		// 비교한 문자가 다를 때
        		else {
        			curr += temp;
        			if(count > 1) {
        				curr = count + curr;
        			}
        			temp = s.substring(j, j + i);
        			count = 1;
        		}
        	}
        	// 압축한 문자들과 남은 문자들을 전부 합쳐줌
        	curr += temp + lastText;
        	if(count > 1) {
        		curr = count + curr;
        	}
        	// 압축된 문자 중 더 작은 길이의 문자열을 고름
        	answer = answer > curr.length() ? curr.length() : answer;
        }   
        return answer;
    }
}

public class StringCompresstion {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		System.out.println(s.solution("aabbaccc"));
		System.out.println(s.solution("ababcdcdababcdcd"));
		System.out.println(s.solution("abcabcdede"));
		System.out.println(s.solution("abcabcabcabcdededededede"));
		System.out.println(s.solution("xababcdcdababcdcd"));
	}
	
}
