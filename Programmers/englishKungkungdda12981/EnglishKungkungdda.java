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
			// 현재 단어가 단어가 포함되어 있으면 
			if (st.contains(curr)) { 
				peopleCnt = (i % n) +1;
				sequence = (i / n) + 1;
				break;
			} 
			
			st.push(curr);
			// 가장 첫번째 단어는 확인할 필요 x
			if (i > 0) {
				// 이전 단어의 마지막글자와 현재 단어의 첫 글자가 같지 않으면
				if (st.get(i-1).charAt(st.get(i-1).length()-1) != st.peek().charAt(0)) {
				peopleCnt = (i % n) +1;
				sequence = (i / n) + 1;
				break;
				}
			}
			// 주어진 단어로 탈락하는 사람이 생기지 않는 경우
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
