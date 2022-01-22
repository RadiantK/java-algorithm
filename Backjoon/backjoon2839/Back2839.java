package backjoon2839;

import java.util.Scanner;

public class Back2839 {

	// 설탕배달
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 물건 kg 수
		int count = 0;
		
		while(true) {
			if(n % 5 == 0) { // 5로 나누어 떨어지는 수 확인
				System.out.println(n / 5 + count);
				break;
			} else if (n < 2) {
				System.out.println(-1);
				break;
			}
			n = n - 3; // 나누어 떨어지지않으면 3kg씩 빼면서 3g봉지 개수 올림
			count++;
		}		
		sc.close();
		
	}
}
