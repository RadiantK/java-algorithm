package backjoon2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				// i값의 1의 자리를 다 더함
				sum += num % 10;
				num = num / 10;
			}
			
			// i값과 각 자리수의 합이 n과 같을 때 탈출
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
