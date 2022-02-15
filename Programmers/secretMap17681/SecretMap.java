package secretMap17681;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] answer = new String[n];
		// �� �����迭�� or ��Ʈ ������ ���ش�. 
		for(int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); 
			// answer[i]�� ���̰� n���� ª���� ���̸�ŭ 0�� �տ� �߰����ش�.
			if(answer[i].length() < n) {
				for(int j = answer[i].length(); j < n; j++) {
					answer[i] = "0" + answer[i];
				}
			}
		}
		// ���� 1�� #���� 0�� �������� ġȯ
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
