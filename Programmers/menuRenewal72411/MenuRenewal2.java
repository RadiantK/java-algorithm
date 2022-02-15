 package menuRenewal72411;

import java.util.*;

class Solution3 {
	// orders메뉴의 개수
	List<Map<String, Integer>> maps = new ArrayList<>();
	// 메뉴별 최대 주문 횟수
	int[] MaxCnt = new int[11];
	public String[] solution(String[] orders, int[] course) {
		// orders의 원소의 크기가 10 이하이기때문에 0~10까지 반복문
    	for(int i = 0; i < 11; i++) {
    		maps.add(new HashMap<String, Integer>());
    	}
    	
    	for(int i = 0; i < orders.length; i++) {
    		char[] ch = orders[i].toCharArray();
    		Arrays.sort(ch);
    		
    		comb(ch, 0, new StringBuilder());
    	}
    	System.out.println(maps.get(2));
    	
    	List<String> list = new ArrayList<>();
    	for(int len : course) {
    		for(String key : maps.get(len).keySet()) {
    			if(maps.get(len).get(key) >= 2 && MaxCnt[len] == maps.get(len).get(key)) {
    				list.add(key);
    			}
    		}
    	}
    	Collections.sort(list);
		
		String[] answer = new String[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
	
	void comb(char[] str, int pos, StringBuilder candi) {
		if(pos >= str.length) {
			int len = candi.length(); // 메뉴의 개수
			if(len >= 2) { // 메뉴의 길이가 2 이상인 것만
				// 가장 많이 중복된 메뉴
				int cnt = maps.get(len).getOrDefault(candi.toString(), 0) +1;
				maps.get(len).put(candi.toString(), cnt);
				MaxCnt[len] = Math.max(MaxCnt[len], cnt);
			}
			return;
		}
		
		comb(str, pos+1, candi.append(str[pos])); // 문자를 한단어씩 늘리면서 저장
		candi.setLength(candi.length()-1); // 선택했던 문자를 제거
		comb(str, pos+1, candi); // 다시 재귀호출
	}
}

public class MenuRenewal2 {

	public static void main(String[] args) {
		
		Solution3 s = new Solution3();
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//		String[] orders2 = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
//		String[] orders3 = {"XYZ", "XWY", "WXA"};
		
		int[] course = {2,3,4};
//		int[] course2 = {2,3,5};
//		int[] course3 = {2,3,4};
		
		System.out.println(Arrays.toString(s.solution(orders, course)));
//		System.out.println(Arrays.toString(s.solution(orders2, course2)));
//		System.out.println(Arrays.toString(s.solution(orders3, course3)));
	}
	
}
