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

	// n�� x�� ���� �������� 1�̵ǵ��� �ϴ� ���� ���� �ڿ���
	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(12));
	}

}
