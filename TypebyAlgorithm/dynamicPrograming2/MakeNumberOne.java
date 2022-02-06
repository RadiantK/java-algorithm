package dynamicPrograming2;

import java.util.Scanner;

public class MakeNumberOne {

	static int[] dp = new int[30001];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		for(int i = 2; i <= x; i++) {
			
			// ���� ������ 1�� ���� ���
			dp[i] = dp[i-1] + 1;
			// ���� ���� 2�� ������ �������� ���
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
			// ���� ���� 3���� ������ �������� ���
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			// ���� ���� 5�� ������ �������� ���
			if(i % 5 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
		}
		System.out.println(dp[x]);
	}

}
