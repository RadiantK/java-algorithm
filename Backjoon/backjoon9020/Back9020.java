package backjoon9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back9020 {

	private static boolean[] prime = new boolean[10001];
	// 골드바흐의 추측(기본수학2)
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		isPrime();
		for (int i=0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int first = n / 2;
			int second = n / 2;
			
			while(true) {
				// 두 수가 소수이면 반복문을 나감
				if(prime[first] == false && prime[second] == false) { 
					break;
				} else {
					first--;
					second++;
				}
			}
			System.out.println(first+" "+second);
		}
		br.close();
	}
	
	public static boolean isPrime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue;
			}
			for(int j = i*i; j < prime.length; j +=i) {
				prime[j] = true;
			}
		}
		return false;
	}	
}
