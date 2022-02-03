package arrayBorderRotate77485;

import java.util.Arrays;

class Solution {	
	static int[][] arr;
	
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];     
        arr = new int[rows][columns];

        int n = 1;
        for(int i = 0; i < rows; i++) {
        	for(int j = 0; j < columns; j++) {
        		arr[i][j] = n++;
        	}
        }
        
        for(int i = 0; i < queries.length; i++) {
        	answer[i] = rotate(queries[i]);
        }

        return answer;
    }
    public int rotate(int[] array) {
    	// queries�迭�� ���� -1���ؼ� ���� index�� 0���� �����ϹǷ�
    	int x1 = array[0]-1;
    	int y1 = array[1]-1;
    	int x2 = array[2]-1;
    	int y2 = array[3]-1;
    	
    	// �迭 �ʱⰪ �ӽ�����
    	int temp = arr[x1][y2];
    	int min = temp;
    	// ���� >> �� �� ĭ�� �̵�
    	for(int i = y2; i > y1; i--) {
    		arr[x1][i] = arr[x1][i-1];
    		min = min > arr[x1][i] ? arr[x1][i] : min;
    	}
    	// �޿� �� ĭ�� ���� �̵�
    	for(int i = x1; i < x2; i++) {
    		arr[i][y1] = arr[i+1][y1];
    		min = min > arr[i][y1] ? arr[i][y1] : min;
    	}
    	// ���� << �� �� ĭ�� �̵�
    	for(int i = y1; i < y2; i++) {
    		arr[x2][i] = arr[x2][i+1];
    		min = min > arr[x2][i] ? arr[x2][i] : min;
    	}
    	// ������ �Ʒ��� �� ĭ�� �̵�
    	for(int i = x2; i > x1; i--) {
    		arr[i][y2] = arr[i-1][y2];
    		min = min > arr[i][y2] ? arr[i][y2] : min;
    	}
    	// �ӽ� �����Ѱ��� �־���
    	arr[x1+1][y2] = temp;
    	return min;
    }
}

public class ArrayBorderRotate {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] q = {
				{2,2,5,4},
				{3,3,6,6},
				{5,1,6,3}
		};
		System.out.println(Arrays.toString(s.solution(6, 6, q)));	
	}

}
