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
		// 카드 세 장을 고를 반복문
		for(int i = 0; i < n-2; i++) { // 세장을 고르기 때문에 n개의 카드중 -2번째 까지
			
			for(int j = i+1; j < n-1; j++) { // 두 번째장은 n개의 카드중 -1번째 까지
				
				for(int k = j+1; k < n; k++) { // 세 번째 장은 마지막 까지
					
					int sum = arr[i] + arr[j] + arr[k];
					
					if(sum == m) {
						return sum;
					}
					// 세 카드의 합이 이전 합보다 크면서 m보다 작으면 갱신
					if(result < sum && sum < m) {
						result = sum;
					}
				}
			}
		}
		return result;
	}

}
