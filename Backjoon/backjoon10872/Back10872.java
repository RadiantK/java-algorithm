package backjoon10872;

import java.util.Scanner;

public class Back10872 {

	// ����Լ� ���丮��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return n *= factorial(n-1);
	}

}
