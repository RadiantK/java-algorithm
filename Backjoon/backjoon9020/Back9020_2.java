package backjoon9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back9020_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int first = n / 2;
			int second = n / 2;
			
			while(true) {
				if(isPrime(first) == true && isPrime(second) == true) {
					sb.append(first + " " + second).append("\n");
					break;
				} else {
					first--;
					second++;
				}
			}			
		}
		System.out.print(sb);
		br.close();
	}
	
	private static boolean isPrime(int num) {

		
		for(int i =2; i <= Math.sqrt(num); i++) {
			if (num == 1) {
				continue;
			}
			if(num % i == 0) { // num이 i값으로 나누어 떨어지면 소수가 아님
				return false;
			}
		}
		return true;
	}
}