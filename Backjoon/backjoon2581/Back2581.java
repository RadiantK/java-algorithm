package backjoon2581;

import java.util.Scanner;

public class Back2581 {

	// �������� �Ҽ��� ��, �ּڰ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int min = 10000;
		int sum = 0;
		
		x : for(int i = m; i <= n; i++) {
			
			if(i == 1) {
				continue;
			}
			for(int j = 2; j < i; j++){
				if(i % j == 0) { // 0���� ������ �������� �Ҽ��� �ƴϹǷ� x�� ���ư�
					continue x;
				}
			}		
			sum += i; // �Ҽ��̸� ���� ������
			if(i < min) { // �ּҰ� ����
				min = i;
			}	
		}
		if(sum == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum + "\n" + min);
	}

}
