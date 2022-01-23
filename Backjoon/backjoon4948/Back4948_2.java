package backjoon4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back4948_2 {

	// 메모리가 너무 많이 나옴
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int M = Integer.parseInt(br.readLine());
			int N = M * 2;
			
			if(M == 0) {
				br.close();
				break;
			}
			
			int[] nums = new int[(N+1)];
			for(int i=2; i<=N; i++) {
				nums[i] = i;
			}
			
			for(int i=2; i<=Math.sqrt(N); i++) {
				if(nums[i] == 0) { // 소수가 아니면 다음으로
					continue;
				}
				
				for(int j = i+1; j <= N; j++) {
					if(j % i == 0) { // 0으로 나눠지는 값은 소수가 아님
						nums[j] = 0;
					}
				}
			}
			
			int count = 0;
			for(int i = M+1; i <nums.length; i++){
				if(nums[i] != 0)
					count++;
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}