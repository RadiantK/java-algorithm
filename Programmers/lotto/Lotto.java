package lotto;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0; // 0이 몇개인지 카운트
        int match = 0; // 나머지 일치하는 숫자를 카운트
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++; // 내 로또번호에서 지워진 번호를 카운트
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    match++; // 내 번호와 추첨번호의 일치번호를 카운트
                    break;
                }
            }        
        }
        
        int sum = match + zero; 
        
        int[] answer = {7 - Math.max(sum, 1), 7 - Math.max(match, 1)};
        return answer;
    }
}


class Solution2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
            }
            for (int win : win_nums) {
                if (win == lotto) {
                    match++;
                    break;
                }
            }        
        }
        
        int sum = match + zero;
        
        int[] answer = {7 - Math.max(sum, 1), 7 - Math.max(match, 1)};
        return answer;
    }
}

class Solution3 {
    public int[] solution(int[] lottos, int[] win_nums) {
        
    	int[] answer = {0, 0};
        int zero = 0;

        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
            	zero++;
            }
        }
        
        for(int j = 0; j < 6; j++) {
            for(int k = 0; k < 6; k++) {
                if(win_nums[j] == lottos[k]) {
                	answer[0]++;
                    answer[1]++;
                }
            }
        }

        answer[0] += zero; // 지워진 두 숫자가 맞을 경우

        for(int i = 0; i < 2; i++) {
            if(answer[i] == 6) {
            	answer[i] = 1;
            }
            else if(answer[i] == 5) {
            	answer[i] = 2;
            }
            else if(answer[i] == 4) {
            	answer[i] = 3;
            }
            else if(answer[i] == 3) {
            	answer[i] = 4;
            }
            else if(answer[i] == 2) {
            	answer[i] = 5;
            }
            else {
            	answer[i] = 6;
            }
        }

        return answer;
    }
}

public class Lotto {

	public static void main(String[] args) {

		Solution sol = new Solution();
		Solution sol2 = new Solution();
		
		int[] a = {1, 10, 0, 0, 7, 8};
		int[] b = {31, 10, 45, 1, 6, 19};
		
		System.out.println(Arrays.toString(sol.solution(a, b)));
		System.out.println(Arrays.toString(sol2.solution(a, b)));
	}

}
