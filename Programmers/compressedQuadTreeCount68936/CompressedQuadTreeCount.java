package compressedQuadTreeCount68936;

import java.util.Arrays;

class Solution {
	int zero = 0;
	int one = 0;
	
    public int[] solution(int[][] arr) {
        int size = arr.length;
        quadTree(0, 0, size, arr);

        return new int[] {zero, one};
    }
    void quadTree(int row, int col, int size, int[][] arr) {
    	// 압축 확인한것이 참이면 조건문 수행
    	if(check(row, col, size, arr)) {
    		if(arr[row][col] == 0) {
    			zero++;
    		} else {
    			one++;
    		}
    		return;
    	}
    	// 사이즈를 반으로 나누고 다시 검사
    	int divSize = size / 2;
    	
    	quadTree(row, col, divSize, arr);
    	quadTree(row, col + divSize, divSize, arr);
    	quadTree(row + divSize, col, divSize, arr);
    	quadTree(row + divSize, col + divSize, divSize, arr);
    }
    
    boolean check(int row, int col, int size, int[][] arr) {
    	int temp = arr[row][col]; // 기준 값
    	
    	for(int i = row; i < row + size; i++) {
    		for(int j = col; j < col + size; j++) {
    			if(arr[i][j] != temp) { // 기준값과 다르면 압축할 수 없음
    				return false;
    			}
    		}
    	}
    	return true;
    }
}

class Solution2 {
	int zero;
	int one;
	
    public int[] solution(int[][] arr) {
    	int size = arr.length;
    	quadTree(0, 0, size, arr);
    	
        return new int[] {zero, one};
    }
    void quadTree(int row, int col, int size, int[][] arr) {
    	if(check(row, col, size, arr)) {
    		if(arr[row][col] == 0) zero++;
    		else one++;
    		return;
    	}
    	
    	int divSize = size / 2;
    	
    	quadTree(row, col, divSize, arr);
    	quadTree(row, col + divSize, divSize, arr);
    	quadTree(row + divSize, col, divSize, arr);
    	quadTree(row + divSize, col + divSize, divSize, arr);
    }
    
	private boolean check(int row, int col, int size, int[][] arr) {
		int temp = arr[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				if(arr[i][j] != temp) return false;
			}
		}
		return true;
	}
}

public class CompressedQuadTreeCount {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[][] arr = {
				{1,1,1,1,1,1,1,1},
				{0,1,1,1,1,1,1,1},
				{0,0,0,0,1,1,1,1},
				{0,1,0,0,1,1,1,1},
				{0,0,0,0,0,0,1,1},
				{0,0,0,0,0,0,0,1},
				{0,0,0,0,1,0,0,1},
				{0,0,0,0,1,1,1,1}
				};
		System.out.println(Arrays.toString(s.solution(arr)));
	}

}
