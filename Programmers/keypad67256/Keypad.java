package keypad;

class Solution {
	
    public String solution(int[] numbers, String hand) {
    	
    	StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        
        for(int num : numbers) {
        	if (num == 0) {
        		num = 11;
        	}
        	if(num % 3 == 0) {
        		sb.append("R");
        		right = num;
        	} else if (num % 3 == 1) {
        		sb.append("L");
        		left = num;
        	} else {
        		// 현재 번호의 위치에서 누를 번호의 거리구하기
        		int dis_right = (Math.abs(right - num))/3 + (Math.abs(right - num))%3;
        		int dis_left = (Math.abs(left - num))/3 + (Math.abs(left - num))%3;
        		if(dis_right < dis_left) {
        			sb.append("R");
        			right = num;
        		} else if(dis_right > dis_left) {
        			sb.append("L");
        			left = num;
        		} else {
        			if(hand.equals("right")) {
        				sb.append("R");
        				right = num;
        			} else {
        				sb.append("L");
        				left = num;
        			}
        		}
        	}
        }
        return sb.toString();
    }
}

public class Keypad {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(s.solution(numbers, hand));
	}

}
