package yaksuOfSum77884;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				// 약수의 개수 체크
				if(i % j == 0) {
					count++;
				}
			}
			// 약수의 개수가 짝수이면 i값을 더함
			if(count % 2 == 0) {
				answer += i;
			}
			// 약수의 개수가 홀수이면 i값을 뺌
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
