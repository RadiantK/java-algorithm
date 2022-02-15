 package menuRenewal72411;

import java.util.*;

class Solution3 {
	// orders�޴��� ����
	List<Map<String, Integer>> maps = new ArrayList<>();
	// �޴��� �ִ� �ֹ� Ƚ��
	int[] MaxCnt = new int[11];
	public String[] solution(String[] orders, int[] course) {
		// orders�� ������ ũ�Ⱑ 10 �����̱⶧���� 0~10���� �ݺ���
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
			int len = candi.length(); // �޴��� ����
			if(len >= 2) { // �޴��� ���̰� 2 �̻��� �͸�
				// ���� ���� �ߺ��� �޴�
				int cnt = maps.get(len).getOrDefault(candi.toString(), 0) +1;
				maps.get(len).put(candi.toString(), cnt);
				MaxCnt[len] = Math.max(MaxCnt[len], cnt);
			}
			return;
		}
		
		comb(str, pos+1, candi.append(str[pos])); // ���ڸ� �Ѵܾ �ø��鼭 ����
		candi.setLength(candi.length()-1); // �����ߴ� ���ڸ� ����
		comb(str, pos+1, candi); // �ٽ� ���ȣ��
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
