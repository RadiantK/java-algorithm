package dynamicPrograming2;

import java.util.Scanner;

public class MakeNumberOne {

	static int[] dp = new int[30001];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		for(int i = 2; i <= x; i++) {
			
			// 현재 수에서 1을 빼는 경우
			dp[i] = dp[i-1] + 1;
			// 현재 수가 2로 나누어 떨어지는 경우
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
			// 현재 수가 3으로 나누어 떨어지는 경우
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			// 현재 수가 5로 나누어 떨어지는 경우
			if(i % 5 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
		}
		System.out.println(dp[x]);
	}

}
