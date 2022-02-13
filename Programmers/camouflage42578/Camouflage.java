package camouflage42578;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;  
        Map<String, Integer> map = new HashMap<>();
        
        // 종류의 경우의 수를 구함
        for(int i = 0; i < clothes.length; i++) {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        System.out.println(map);
        // 의상의 종류 + 착용하지 않는 경우의 수가 있기 때문에 +1 을해서 다 곱하면 모든 경우의 수
        for(String key : map.keySet()) {
        	answer *= (map.get(key)+1);
        }
        // 아무것도 입지 않는 경우를 제외시켜야 하기 때문에 -1
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