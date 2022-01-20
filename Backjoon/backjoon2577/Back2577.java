package backjoon2577;

import java.util.Scanner;

public class Back2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		
//		int[] count = new int[10];
//		String str = String.valueOf(a*b*c);
//		
//		for(int i=0;i<str.length(); ++i) {
//			count[str.charAt(i) - '0']++;
//		}
//			
//		for(int i=0; i<count.length; ++i) {
//			System.out.println(count[i]);
//		}
		
		int mul = a * b * c;
		int[] count = new int[10];
		System.out.println(mul);
		while(mul > 0) {
			count[mul % 10]++;
			mul /= 10;
		}
			
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
