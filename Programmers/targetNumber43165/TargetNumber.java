package targetNumber43165;

class Solution {
	
	static int cnt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        // dfs ��� �Լ� ȣ��
        dfs(numbers, target, 0, 0);
        answer = cnt;
        return answer;
    }
    public void dfs(int[] numbers, int target, int depth, int temp) {
    	if(depth == numbers.length) {
    		if(target == temp) {
    			cnt++;
    		}
    		return;
    	}
    	// numbers�迭�� 0�� �ε������� �ϳ����ø��鼭 +, -�϶��� ���� Ž��
		dfs(numbers, target, depth + 1, temp + numbers[depth]);
    	dfs(numbers, target, depth + 1, temp - numbers[depth]);
    }
}

public class TargetNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[] numbers = {1, 1, 1, 1, 1};
		
		System.out.println(s.solution(numbers, 3));
	}

}