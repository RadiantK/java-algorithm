package vowel84512;

import java.util.*;

class Solution {
	static int cnt = 1;
	static Map<String, Integer> map = new HashMap<>();
	
    public int solution(String word) {
    	String vowel = "AEIOU";
        dfs("", vowel);
        return map.get(word);
    }
    
	static void dfs(String temp, String vowel) {
		// 문자 길이가 5를 넘어가면 리턴
		if(temp.length() >=5 ) return;
		// dfs로 "A"부터 "UUUUU"까지 key에 "A" value에 1씩 카운트를 올려가면서 맵에 저장
		for(int i = 0; i < vowel.length(); i++) {
			char tmp = vowel.charAt(i);
			map.put(temp+tmp, cnt++);
			dfs(temp+tmp, vowel);
		}
	}
}

public class CollectionDictionary {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String str = "EOUOU";

		System.out.println(s.solution(str));
	}

}
