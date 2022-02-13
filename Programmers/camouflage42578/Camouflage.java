package camouflage42578;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;  
        Map<String, Integer> map = new HashMap<>();
        
        // ������ ����� ���� ����
        for(int i = 0; i < clothes.length; i++) {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        System.out.println(map);
        // �ǻ��� ���� + �������� �ʴ� ����� ���� �ֱ� ������ +1 ���ؼ� �� ���ϸ� ��� ����� ��
        for(String key : map.keySet()) {
        	answer *= (map.get(key)+1);
        }
        // �ƹ��͵� ���� �ʴ� ��츦 ���ܽ��Ѿ� �ϱ� ������ -1
        answer -= 1;
        return answer;
    }
}

public class Camouflage {
	
	public static void main(String[] args) {

		Solution s = new Solution();
		
		String[][] clothes = {
				{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"},
				{"green_turban", "headgear"}
		};
		
		System.out.println(s.solution(clothes));
	}

}