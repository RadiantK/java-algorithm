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
		// ���� ���̰� 5�� �Ѿ�� ����
		if(temp.length() >=5 ) return;
		// dfs�� "A"���� "UUUUU"���� key�� "A" value�� 1�� ī��Ʈ�� �÷����鼭 �ʿ� ����
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
