package targetNumber43165;

class Solution {
	
	static int cnt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        // dfs 재귀 함수 호출
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
    	// numbers배열의 0번 인덱스부터 하나씩올리면서 +, -일때의 값을 탐색
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