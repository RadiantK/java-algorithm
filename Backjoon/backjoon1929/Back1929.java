package backjoon1929;

import java.util.Scanner;

public class Back1929 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		// n이하까지 구하기 위해서 크기를 n+1로 해줌
		prime = new boolean[n+1];
		isPrime();
		
		for(int i = m; i <= n; i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue; // 중복된 true값은 소수가 아님으로 건너뜀
			}
			for (int j = i * i; j < prime.length; j = j+i) {
				prime[j] = true; //소수가 아닌 수
			}
		}
		return false;
	}

}
