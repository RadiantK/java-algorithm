package backjoon11022;

import java.util.Scanner;

public class Back11022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		if ((a>0 || a<10) || (b>0 || b<10)) {
			for(int i=1; i<=t; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				int result = a+b;
				System.out.println("Case #"+i+": "+ a + " + " + b + " = " + result);
			}
		}
		sc.close();
	}

}
