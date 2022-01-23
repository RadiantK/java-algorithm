package backjoon1929;

import java.util.Scanner;

public class Back1929 {

	public static boolean[] prime;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		// n���ϱ��� ���ϱ� ���ؼ� ũ�⸦ n+1�� ����
		prime = new boolean[n+1];
		isPrime();
		
		for(int i = m; i <= n; i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue; // �ߺ��� true���� �Ҽ��� �ƴ����� �ǳʶ�
			}
			for (int j = i * i; j < prime.length; j = j+i) {
				prime[j] = true; //�Ҽ��� �ƴ� ��
			}
		}
		return false;
	}

}
