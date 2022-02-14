package jumpAndteleport12980;

class Solution {
	// ������ �����̵�
    public int solution(int n) {
        int answer = 0;
        // N�� ¦���϶��� �����̵����� �� �� �ֱ� ������ 2�� ������
        // Ȧ���϶��� n���� 1���� ¦���� ����� n�� 0�̵ɶ����� �ݺ�
        while(n > 0) {
        	if(n % 2 == 0) {
        		n = n / 2;
        	} else {
        		n--;
        		answer++;
        	}
        }
        
        return answer;
    }
}

class Solution2 {
	// 2������ ��ȯ�� �� 1�� ������ ����� ��
    public int solution(int n) {
    	int answer = 0;
        String s = Integer.toBinaryString(n);
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '1') answer++;
        }
        
        return answer;
    }
}

public class JumpAndTeleport {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(5000));
	}

}
