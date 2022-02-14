package jumpAndteleport12980;

class Solution {
	// 점프와 순간이동
    public int solution(int n) {
        int answer = 0;
        // N이 짝수일때는 순간이동으로 갈 수 있기 때문에 2로 나누고
        // 홀수일때는 n값을 1빼서 짝수로 만들고 n이 0이될때까지 반복
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
	// 2진수로 변환한 뒤 1의 개수가 결과가 됨
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
