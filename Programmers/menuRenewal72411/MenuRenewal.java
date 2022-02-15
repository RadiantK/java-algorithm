 package menuRenewal72411;

import java.util.*;

class Solution {
	static HashMap<String, Integer> map;
	static int max;

    public String[] solution(String[] orders, int[] course) {
    	// 최대 주문 코스요리를 담을 리스트
        List<String> list = new ArrayList<>();

		for(int i = 0; i < course.length; i++) {
			// 조합의 수를 파악할 해시맵
			map = new HashMap<>();
			max = -1;
			
			// 조합된 메뉴를 알아내는 메소드 호출
			for(int j = 0; j < orders.length; j++) {
				search(orders[j], "", 0, 0, course[i]);
			}
			
			// course[]의 조합중 가장 많이 나온 단어를 리스트에 추가
			for(String key : map.keySet()) {
				if(max > 1 && max == map.get(key)) {
					list.add(key);
				}
			}
		}
		Collections.sort(list);
		// 리스트를 문자열 배열로 변환
		String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
    // 코스메뉴 단일 알파벳, 조합을 구할 문자열, 조합을 위한 인덱스, 코스요리 개수에 따른 재귀함수 종료를 위한 정수
 	static void search(String menu, String temp, int idx, int cnt, int target) {
 		if(cnt == target) {
 			// temp에 담아둔 문자를 배열로 변환한 뒤 조합한 문자를 알파벳 순서로 정렬
 			char[] ch = temp.toCharArray();
 			Arrays.sort(ch);
 			temp = String.valueOf(ch);
 			map.put(temp, map.getOrDefault(temp, 0)+1);
 			// 조합된 문자의 개수중 최대를 파악함
 			max = Math.max(max, map.get(temp));
 			return;
 		} else {
 			for(int i = idx; i < menu.length(); i++) {
 				char tmp = menu.charAt(i);
 				search(menu, temp+tmp, i+1, cnt+1, target);
 			}
 		}
 	}
}

class Solution2 {
	static HashMap<String, Integer> map;
	static int max;

    public String[] solution(String[] orders, int[] course) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < orders.length; i++) {
        	char[] ch = orders[i].toCharArray();
        	Arrays.sort(ch);
        	orders[i] = String.valueOf(ch);
        }

		for(int i = 0; i < course.length; i++) {
			map = new HashMap<>();
			max = -1;

			for(int j = 0; j < orders.length; j++) {
				search(orders[j], "", 0, 0, course[i]);
			}

			for(String key : map.keySet()) {
				if(max > 1 && max == map.get(key)) {
					list.add(key);
				}
			}
		}
		Collections.sort(list);

		String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
 	static void search(String menu, String temp, int idx, int cnt, int target) {
 		System.out.println(temp);
 		if(cnt == target) {
 			map.put(temp, map.getOrDefault(temp, 0)+1);
 			max = Math.max(max, map.get(temp));
 			return;
 		}
		for(int i = idx; i < menu.length(); i++) {
			char tmp = menu.charAt(i);
			search(menu, temp+tmp, i+1, cnt+1, target);
		}
 	}
}

public class MenuRenewal {
	public static void main(String[] args) {	
		Solution2 s = new Solution2();
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
