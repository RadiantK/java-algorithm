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
		
		System.out.println("1�� ���� : " + one + " / " + "0�� ���� : " + zero);
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
		// �������� ����
		int divSize = size / 2;
		
		quadTree(row, col, divSize);
		quadTree(row, col + divSize, divSize);
		quadTree(row + divSize, col, divSize);
		quadTree(row + divSize, col + divSize, divSize);
	}

	public static boolean check(int row, int col, int size) {
		// ������ �� ù ��° ���Ҹ� �ӽð����� ����
		int temp = board[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				// ���ڰ� ���� ������ false
				if(board[i][j] != temp) {
					return false;
				}
			}
		}
		// �˻縦 ��� ����ϸ� true
		return true;
	}
}
