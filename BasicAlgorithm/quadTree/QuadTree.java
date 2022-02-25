package quadTree;

import java.util.*;

public class QuadTree {
	public static int[][] board;
	public static int one = 0;
	public static int zero = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		board = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		quadTree(0, 0, n);
		
		System.out.println("1의 개수 : " + one + " / " + "0의 개수 : " + zero);
	}
	public static void quadTree(int row, int col, int size) {
		
		if(check(row, col, size)) {
			if(board[row][col] == 0) {
				zero++;
			} else {
				one++;
			}
			return;
		}
		// 사이즈의 절반
		int divSize = size / 2;
		
		quadTree(row, col, divSize);
		quadTree(row, col + divSize, divSize);
		quadTree(row + divSize, col, divSize);
		quadTree(row + divSize, col + divSize, divSize);
	}

	public static boolean check(int row, int col, int size) {
		// 기준이 될 첫 번째 원소를 임시값으로 지정
		int temp = board[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				// 숫자가 같지 않으면 false
				if(board[i][j] != temp) {
					return false;
				}
			}
		}
		// 검사를 모두 통과하면 true
		return true;
	}
}
