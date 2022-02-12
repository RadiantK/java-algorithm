package triangleSnail68645;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 삼각형 배열을 담을 리스트
        List<Integer> list = new ArrayList<>();
		
		int[][] arr = new int[n][n];
		
		int k = n; // 배열의 범위부터 1씩 감소시킬 수
		int t = 0; // 수를 1씩 증가시킬 변수
		int row = -1; // 행
		int col = 0; // 열
		int s = 1; // 행과 열을 1씩 증가, 감소 시킬변수
		
		while(k > 0) {
			for(int j = 0; j < k; j++) {
				t = t + 1;
				row = row + s;
				arr[row][col] = t;
			}
			k--;
			
			for(int j = 0; j < k; j++) {
				t = t + 1;
				col = col + s;
				arr[row][col] = t;
			}
			k--;
			s = s * (-1); // 부호를 변경해줌
			
			for(int j = 0; j < k; j++) {
				t = t + 1;
				row = row + s;
				col = col + s;
				arr[row][col] = t;
			}
			k--;
			s = s * (-1);
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(!(arr[i][j] == 0)) {
					list.add(arr[i][j]);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}

public class TriangleSnail {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int n = 6;
		System.out.println(Arrays.toString(sol.solution(n)));
		
		int[][] arr = new int[n][n];
		
		int k = n; // 배열의 범위부터 1씩 감소시킬 수
		int t = 0; // 수를 1씩 증가시킬 변수
		int row = -1; // 행
		int col = 0; // 열
		int s = 1; // 행과 열을 1씩 증가, 감소 시킬변수
		
		while(k > 0) {
			for(int j = 0; j < k; j++) {
				t = t + 1;
				row = row + s;
				arr[row][col] = t;
			}
			k--;
			
			for(int j = 0; j < k; j++) {
				t = t + 1;
				col = col + s;
				arr[row][col] = t;
			}
			k--;
			s = s * (-1); // 부호를 변경해줌
			
			for(int j = 0; j < k; j++) {
				t = t + 1;
				row = row + s;
				col = col + s;
				arr[row][col] = t;
			}
			k--;
			s = s * (-1);
		}

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(!(arr[i][j] == 0)) {
					list.add(arr[i][j]);
				}
			}
		}
		
//		System.out.println(list);
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				System.out.printf("%3d", arr[i][j]);
//			}
//			System.out.println();
//		}
	}

}
