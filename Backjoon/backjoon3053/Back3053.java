package backjoon3053;

import java.util.Scanner;

public class Back3053 {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble(); // ������ �Է�
		sc.close();
		
		double area_1 = r * r * Math.PI; // ��Ŭ���� ���� ����
		double area_2 = 2 * r * r; // �ý� ������ ���� ����
		
		System.out.println(area_1 + "\n" + area_2);
	}
}
