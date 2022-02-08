package bitOperator;

import java.util.Scanner;

// �� ���� ���� 7�� ����� ��
public class BitOperator2 {

	static int N;
	static int[] arr = new int[10];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(solve());
	}
	static int solve() {
		int ret = 0;
		for(int i = 0; i < (1 << N); i++) {
			// �� ���� ���� �ƴϸ� ��ŵ
			if(Integer.bitCount(i) != 2) continue;
			
			int sum = 0;
			for(int j = 0; j < N; j++) {
				if((i & (1 << j)) != 0) {
					sum += arr[j];
				}
			}
			if(sum == 7) ret++;
		}
		return ret;
	}
}
