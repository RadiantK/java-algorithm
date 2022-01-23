package backjoon1011;

import java.util.Scanner;

public class Back1011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int dis = y - x; // �̵� �Ÿ�
			int count = 0; // �̵���ġ�� �۵� Ƚ��
			
			// �̵��Ÿ��� �ִ밪�� max�϶� �Ÿ��� ��Ʈ���� ��
			int max = (int)Math.sqrt(dis);
			
			if (max == Math.sqrt(dis)) {  
				count = (max * 2) -1;
			} else if(dis <= (max * max) + max) {
				count = max * 2;
			} else {
				count = max * 2 + 1;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
