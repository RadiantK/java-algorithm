package backjoon11653;

import java.util.Scanner;

public class Back11653 {

	// ���μ�����
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int i = 2;
		while(n >= i) {
			if(n % i == 0) { // 2�� ������ ���������� Ȯ��
				n = n / i; // ������ �������� ���� �� ���
				System.out.println(i);
			}
			else { // 2�� ������ �������������� i���� +�������Ѽ� �ٽ� ���
				i++;
			}
		}
	}
}
