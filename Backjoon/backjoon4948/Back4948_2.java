package backjoon4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back4948_2 {

	public static boolean[] prime = new boolean[246913];
    
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		get_prime();	// �Ҽ��� ��� �޼ҵ� ����
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				br.close();
				break;	// n �� 0 �ϰ�� ����
			}
            
			int count = 0;	// �Ҽ� ������ �� ����
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}		
	}
	
	// �Ҽ��� ��� �޼ҵ�
	public static void get_prime() {
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� true
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
 
}