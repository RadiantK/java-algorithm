package nSquareArrayCutting87390;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        // 일반 2차원 배열은 long은 string, int 등을 사용할 수 없기때문에 시간초과나 에러가 남
        // 행과 열을 구해준 뒤 행 열 중 최대값이 결과값이 됨
        for(int i = 0; i < answer.length; i++) {
        	int row = (int)((i + left) / n) + 1;
        	int col = (int)((i + left) % n) + 1;
        	
        	answer[i] = row > col ? row : col;
        }
        return answer;
    }
}

class Solution2 {
	// 시간초과 ....
    public int[] solution(int n, long left, long right) {
    	// n*n 2차원 배열 생성
		int[][] a = new int[n][n];
		String temp = "";
		// 값 초기화
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				a[i][j] = i+1;
			}
			for(int j = 0; j <= i; j++) {
				a[j][i] = i+1;
			}
		}
		
		// temp에 2차원배열의 값을 넣어줌
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				temp += a[i][j];
			}
		}
		int l = (int) left;
		int r = (int) right;
		temp = temp.substring(l, r+1);
		int[] answer = new int[temp.length()];
		
		for(int i = 0; i < temp.length(); i++) {
			answer[i] = temp.charAt(i) - '0';
		}
        return answer;
    }
}

public class NSquareArrayCutting {

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(4, 7, 14)));
		System.out.print(0%2);
	}

}
