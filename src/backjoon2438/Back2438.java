package backjoon2438;

import java.util.Scanner;

public class Back2438 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n>=1 || n<=100) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		sc.close();
	}

}
