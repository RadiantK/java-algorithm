package backjoon1152;

import java.util.Scanner;

public class Back1152 {

	// �־��� ���ڿ��� ������ �������� �߶� �ܾ��� ���� ���
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim(); // ó���� �� ���� ����
		sc.close();
	
		if (str.isEmpty()) {
			System.out.println(0); // ���ڿ��� ������� 0 ���
		} else {
			String[] s = str.split(" "); // ������ �������� ����
			System.out.println(s.length);
		}	
	}
}