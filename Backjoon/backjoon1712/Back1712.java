package backjoon1316;

import java.util.Scanner;

public class Back1716 {

	// ���ͺб���
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // �Һ����
		int b = sc.nextInt(); // �������
		int c = sc.nextInt(); // ��Ʈ�ϰ���
		
		if ( c <= b) { // ��Ʈ�� ���� ������뺸�� ������ ���ڳ�
			System.out.println("-1");
		} else {
			System.out.println((a/(c-b))+1);
		}
		sc.close();
	}
}
