package backjoon1065;

import java.util.Scanner;

public class Back1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(hansu(sc.nextInt()));
		sc.close();
	}

	public static int hansu(int num) {
		int count;
		
		if(num<=99) {
			return num; // 1~99까진 전부 한수이기때문에 그대로 리턴
		}
		else {
			count = 99; // 100이상의 숫자는 한수가 최소 99개
			if(num == 1000) { // 1000보다 큰수는 받지않음
				num = 999;
			}
			for(int i=100; i<=num; i++) {
				int bak = i / 100; // 백의자리
				int ten = (i / 10) % 10; // 십의자리
				int ill = i % 10 ; // 일의자리
				
				if((bak - ten) == (ten - ill)) {
					count++;
				}
			}
		}
		return count;
	}
}
