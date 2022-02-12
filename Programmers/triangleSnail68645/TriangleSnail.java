package triangleSnail68645;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        // �ﰢ�� �迭�� ���� ����Ʈ
        List<Integer> list = new ArrayList<>();
		
		int[][] arr = new int[n][n];
		
		int k = n; // �迭�� �������� 1�� ���ҽ�ų ��
		int t = 0; // ���� 1�� ������ų ����
		int row = -1; // ��
		int col = 0; // ��
		int s = 1; // ��� ���� 1�� ����, ���� ��ų����
		
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
			s = s * (-1); // ��ȣ�� ��������
			
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
		
		int k = n; // �迭�� �������� 1�� ���ҽ�ų ��
		int t = 0; // ���� 1�� ������ų ����
		int row = -1; // ��
		int col = 0; // ��
		int s = 1; // ��� ���� 1�� ����, ���� ��ų����
		
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
			s = s * (-1); // ��ȣ�� ��������
			
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
