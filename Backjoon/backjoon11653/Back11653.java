package backjoon11653;

import java.util.Scanner;

public class Back11653 {

	// 소인수분해
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int i = 2;
		while(n >= i) {
			if(n % i == 0) { // 2로 나누어 떨어지는지 확인
				n = n / i; // 나누어 떨어지면 나눈 몫 출력
				System.out.println(i);
			}
			else { // 2로 나누어 떨어지지않으면 i값을 +증가시켜서 다시 계산
				i++;
			}
		}
	}
}
