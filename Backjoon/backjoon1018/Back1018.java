package backjoon1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1018 {

	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		int size_n = n - 7;
		int size_m = m - 7;
		
		for(int i = 0; i < size_n; i++) {
			for(int j = 0; j < size_m; j++) {
				search(i, j);
			}
		}
		System.out.println(min);
	}
	
	public static void search(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean init = arr[x][y]; // 첫 번째 칸의 색깔
		
		for(int i = x; i < end_x; i++) {
			
			for(int j = y; j < end_y; j++) {
				
				if(arr[i][j] != init) {
					count++;
				}
				// 다음 칸의 색은 달라야하므로 반대로 바꿔줌
				init = !init;
			}
			init = !init;
		}
		
		// 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		// 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		// 색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 		
		count = Math.min(count, 64 - count);
		
		// 이전까지의 경우 중 최솟값보다 현재 count값이 더 작을 경우 최솟값 갱신
		min = Math.min(min , count);
	}
}
