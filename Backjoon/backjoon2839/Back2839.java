package backjoon2839;

import java.util.Scanner;

public class Back2839 {

	// �������
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ���� kg ��
		int count = 0;
		
		while(true) {
			if(n % 5 == 0) { // 5�� ������ �������� �� Ȯ��
				System.out.println(n / 5 + count);
				break;
			} else if (n < 2) {
				System.out.println(-1);
				break;
			}
			n = n - 3; // ������ �������������� 3kg�� ���鼭 3g���� ���� �ø�
			count++;
		}		
		sc.close();
		
	}
}
