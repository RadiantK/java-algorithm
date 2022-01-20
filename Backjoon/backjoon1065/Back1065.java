package backjoon1065;

import java.util.Scanner;

public class Back1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(hansu(sc.nextInt()));
		sc.close();
	}

	public static int hansu(int num) {
		int count;
		
		if(num<=99) {
			return num; // 1~99���� ���� �Ѽ��̱⶧���� �״�� ����
		}
		else {
			count = 99; // 100�̻��� ���ڴ� �Ѽ��� �ּ� 99��
			if(num == 1000) { // 1000���� ū���� ��������
				num = 999;
			}
			for(int i=100; i<=num; i++) {
				int bak = i / 100; // �����ڸ�
				int ten = (i / 10) % 10; // �����ڸ�
				int ill = i % 10 ; // �����ڸ�
				
				if((bak - ten) == (ten - ill)) {
					count++;
				}
			}
		}
		return count;
	}
}
