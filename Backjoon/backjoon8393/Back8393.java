package backjoon8393;

import java.util.Scanner;

public class Back8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n>=1 && n<=10000) {
			int total = 0;
			for (int i = 0; i <= n; i++) {
				total += i;
			}
			System.out.println(total);		
		}
		sc.close();
	}
}
