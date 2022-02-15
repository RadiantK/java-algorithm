package secretMap17681;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] answer = new String[n];
		// 두 정수배열을 or 비트 연산을 해준다. 
		for(int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); 
			// answer[i]의 길이가 n보다 짧으면 길이만큼 0을 앞에 추가해준다.
			if(answer[i].length() < n) {
				for(int j = answer[i].length(); j < n; j++) {
					answer[i] = "0" + answer[i];
				}
			}
		}
		// 숫자 1은 #으로 0은 공백으로 치환
		for(int i = 0; i < n; i++) {
			answer[i] = answer[i].replace("1", "#");
			answer[i] = answer[i].replace("0", " ");
		}
		
		return answer;
    }
}

public class SecretMap {

	public static void main(String[] args) {

		Solution s = new Solution();
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
		
		int[] arr3 = {46, 33, 33 ,22, 31, 50};
		int[] arr4 = {27 ,56, 19, 14, 14, 10};
		
		System.out.println(Arrays.toString(s.solution(6, arr3, arr4)));
	}

}
