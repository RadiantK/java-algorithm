package restOne87389;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

public class RestOne {

	// n을 x로 나눈 나머지가 1이되도록 하는 가장 작은 자연수
	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(12));
	}

}
