package backjoon10870;

import java.util.Scanner;

public class Back10870 {

	// 피보나치 수 5
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();

		System.out.println(fibonacci(n));
	}
	public static int fibonacci(int n) {
		
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
