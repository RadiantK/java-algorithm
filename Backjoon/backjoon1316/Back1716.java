package backjoon1316;

import java.util.Scanner;

public class Back1716 {

	// 손익분기점
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 불변비용
		int b = sc.nextInt(); // 가변비용
		int c = sc.nextInt(); // 노트북가격
		
		if ( c <= b) { // 노트북 값이 가변비용보다 적으면 적자남
			System.out.println("-1");
		} else {
			System.out.println((a/(c-b))+1);
		}
		sc.close();
	}
}
