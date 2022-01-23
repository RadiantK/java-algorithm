package backjoon4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back4948 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) { // 0이면 종료
				br.close();
				break;
			}
			
			boolean[] prime = new boolean[(2*n)+1];
			prime[0] = prime[1] = true;
			int count = 0;
			
			for(int i = 2; i <= Math.sqrt(prime.length); i++) {
				if(prime[i] == true) {
					continue;
				}
				for(int j = i*i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
			
			for(int i = n+1; i <= (2 * n); i++) {
				if(prime[i] == false) { // 소수이면 카운트 올림
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
