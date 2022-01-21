package backjoon2908;

import java.util.Scanner;

public class Back2908 {

	// 두수를 문자열로 받은뒤 거꾸로 뒤집은 후 큰값 출력
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		String s = sc.nextLine();

		sb.append(s).reverse();
		
		String[] str = sb.toString().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		int max = a > b ? a: b;
		
		System.out.println(max);
		sc.close();
	}

}
