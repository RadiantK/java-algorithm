package backjoon2908;

import java.util.Scanner;

public class Back2908 {

	// �μ��� ���ڿ��� ������ �Ųٷ� ������ �� ū�� ���
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
