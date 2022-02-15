 package menuRenewal72411;

import java.util.*;

class Solution {
	static HashMap<String, Integer> map;
	static int max;

    public String[] solution(String[] orders, int[] course) {
    	// �ִ� �ֹ� �ڽ��丮�� ���� ����Ʈ
        List<String> list = new ArrayList<>();

		for(int i = 0; i < course.length; i++) {
			// ������ ���� �ľ��� �ؽø�
			map = new HashMap<>();
			max = -1;
			
			// ���յ� �޴��� �˾Ƴ��� �޼ҵ� ȣ��
			for(int j = 0; j < orders.length; j++) {
				search(orders[j], "", 0, 0, course[i]);
			}
			
			// course[]�� ������ ���� ���� ���� �ܾ ����Ʈ�� �߰�
			for(String key : map.keySet()) {
				if(max > 1 && max == map.get(key)) {
					list.add(key);
				}
			}
		}
		Collections.sort(list);
		// ����Ʈ�� ���ڿ� �迭�� ��ȯ
		String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
    // �ڽ��޴� ���� ���ĺ�, ������ ���� ���ڿ�, ������ ���� �ε���, �ڽ��丮 ������ ���� ����Լ� ���Ḧ ���� ����
 	static void search(String menu, String temp, int idx, int cnt, int target) {
 		if(cnt == target) {
 			// temp�� ��Ƶ� ���ڸ� �迭�� ��ȯ�� �� ������ ���ڸ� ���ĺ� ������ ����
 			char[] ch = temp.toCharArray();
 			Arrays.sort(ch);
 			temp = String.valueOf(ch);
 			map.put(temp, map.getOrDefault(temp, 0)+1);
 			// ���յ� ������ ������ �ִ븦 �ľ���
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
