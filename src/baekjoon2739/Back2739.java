package baekjoon2739;

import java.util.Scanner;

public class Back2739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result = 0;
	
	
		for(int j=1; j < 10; j++) {
			result = N*j;
			System.out.println(N + " * " + j + " = " + result);
		}		
		
		sc.close();
	}

}
