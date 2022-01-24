package backjoon2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2447 {

	public static char[][] arr;
	// 별찍기 (재귀함수)
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		arr = new char[n][n];
		
		// 배열 공백으로 초기화
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = ' ';
			}
		}
		
		star(0, 0, n);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
	public static void star(int x, int y, int n) {
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				// arr[1][1] 일때는 공백이므로 제외
				if(!(i == 1 && j == 1)) {
					// 재귀함수를 통해 나누다가 몫이 1이 될 때 별 찍기 실행
					star(x + i * (n / 3), y + j * (n / 3), n / 3);
				}
			}
		}
	}
}