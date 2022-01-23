package backjoon1978;

import java.util.Scanner;

public class Back1978 {

	// 소수 찾기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			boolean isPrime = true;
			
			if(num == 1) {
				continue;
			}
			for(int j=2; j<num; j++) {
				// num이 1을 제외한 자신미만의 숫자로 나누어 떨어지면 소수가 아님
				if(num % j == 0) { 
					isPrime = false;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
