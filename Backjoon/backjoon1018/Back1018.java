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
		
		boolean init = arr[x][y]; // ù ��° ĭ�� ����
		
		for(int i = x; i < end_x; i++) {
			
			for(int j = y; j < end_y; j++) {
				
				if(arr[i][j] != init) {
					count++;
				}
				// ���� ĭ�� ���� �޶���ϹǷ� �ݴ�� �ٲ���
				init = !init;
			}
			init = !init;
		}
		
		// ù ��° ĭ�� �������� �� ���� ��ĥ �� ����(count)��
		// ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ����
		// ��ĥ �� ����(64 - count) �� �ּڰ��� count �� ���� 		
		count = Math.min(count, 64 - count);
		
		// ���������� ��� �� �ּڰ����� ���� count���� �� ���� ��� �ּڰ� ����
		min = Math.min(min , count);
	}
}
