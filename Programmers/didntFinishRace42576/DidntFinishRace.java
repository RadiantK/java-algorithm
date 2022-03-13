package didntFinishRace42576;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
	// �������� ���� ����
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        // �������� �̸��� key���� value�� +1���� �־��� / ���������� �Ѹ�� 1�� �ø�
		for(int i = 0; i < participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0)+1);			
		}
		// ������ �������� value���� -1������
		for(int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i])-1);
		}
		// value���� 1�� ������ ���ָ� ���Ѽ����̱⶧���� Ű���� answer�� ����
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				answer = key;
				break;
			}
		}

        return answer;       
    }
}

class Solution2 { 
	
	public String solution2(String[] participant, String[] completion) { 

		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i = 0; i < completion.length; i++){
			if(!participant[i].equals(completion[i])){			
				return participant[i]; 
			} 
		} 
		
		return participant[i]; 
		} 
}


public class DidntFinishRace {

	public static void main(String[] args) {

		Solution s = new Solution();
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c = {"mislav", "stanko", "mislav", "ana"};
		
		String[] a1 = {"eden", "kiki"};
		String[] b1 = {"josipa", "filipa", "marina", "nikola"};
		String[] c1 = {"stanko", "ana", "mislav"};
		
		System.out.println(s.solution(a, a1));
		System.out.println(s.solution(b, b1));
		System.out.println(s.solution(c, c1));
		
		
		
	}

}
