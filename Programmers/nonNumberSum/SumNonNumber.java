package nonNumberSum;

class Solution {
    public int solution(int[] numbers) {
        // 없는 숫자를 알아낼 배열
        boolean[] check = new boolean[10];
		for (int num : numbers) {
			// 있는 숫자들은 true
			check[num] = true;
		}
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			// 없는 숫자들의 합을 구해줌
			if(!check[i]) {
				sum += i;
			}
		}
        
        return sum;
    }
}

public class SumNonNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
		
		System.out.print(s.solution(numbers));
	}

}
