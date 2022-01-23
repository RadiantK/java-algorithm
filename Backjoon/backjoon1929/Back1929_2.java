package backjoon1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1929_2 {

	// 범위의 소수 찾기
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		br.close();
		
		boolean[] prime = new boolean[n+1];
		
		prime[0] = prime[1] = true;
		
		for(int i=2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue;
			}
			for(int j = i*i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(prime[i] == false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
