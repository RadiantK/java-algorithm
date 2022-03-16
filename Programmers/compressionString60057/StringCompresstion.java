package compressionString60057;

class Solution {
	
	public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 1; i <= (s.length()/2)+1; i++) {
        	String temp = s.substring(0, i); // ó�� ����ھ� �ڸ�����
        	String lastText = ""; // ������ �� ���� ¥���� ���ڸ� ��� �뵵
        	String curr = ""; // ������� ����� ���ڸ� ��� �뵵
        	int count = 1; // ��ø�� ���ڿ� ī��Ʈ
        	
        	for (int j = i; j < s.length(); j += i) {
        		
        		// 2 �̻��� �ܾ ���� �� �ڿ� ���� ���ڿ��� �־���
        		if(j + i > s.length()) {	
        			lastText = s.substring(j);
        			continue;
        		}
        		
        		// �� ���ڿ��� ���ؼ� ������ ī��Ʈ�� �ø�
        		if(temp.equals(s.substring(j, j + i))) {
        			count++;
        		}
        		// ���� ���ڰ� �ٸ� ��
        		else {
        			curr += temp;
        			if(count > 1) {
        				curr = count + curr;
        			}
        			temp = s.substring(j, j + i);
        			count = 1;
        		}
        	}
        	// ������ ���ڵ�� ���� ���ڵ��� ���� ������
        	curr += temp + lastText;
        	if(count > 1) {
        		curr = count + curr;
        	}
        	// ����� ���� �� �� ���� ������ ���ڿ��� ��
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
