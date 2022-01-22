package backjoon2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2775 {

	// 부녀회장이 될 테야
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		
		for(int i = 0; i<arr.length; i++) {
			arr[0][i] = i; // 0층 i호까지 초기값 지정 0~14
			arr[i][1] = 1; // i층 1호 값 1로 고정 (0호는 사람 없음)
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 2; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j];
			}
		}
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine()); // 층수
			int n = Integer.parseInt(br.readLine()); // 호수
			
			System.out.println(arr[k][n]);
		}
		br.close();
	}

}

