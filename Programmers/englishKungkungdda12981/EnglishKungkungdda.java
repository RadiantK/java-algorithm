package englishKungkungdda12981;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
    	int[] answer = new int[2];
        Stack<String> st = new Stack<>();
		int peopleCnt = 0;
		int sequence = 0;

		for(int i = 0; i < words.length; i++) {
			String curr = words[i];
			// ���� �ܾ �ܾ ���ԵǾ� ������ 
			if (st.contains(curr)) { 
				peopleCnt = (i % n) +1;
				sequence = (i / n) + 1;
				break;
			} 
			
			st.push(curr);
			// ���� ù��° �ܾ�� Ȯ���� �ʿ� x
			if (i > 0) {
				// ���� �ܾ��� ���������ڿ� ���� �ܾ��� ù ���ڰ� ���� ������
				if (st.get(i-1).charAt(st.get(i-1).length()-1) != st.peek().charAt(0)) {
				peopleCnt = (i % n) +1;
				sequence = (i / n) + 1;
				break;
				}
			}
			// �־��� �ܾ�� Ż���ϴ� ����� ������ �ʴ� ���
			if(i == words.length-1) return new int[]{0, 0};
		}

		answer[0] = peopleCnt;
		answer[1] = sequence;
        return answer;
    }
}

public class EnglishKungkungdda {

	public static void main(String[] args) {

		Solution s = new Solution();
		int n = 3;
		String[] words = {
				"tank", "kick", "know",
				"wheel", "land", "dream",
				"mother", "robot", "tank"
				};
		String[] words2 = {"hello", "observe", "effect", "take", "either",
				"recognize", "encourage", "ensure", "establish", "hang",
				"gather", "refer", "reference", "estimate", "executive"};
		
		System.out.println(Arrays.toString(s.solution(n, words)));
		System.out.println(Arrays.toString(s.solution(5, words2)));
		
	}

}
