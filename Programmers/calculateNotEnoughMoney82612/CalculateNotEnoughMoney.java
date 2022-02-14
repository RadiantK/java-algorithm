package calculateNotEnoughMoney82612;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i = 1; i <= count; i++) {
        	answer += price * i;
        }
        
        if(money > answer) return 0;
        return answer - money;
    }
}

public class CalculateNotEnoughMoney {

	// 부족한 금액 계산
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(s.solution(price, money, count));
	}

}
