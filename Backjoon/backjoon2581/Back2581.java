package backjoon2581;

import java.util.Scanner;

public class Back2581 {

	// 범위안의 소수의 합, 최솟값
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int min = 10000;
		int sum = 0;
		
		x : for(int i = m; i <= n; i++) {
			
			if(i == 1) {
				continue;
			}
			for(int j = 2; j < i; j++){
				if(i % j == 0) { // 0으로 나누어 떨어지면 소수가 아니므로 x로 돌아감
					continue x;
				}
			}		
			sum += i; // 소수이면 값을 더해줌
			if(i < min) { // 최소값 저장
				min = i;
			}	
		}
		if(sum == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum + "\n" + min);
	}

}
