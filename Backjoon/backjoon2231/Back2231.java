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
				// i���� 1�� �ڸ��� �� ����
				sum += num % 10;
				num = num / 10;
			}
			
			// i���� �� �ڸ����� ���� n�� ���� �� Ż��
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
