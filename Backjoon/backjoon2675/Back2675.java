package backjoon2675;

import java.util.Scanner;

public class Back2675 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i =0; i < a; i++) {
			int n = sc.nextInt(); // ���� �ݺ�Ƚ��
			String str = sc.next(); // �����Է�
			
			for(int j=0; j<str.length(); j++) {
				
				for(int k=0; k < n; k++) {
					System.out.print(str.charAt(j)); // j���� n��ŭ �ݺ�
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
