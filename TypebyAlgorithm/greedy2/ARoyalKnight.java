package greedy2;

import java.util.Scanner;

public class ARoyalKnight {

	// 나이트의 이동경로
	static int[] dx = {-2, -2, -1, -1,  2, 2,  1, 1};
	static int[] dy = {-1,  1, -2,  2, -1, 1, -2, 2};
	
	public static void main(String[] args) {

		// 체스판은 8 * 8 열 a~h 행 0~7
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		sc.close();
		
		int row = s.charAt(1) - '0';
		int col = s.charAt(0) - 'a' +1;
			
		int result = 0;
		for(int i = 0; i < 8; i++) {
			// 위치 확인
			int nRow = row + dx[i];
			int nCol = col + dy[i];
			
			if(nRow < 1 || nRow > 8 || nCol < 1 || nCol > 8 ) continue;
			
				result++;
		}
		System.out.println(result);
	}

}
