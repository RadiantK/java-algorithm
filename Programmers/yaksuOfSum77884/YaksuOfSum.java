package yaksuOfSum77884;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				// ����� ���� üũ
				if(i % j == 0) {
					count++;
				}
			}
			// ����� ������ ¦���̸� i���� ����
			if(count % 2 == 0) {
				answer += i;
			}
			// ����� ������ Ȧ���̸� i���� ��
			else {
				answer -= i;
			}
		}
        return answer;
    }
}

public class YaksuOfSum {
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int left = 13;
		int right = 17;
		
		System.out.print(s.solution(left, right));
	}
}
