package backjoon2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2581_2 {

	public static boolean[] prime;
	// �Ҽ� , �����佺�׳׽�
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		// n���ϱ��� ���ϱ� ���ؼ� ũ�⸦ n+1�� ����
		prime = new boolean[n+1];
		isPrime();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = m; i <= n; i++) {
			if(prime[i] == false) { // �Ҽ��̸�
				sum += i;
				if (min == Integer.MAX_VALUE);
				min = i;
			}
		}
		if( sum == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum+"\n"+min);
		
	}
	public static void isPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
	}

}
