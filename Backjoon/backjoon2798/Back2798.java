package backjoon2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = cardSearch(arr, n, m);
		System.out.println(result);
		br.close();
		
	}
	public static int cardSearch(int[] arr, int n, int m) {
		int result = -1;
		// ī�� �� ���� �� �ݺ���
		for(int i = 0; i < n-2; i++) { // ������ ���� ������ n���� ī���� -2��° ����
			
			for(int j = i+1; j < n-1; j++) { // �� ��°���� n���� ī���� -1��° ����
				
				for(int k = j+1; k < n; k++) { // �� ��° ���� ������ ����
					
					int sum = arr[i] + arr[j] + arr[k];
					
					if(sum == m) {
						return sum;
					}
					// �� ī���� ���� ���� �պ��� ũ�鼭 m���� ������ ����
					if(result < sum && sum < m) {
						result = sum;
					}
				}
			}
		}
		return result;
	}

}
